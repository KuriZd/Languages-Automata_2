# file: ide.py
import tkinter as tk
from tkinter import ttk, filedialog, messagebox
from semantic_core import analyze

SAMPLE = r"""public class NombreClase{
     void hazAlgo(int x  , double f){
     }
     private int x1 ,y   ,z;
     protected double ejemplo(int x, double w, double n)
       {         
          x = ((n+i10-k78)*fg+jk+345);
          int x, v,z, f, g, h;
          double f,g;
          y = ((n+i10-k78)*fg+jk*3.45);
          int x;
       }
       double f   ,g , h;
}
"""

class MiniJavaIDE(tk.Tk):
    def __init__(self):
        super().__init__()
        self.title("MiniJava IDE — ANTLR Semántico")
        self.geometry("980x640")
        self._build_ui()

    def _build_ui(self):
        toolbar = ttk.Frame(self, padding=(6,4))
        toolbar.pack(side=tk.TOP, fill=tk.X)

        btnLoad = ttk.Button(toolbar, text="📂 Cargar", command=self.on_load)
        btnLoad.pack(side=tk.LEFT, padx=4)
        btnCompile = ttk.Button(toolbar, text="⚙ Compilar", command=self.on_compile)
        btnCompile.pack(side=tk.LEFT, padx=4)
        btnSample = ttk.Button(toolbar, text="📝 Ejemplo", command=self.on_sample)
        btnSample.pack(side=tk.LEFT, padx=4)

        paned = ttk.PanedWindow(self, orient=tk.VERTICAL)
        paned.pack(fill=tk.BOTH, expand=True)

        editorFrame = ttk.Frame(paned)
        self.text = tk.Text(editorFrame, wrap='none', undo=True, font=("Consolas", 12))
        self.text.pack(fill=tk.BOTH, expand=True)
        paned.add(editorFrame, weight=3)

        outputFrame = ttk.Frame(paned)
        ttk.Label(outputFrame, text="Salida/Errores:").pack(anchor='w')
        self.out = tk.Text(outputFrame, height=8, wrap='none', font=("Consolas", 11), fg="#b00020")
        self.out.pack(fill=tk.BOTH, expand=True)
        paned.add(outputFrame, weight=1)

        self.text.insert('1.0', SAMPLE)

    def on_sample(self):
        self.text.delete('1.0', tk.END)
        self.text.insert('1.0', SAMPLE)

    def on_load(self):
        path = filedialog.askopenfilename(filetypes=[("MiniJava or Java", "*.java *.txt *.*")])
        if not path:
            return
        try:
            with open(path, 'r', encoding='utf-8') as f:
                code = f.read()
            self.text.delete('1.0', tk.END)
            self.text.insert('1.0', code)
        except Exception as e:
            messagebox.showerror("Error", str(e))

    def on_compile(self):
        code = self.text.get('1.0', tk.END)
        try:
            errors = analyze(code)
        except Exception as e:
            self._write_out("Excepción en análisis:\n"+str(e))
            return
        if not errors:
            self._write_out("Sin errores semánticos.\n")
        else:
            self._write_out("\n".join(str(e) for e in errors)+"\n")

    def _write_out(self, s):
        self.out.delete('1.0', tk.END)
        self.out.insert('1.0', s)

if __name__ == '__main__':
    MiniJavaIDE().mainloop()
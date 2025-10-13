import re

def fix_parser_file(filename):
    with open(filename, 'r', encoding='utf-8') as f:
        content = f.read()
    
    # Corregir múltiples statements en una línea
    pattern = r'(self\.[a-zA-Z_][a-zA-Z_0-9]*\s*=\s*[^;]+;)\s*(self\.[a-zA-Z_][a-zA-Z_0-9]*\s*\([^;]*\);?)'
    replacement = r'\1\n        \2'
    content = re.sub(pattern, replacement, content)
    
    # Corregir indentación de bloques de código
    content = content.replace('; ', ';\n        ')
    
    with open(filename, 'w', encoding='utf-8') as f:
        f.write(content)
    print(f"Fixed {filename}")

if __name__ == "__main__":
    fix_parser_file("MiniJavaParser.py")
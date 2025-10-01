/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.itm.compiler;
import org.antlr.runtime.*; // ANTLRInputStream, CommonTokenStream, RecognitionException, Token, etc.


/**
 *
 * @author Oscar Zamudio
 */
public class EduItmCompiler {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            GUI gui = new GUI();
            gui.setLocationRelativeTo(null);
            gui.setTitle("Analizador semántico");
            gui.setVisible(true);
        });
    }
    
}

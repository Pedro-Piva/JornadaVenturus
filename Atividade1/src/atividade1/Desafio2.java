/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1;
import java.awt.Toolkit;
import java.awt.Dimension;
/**
 *
 * @author pedro
 */
public class Desafio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension dim = tk.getScreenSize();
    System.out.println("Resolucao da Tela: " +dim.width + " x " +dim.height);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex7;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os numeros: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int resultado = (numero1 > numero2 ? numero1 + numero2 : numero1 - numero2);
        System.out.println("Resultado = " + resultado);
        sc.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex7;

import java.awt.BorderLayout;
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
        System.out.println("Calculadora\n\n");
        System.out.print("Informe o primeiro numero: ");
        int numero1 = sc.nextInt();
        System.out.println("\n[1] + Adicao +");
        System.out.println("[2] - Subtracao -");
        System.out.println("[3] x Multiplicacao x");
        System.out.println("[4] / Divisao /\n");
        System.out.print("Informe a Operacao desejada: ");
        int operacao = sc.nextInt();
        System.out.print("\nInforme o segundo Numero: ");
        int numero2 = sc.nextInt();
        switch (operacao) {
            case 1 -> {
                System.out.println("\n\nResultado : " + (numero1 + numero2));
            }
            case 2 -> {
                System.out.println("\n\nResultado : " + (numero1 - numero2));
            }
            case 3 -> {
                System.out.println("\n\nResultado : " + (numero1 * numero2));
            }
            case 4 -> {
                double resultado = (double)numero1/numero2;
                System.out.println("\n\nResultado : " + resultado);
            }
            default -> {
                System.out.println("Informe uma operacao Valida");
            }
        }
        sc.close();
    }

}

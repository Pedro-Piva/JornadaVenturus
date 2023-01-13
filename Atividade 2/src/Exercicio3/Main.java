/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio3;

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
        int a = 0, b = 0, c = 0, d = 0;
        System.out.println("Informe o primeiro valor: ");
        a = sc.nextInt();
        System.out.println("Informe o segundo valor: ");
        b = sc.nextInt();
        System.out.println("Informe o terceiro valor: ");
        c = sc.nextInt();
        System.out.println("Informe o quarto valor: ");
        d = sc.nextInt();
        System.out.println("Diferenca = " + ((a*b) - (c*d)));
        sc.close();
    }

}

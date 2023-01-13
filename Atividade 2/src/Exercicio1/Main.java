/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio1;

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
        int a = 0, b = 0;
        System.out.println("Informe o valor do primeiro numero: ");
        a = sc.nextInt();
        System.out.println("Informe o valor do segundo numero: ");
        b = sc.nextInt();
        int soma = a + b;
        System.out.println("Soma = " + soma);
        sc.close();
    }

}

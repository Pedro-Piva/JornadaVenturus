/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio2;

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
        final double pi = 3.14159;
        System.out.println("Informe o raio da circunferencia: ");
        double raio = sc.nextDouble();
        System.out.print("Area = ");
        System.out.printf("%.4f\n", raio * raio * pi);
        sc.close();
    }

}

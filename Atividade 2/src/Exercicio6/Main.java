/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio6;

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
        double a = 0.0, b = 0.0, c = 0.0;
        System.out.println("Informe o Valor de A: ");
        a = sc.nextDouble();
        System.out.println("Informe o Valor de B: ");
        b = sc.nextDouble();
        System.out.println("Informe o Valor de C: ");
        c = sc.nextDouble();
        System.out.print("Triangulo: ");
        System.out.printf("%.3f\n", (a * c) / 2);
        System.out.print("Circulo: ");
        System.out.printf("%.3f\n", c * c * pi);
        System.out.print("Trapezio: ");
        System.out.printf("%.3f\n", ((a + b) * c) / 2);
        System.out.print("Quadrado: ");
        System.out.printf("%.3f\n", b * b);
        System.out.print("Retangulo: ");
        System.out.printf("%.3f\n", a * b);
        sc.close();
    }

}

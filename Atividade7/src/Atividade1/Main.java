/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

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
        System.out.println("Qual Triangulo eh Maior??\n\n");
        System.out.println("Informe os Lados do primeiro Triangulo:");
        System.out.print("Lado A: ");
        int a = sc.nextInt();
        System.out.print("Lado B: ");
        int b = sc.nextInt();
        System.out.print("Lado C: ");
        int c = sc.nextInt();
        Triangulo um = new Triangulo(a, b, c);
        System.out.println("Informe os Lados do Segundo Triangulo:");
        System.out.print("Lado A: ");
        a = sc.nextInt();
        System.out.print("Lado B: ");
        b = sc.nextInt();
        System.out.print("Lado C: ");
        c = sc.nextInt();
        Triangulo dois = new Triangulo(a, b, c);
        System.out.println("Valor da Area do Primeiro Triangulo: " + um.area());
        System.out.println("Valor da Area do Segundo Triangulo: " + dois.area());
        if(um.area() > dois.area()){
            System.out.println("Area do Primeiro Maior");
        } else {
            System.out.println("Area do Segundo Maior");
        }
    }

}

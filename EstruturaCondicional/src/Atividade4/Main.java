/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade4;

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
        System.out.println("Informe o X: ");
        float x = sc.nextFloat();
        System.out.println("Informe o Y: ");
        float y = sc.nextFloat();
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo X");
        } else if (y == 0) {
            System.out.println("Eixo Y");
        } else {
            if (x > 0) {
                if (y > 0) {
                    System.out.println("Primeiro Quadrante");
                } else {
                    System.out.println("Quarto Quadrante");
                }
            } else {
                if (y > 0) {
                    System.out.println("Segundo Quadrantes");
                } else {
                    System.out.println("Terceiro Quadrante");
                }
            }
        }
        sc.close();
    }

}

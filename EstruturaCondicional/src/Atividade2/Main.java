/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

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
        System.out.println("Informe o raio: ");
        double raio = sc.nextDouble();
        if(raio < 0){
            System.out.println("O valor deve ser positivo");
        } else {
            System.out.println("Area = " + (raio * raio * 3.14159));
        }
        sc.close();
    }

}

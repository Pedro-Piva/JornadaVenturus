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
        System.out.println("Informe a quantidade de dinheiro sobrando: ");
        double dinheiro = sc.nextDouble();
        if (dinheiro >= 30) {
            System.out.println("Va ao Cinema");
        } else {
            System.out.println("Fique em casa vendo TV");
        }
        sc.close();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex4;

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
        int w1 = sc.nextInt();
        float w2 = w1;
        w1 %= 3.33;
        w2 %= 3.33;
        System.out.println("W como Inteiro: " + w1);
        System.out.println("W como Ponto Flutuante: " + w2);
        sc.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex3;

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
        System.out.println("Informe o valor de y");
        float y = sc.nextInt();
        int y1 = (int)y;
        y /= 3;
        y1 /= 3;
        System.out.println("Y com valor flutuante" + y);
        System.out.println("Y como inteiro" + y1);
        sc.close();
    }
    
}

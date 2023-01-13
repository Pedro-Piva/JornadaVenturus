/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex8;

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
        System.out.println("Informe o valor de A: ");
        double a = sc.nextDouble();
        System.out.println("Informe o valor de B: ");
        double b = sc.nextDouble();
        System.out.println("Informe o valor de C: ");
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if(delta > 0){
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("As raizes sao: " + x1 + " e " + x2);
        } else if(delta == 0){
            double x = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("A Raiz eh: " + x);
        }else{
            System.out.println("Nao existem Raizes reais");
        }
        sc.close();
    }

}

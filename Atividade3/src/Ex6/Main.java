/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex6;

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
        System.out.println("Informe o numero: ");
        int numero = sc.nextInt();
        System.out.println((numero >= 10 ? "Maior que 10" : (numero < 5 ? "Numero menor que 5": "Numero maior que 5")));
        sc.close();
    }
    
}

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
        System.out.println("Informe o Salario: ");
        double salario = sc.nextDouble();
        System.out.println("Qual o valor do Financiamento: ");
        double financiamento = sc.nextDouble();
        if ((financiamento / salario) <= 5) {
            System.out.println("Financiamento Concedido");
        } else {
            System.out.println("Financiamento Negado");
        }
        System.out.println("Obrigado por nos consultar");
        sc.close();
    }

}

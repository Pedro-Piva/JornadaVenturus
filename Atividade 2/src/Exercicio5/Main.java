/*;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio5;

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
        int codigo1 = 0, codigo2 = 0, qnt1 = 0, qnt2 = 0;
        double valor1 = 0, valor2 = 0;
        System.out.println("Informe o Codigo da peca 1:  ");
        codigo1 = sc.nextInt();
        System.out.println("Informe o numero de pecas: ");
        qnt1 = sc.nextInt();
        System.out.println("Informe o valor de cada peca: ");
        valor1 = sc.nextDouble();
        System.out.println("Informe o Codigo da peca 2: ");
        codigo2 = sc.nextInt();
        System.out.println("Informe o numero de pecas: ");
        qnt2 = sc.nextInt();
        System.out.println("Informe o valor de cada peca: ");
        valor2 = sc.nextDouble();
        System.out.print("Valor a ser pago: ");
        System.out.printf("R$ %.2f\n" ,(qnt2*valor2 + qnt1*valor1));
        sc.close();
    }

}

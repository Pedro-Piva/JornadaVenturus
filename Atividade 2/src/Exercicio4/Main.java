/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio4;

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
        System.out.println("Informe o Numero do Funcionario: ");
        int numero = sc.nextInt();
        System.out.println("Informe a Quantidade de Horas Trabalhadas: ");
        int horas = sc.nextInt();
        System.out.println("Informe o valor de Hora Trabalhada: ");
        double valor = sc.nextDouble();
        System.out.print("Numero = " + numero + ", Salario = ");
        System.out.printf("R$ %.2f\n", horas * valor);
        sc.close();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex13;

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
        System.out.print("Informe o Salario: R$");
        double salario = sc.nextDouble();
        if(salario < 1903.98){
            System.out.println("Isento de Impostos");
        } else if(salario >= 1903.99 && salario <= 2826.65){
            System.out.print("Imposto de Renda: ");
            System.out.printf("R$%.2f\n" , (salario * 0.075));
        } else if(salario >= 2826.66 && salario <= 3751.05){
            System.out.print("Imposto de Renda: ");
            System.out.printf("R$%.2f\n" , (salario * 0.15));
        } else if(salario >= 3751.05 && salario <= 4664.68){
            System.out.print("Imposto de Renda: ");
            System.out.printf("R$%.2f\n" , (salario * 0.225));
        } else {
            System.out.print("Imposto de Renda: ");
            System.out.printf("R$%.2f\n" , (salario * 0.275));
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade6;

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
        System.out.print("Informe o Nome do Funcionario: ");
        String nome = sc.nextLine();
        System.out.print("Informe o Salario Bruto: ");
        double salario = sc.nextDouble();
        System.out.print("Informe o imposto em %: ");
        double imposto = sc.nextDouble();
        Funcionario fun = new Funcionario(nome, imposto, salario);
        fun.salarioLiquido();
        System.out.print("Informe o Aumento em %: ");
        float aumento = sc.nextFloat();
        fun.aumentoSalario(aumento);
        System.out.println("Nome: " + fun.getNome());
        System.out.print("Salario Bruto: ");
        System.out.printf("%.2f\n", fun.getSalarioBruto());
        System.out.println("Imposto: " + fun.getImposto() + "%");
        fun.salarioLiquido();
        sc.close();
    }
    
}

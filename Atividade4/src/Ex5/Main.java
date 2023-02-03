/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex5;

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
        System.out.println("Informe o seu Nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe o Salario Atual: ");
        int salario = sc.nextInt();
        float porcentagem = 0;
        if (salario >= 0 && salario <= 3) {
            porcentagem = 20;
        } else if(salario >= 4 && salario <= 6){
            porcentagem = 15;
        } else if(salario >= 7 && salario <= 9){
            porcentagem = 12;
        } else if(salario >= 10 && salario <= 12){
            porcentagem = 10;
        } else if(salario > 12 && salario <= 15){
            porcentagem = 7;
        }
        System.out.println("Funcionario: " + nome + "\n" + porcentagem + "% de aumento,\nSalario Atual: " + salario + ",\nSalario Novo: " + (salario * ((porcentagem / 100) + 1)));
        sc.close();
    }

}

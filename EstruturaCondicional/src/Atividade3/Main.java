/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade3;

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
        System.out.println("Informe a sua Idade: ");
        int idade = sc.nextInt();
        if (idade >= 5 && idade <= 10) {
            System.out.println(nome + " Categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " Categoria Juvenil");
        } else if (idade >= 16 && idade <= 20) {
            System.out.println(nome + " Categoria Junior");
        } else if (idade >= 21 && idade <= 25) {
            System.out.println(nome + " Categoria Profissional");
        } else {
            System.out.println(nome + " Nao se encaixa em nenhuma categoria");
        }
        sc.close();
    }

}

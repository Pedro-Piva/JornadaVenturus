/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

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
        System.out.print("Informe o Ano Atual: ");
        Scanner sc = new Scanner(System.in);
        int atual = sc.nextInt();
        System.out.print("Informe o Ano de Nascimento: ");
        int nasc = sc.nextInt();
        int idade = atual - nasc;
        voto(idade);

    }

    public static String voto(int idade) {
        if (idade < 16) {
            return "Nao Pode Votar";
        } else if (idade < 18 || idade > 70) {
            return "Facultativo";
        } else {
            return "Deve Votar";
        }
    }
}

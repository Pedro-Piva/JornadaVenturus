/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Desafio;

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
        System.out.println("!!!!Eleicao para o Lider de Turma!!!!\n\n\n");
        System.out.print("Informe o numeros de alunos a votar: ");
        int alunos = sc.nextInt();
        sc.skip("\n");
        String[] nomes = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o nome do Candidado " + i + ": ");
            nomes[i] = sc.nextLine();
        }
        int total = 0;
        int[] candidatos = new int[5];
        for (int i = 0; i < alunos; i++) {
            System.out.println("1 - Candidato " + nomes[0]);
            System.out.println("2 - Candidato " + nomes[1]);
            System.out.println("3 - Candidato " + nomes[2]);
            System.out.println("4 - Candidato " + nomes[3]);
            System.out.println("5 - Candidato " + nomes[4]);
            System.out.print("Informe o seu Voto: ");
            int voto = sc.nextInt();
            if (voto > 5 || voto < 1) {
                System.out.println("Voto Invalido");
            } else {
                switch (voto) {
                    case 1 -> {
                        candidatos[0]++;
                    }
                    case 2 -> {
                        candidatos[1]++;
                    }
                    case 3 -> {
                        candidatos[2]++;
                    }
                    case 4 -> {
                        candidatos[3]++;
                    }
                    case 5 -> {
                        candidatos[4]++;
                    }
                }
                total++;
                System.out.println("Obrigado por Votar");
            }
        }
        int maior = 0, pos = 0;
        for (int i = 0; i < 5; i++) {
            if (candidatos[i] > maior) {
                maior = candidatos[i];
                pos = i;
            }
        }
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (candidatos[i] == maior) {
                count++;
            }
        }
        if (count >= 2) {
            System.out.print("Empate entre os Candidatos: ");
            for (int i = 0; i < 5; i++) {
                if (candidatos[i] == maior) {
                    System.out.print(nomes[i] + " ");
                }
            }
        } else {
            System.out.println("Candidato vencedor: " + nomes[pos]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Candidato " + nomes[i] + " Votos: " + candidatos[i]);
        }
        System.out.println("Total de Votos Validos: " + total);
        sc.close();
    }

}

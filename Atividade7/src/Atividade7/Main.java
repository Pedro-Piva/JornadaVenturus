/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade7;

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
        System.out.print("Informe o Nome do Aluno: ");
        String nome = sc.nextLine();
        System.out.println("Informe as Notas do Aluno: ");
        System.out.print("Nota 1 : ");
        float nota1 = sc.nextFloat();
        System.out.print("Nota 2 : ");
        float nota2 = sc.nextFloat();
        System.out.print("Nota 3 : ");
        float nota3 = sc.nextFloat();
        Aluno al = new Aluno(nome, nota1, nota2, nota3);
        al.notaFinal();
        sc.close();
    }
    
}

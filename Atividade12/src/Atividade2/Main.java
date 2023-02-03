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
        Scanner sc = new Scanner(System.in);
        Instrutor jose = new Instrutor("Jose");
        jose.addCursos("A");
        jose.addCursos("B");
        jose.addCursos("C");
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o Numero de Alunos no Curso " + jose.getCursos().get(i).getNome() + ":");
            int n = sc.nextInt();
            sc.skip("\n");
            for (int j = 0; j < n; j++) {
                System.out.println("Informe o Aluno: ");
                String nome = sc.nextLine();
                Aluno aluno = new Aluno(nome);
                jose.getCursos().get(i).addAluno(aluno);
            }
        }
        int total = jose.getCursos().get(0).getAlunos().size() + jose.getCursos().get(1).getAlunos().size() + jose.getCursos().get(2).getAlunos().size();
        for (Aluno aluno1 : jose.getCursos().get(0).getAlunos()) {
            for (Aluno aluno : jose.getCursos().get(1).getAlunos()) {
                if (aluno1.getNome().equals(aluno.getNome())) {
                    total--;
                }
            }
            for (Aluno aluno : jose.getCursos().get(2).getAlunos()) {
                if (aluno1.getNome().equals(aluno.getNome())) {
                    total--;
                }
            }
        }
        for (Aluno aluno : jose.getCursos().get(1).getAlunos()) {
            for (Aluno aluno1 : jose.getCursos().get(2).getAlunos()) {
                if (aluno1.getNome().equals(aluno.getNome())) {
                    total--;
                }
            }
        }
        System.out.println("Total de Alunos do Jose: " + total);
    }

}

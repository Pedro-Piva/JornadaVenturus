/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade7;

/**
 *
 * @author pedro
 */
public class Aluno {
    private String nome;
    private float nota1, nota2, nota3;
    public Aluno(String nome, float n1, float n2, float n3){
        this.nome = nome;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public void notaFinal(){
        float notaFinal = nota1 + nota2 + nota3;
        System.out.println("Aluno: " + nome);
        System.out.println("Nota Final: " + notaFinal);
        if(notaFinal < 60){
            System.out.println("REPROVADO");
            System.out.println("Faltam " + (60 - notaFinal) + " Pontos");
        } else {
            System.out.println("APROVADO");
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
}

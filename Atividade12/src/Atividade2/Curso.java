/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;
import java.util.ArrayList;
/**
 *
 * @author pedro
 */
public class Curso {
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList();

    public Curso(String nome) {
        this.nome = nome;
    }
    
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("Aluno: " + aluno.getNome() + " Entrou no Curso " + getNome());
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void removeAluno(String nome){
        for(int i = 0; i < alunos.size(); i++){
            if(alunos.get(i).getNome().equals(nome)){
                alunos.remove(i);
                break;
            }
        }
    }
}

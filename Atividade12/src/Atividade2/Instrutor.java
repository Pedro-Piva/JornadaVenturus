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
public class Instrutor {
    private String nome;
    private ArrayList<Curso> cursos = new ArrayList();

    public Instrutor(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public void addCursos(String nome){
        cursos.add(new Curso(nome));
    }
}

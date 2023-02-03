/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco um = new ContaBanco("CC", "Joao Silva" , 1);
        ContaBanco dois = new ContaBanco("CP", "Maria Silva" , 2);
        um.abrirConta();
        dois.abrirConta();
        um.depositar(300);
        dois.depositar(400);
        um.pagarMensal();
        dois.pagarMensal();
        um.sacar(1000);
        dois.sacar(530);
        um.fecharConta();
        dois.fecharConta();
        um.sacar(338);
        um.fecharConta();
    }

}

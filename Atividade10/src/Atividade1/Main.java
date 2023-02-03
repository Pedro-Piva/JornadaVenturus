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
        Conta normal = new Conta(1001, "Pedro", 5000);
        ContaJuridica juridica = new ContaJuridica(10000, 1002, "Henrique" , 1000);
        normal.deposito();
        normal.saque();
        juridica.deposito();
        juridica.saque();
        juridica.emprestimo();
    }
    
}

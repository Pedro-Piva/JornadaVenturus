/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

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
        System.out.print("Informe o Numero da Conta: ");
        int numero = sc.nextInt();
        System.out.print("Informe o Nome do Proprietario: ");
        sc.skip("\n");
        String nome = sc.nextLine();
        System.out.print("Informe o deposito Inicial, Caso nao tenha coloque 0 : ");
        double deposito = sc.nextDouble();
        Conta nova = new Conta(numero, nome, deposito);
        System.out.println("Conta: " + nova.getNumeroConta() + "\nProprietario: " + nova.getProprietario() + "\nSaldo: " + nova.getSaldo());
        System.out.println("-------------------------");
        nova.depositar(300);
        System.out.println("Conta: " + nova.getNumeroConta() + "\nProprietario: " + nova.getProprietario() + "\nSaldo: " + nova.getSaldo());
        System.out.println("--------------------------");
        nova.sacar(500);
        System.out.println("Conta: " + nova.getNumeroConta() + "\nProprietario: " + nova.getProprietario() + "\nSaldo: " + nova.getSaldo());
        System.out.println("--------------------------");
        sc.close();
    }
    
}

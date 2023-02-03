/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade3;

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
        System.out.print("Informe o Numero: ");
        int numero = sc.nextInt();
        OperacaoMatematica op = new OperacaoMatematica();
        op.setN(numero);
        op.setNumero(numero);
        op.parOuImpar();
        op.parOuImparN();
        op.negativoOuPositivo();
        op.negativoOuPositivoN();
        sc.close();
    }
    
}

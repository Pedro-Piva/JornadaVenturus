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
        Conversor conv = new Conversor();
        System.out.print("Informe a Cotacao do Dolar: ");
        double cotacao = sc.nextDouble();
        System.out.print("Informe o Valor em Dolares a serem Comprados: ");
        double dolares = sc.nextDouble();
        conv.converter(cotacao, dolares);
        sc.close();
    }
    
}

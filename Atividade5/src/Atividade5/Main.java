/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade5;

import java.awt.BorderLayout;
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
        int prodA = 0, prodB = 0, prodC = 0;
        while(true){
            System.out.println("Produto Comprado: ");
            System.out.println("1.Produto A");
            System.out.println("2.Produto B");
            System.out.println("3.Produto C");
            System.out.println("4.Fim");
            System.out.print("Informe a Opcao: ");
            int opcao = sc.nextInt();
            switch(opcao){
                case 1 -> {
                    prodA++;
                }
                case 2 -> {
                    prodB++;
                }
                case 3 -> {
                    prodC++;
                }
                case 4 -> {
                    break;
                }
                default -> {
                    System.out.println("Informe uma Opcao Valida");
                }
            }
            if(opcao == 4){
                break;
            }
        }
        System.out.println("Muito Obrigado");
        System.out.println("Produto A: " + prodA);
        System.out.println("Produto B: " + prodB);
        System.out.println("Produto C: " + prodC);
    }
    
}

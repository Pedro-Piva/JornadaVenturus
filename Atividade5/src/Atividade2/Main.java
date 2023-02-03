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
        String senha = "2023";
        String entrada = "";
        while(!entrada.equals(senha)){
            System.out.print("Informe a Senha: ");
            entrada = sc.nextLine();
            if(!entrada.equals(senha)){
                System.out.println("Senha Invalida\n");
                System.out.println("Tente Novamente\n");
            }
        }
        System.out.println("Acesso Permitido");
    }
    
}

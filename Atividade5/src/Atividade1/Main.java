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
        System.out.println("Numeros Primos\n\n");
        System.out.print("Informe o Numero para Saber se ele eh Primo: ");
        int numero = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                flag = false;
                System.out.println("Nao eh um Numero Primo");
                break;
            }
        }
        if(flag){
            System.out.println("Eh um Numero Primo");
        }
    }
    
}

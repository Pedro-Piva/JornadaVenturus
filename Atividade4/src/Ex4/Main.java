/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex4;

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
        System.out.println("Informe a Primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.println("Informe a Segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.println("Informe a Terceira nota: ");
        float nota3 = sc.nextFloat();
        if ((nota1 + nota2 + nota3) / 3 >= 7) {
            System.out.println("Aluno Aprovado");
        } else if((nota1 + nota2 + nota3) / 3 >= 5){
            System.out.println("Aluno de Recuperacao");
        } else {
            System.out.println("Aluno Reprovado");
        }
        sc.close();
    }

}

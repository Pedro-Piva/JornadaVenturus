/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex6;

import java.util.Scanner;
import javax.xml.transform.OutputKeys;

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
        System.out.println("Programa Solidario");
        System.out.println("Opcoes: ");
        System.out.println("[1] para doar R$10");
        System.out.println("[2] para doar R$25");
        System.out.println("[3] para doar R$50");
        System.out.println("[4] para doar outros valores");
        System.out.println("[5] para cancelar");
        System.out.print("Opcao: ");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1 -> {
                System.out.println("Agradecemos a doacao de R$10,00");
            }
            case 2 -> {
                System.out.println("Agradecemos a doacao de R$25,00");
            }
            case 3 -> {
                System.out.println("Agradecemos a doacao de R$50,00");
            }
            case 4 -> {
                System.out.print("Informe o valor a ser Doado: ");
                double valor = sc.nextDouble();
                System.out.print("Agradecemo s a doacao de R$");
                System.out.printf("%.2f\n", valor);
            }
            case 5 -> {
                System.out.println("Operacao Cancelada");
            }
            default -> System.out.println("Informe uma opcao valida!!");
        }
        sc.close();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex11;

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
        System.out.print("Informe o Valor: ");
        double valor = sc.nextDouble();
        if(valor >= 0 && valor <=25){
            System.out.println("Dentro do Intervalo ([0 - 25])");
        } else if(valor > 25 && valor <= 50){
            System.out.println("Dentro do Intervalo (25 - 50])");
        } else if(valor > 50 && valor <= 75){
            System.out.println("Dentro do Intervalo (50 - 75])");
        } else if(valor > 75 && valor <= 100){
            System.out.println("Dentro do Intervalo (75 - 100])");
        } else{
            System.out.println("Fora do Intervalo");
        }
    }

}

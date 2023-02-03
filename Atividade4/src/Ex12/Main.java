/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex12;

import java.util.Scanner;
import java.util.Random;

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
        System.out.print("Informe o I: ");
        int i = sc.nextInt();
        System.out.print("Informe o A: ");
        double a = sc.nextDouble();
        System.out.print("Informe o B: ");
        double b = sc.nextDouble();
        System.out.print("Informe o C: ");
        double c = sc.nextDouble();
        double maior = 0;
        double meio = 0;
        double menor = 0;
        if(a > b && a > c){
            maior = a;
        } else if(a > b){
            meio = a;
        } else if(a > c){
            meio = a;
        } else{
            menor = a;
        }
        if(b > a && b > c){
            maior = b;
        } else if(b > a){
            meio = b;
        } else if(b > c){
            meio = b;
        } else{
            menor = b;
        }
        if(c > b && c > a){
            maior = c;
        } else if(c > b){
            meio = c;
        } else if(c > a){
            meio = c;
        } else{
            menor = c;
        }
        switch (i) {
            case 1 -> {
                System.out.println(maior + " ; " + meio + " ; " + menor);
            }
            case 2 -> {
                System.out.println(menor + " ; " + meio + " ; " + maior);
            }
            case 3 -> {
                Random rand = new Random();
                int num = rand.nextInt(2);
                System.out.println(num);
                if(num == 0){
                    System.out.println(menor + " ; " + maior + " ; " + meio);
                } else {
                    System.out.println(meio + " ; " + maior + " ; " + menor);
                }
            }
            default -> {
                System.out.println("Informe um valor de I de 1 a 3");
            }
        }
    }

}

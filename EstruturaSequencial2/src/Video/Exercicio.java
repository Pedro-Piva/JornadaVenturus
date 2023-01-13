/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Video;

import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco = sc.nextDouble();
        double precoternario = (preco < 30)? preco * 0.9 : preco * 0.8;
        double precoifelse;
        if(preco < 30){
            precoifelse = preco * 0.9;
        }else{
            precoifelse = preco * 0.8;
        }
        System.out.println("Ternario: " + precoternario);
        System.out.println("If Else: " + precoifelse);
        sc.close();
    }
    
}

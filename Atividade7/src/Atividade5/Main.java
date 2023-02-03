/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade5;

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
        System.out.print("Informe a Largura do Retangulo: ");
        int largura = sc.nextInt();
        System.out.print("Informe a Altura do Retangulo: ");
        int altura = sc.nextInt();
        Retangulo ret = new Retangulo(altura, largura);
        ret.area();
        ret.perimetro();
        ret.diagonal();
        sc.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex5;

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
        System.out.println("Informe os lados do Triangulo: ");
        double ladoA = sc.nextDouble();
        double ladoB = sc.nextDouble();
        double ladoC = sc.nextDouble();
        if((ladoA + ladoB) > ladoC && (ladoA + ladoC) > ladoB && (ladoB + ladoC) > ladoA){
            if(ladoA == ladoB && ladoB == ladoC){
                System.out.println("Triangulo Equilatero");
            } else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
                System.out.println("Triangulo Isoceles");
            } else{
                System.out.println("Triangulo Escaleno");
            }
        }else{
            System.out.println("Nao forma um triangulo");
        }
        sc.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex8;

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
        System.out.println("Calculadora de IMC\n\n");
        System.out.print("Informe sua Altura em m: ");
        double altura = sc.nextDouble();
        System.out.print("\nInforme seu Peso em Kg: ");
        double peso = sc.nextDouble();
        double imc = peso/(altura*altura);
        if(imc < 16){
            System.out.println("Magreza Grave");
        } else if(imc >= 16 && imc < 17){
            System.out.println("Magreza Moderada");
        } else if(imc >= 17 && imc < 18.5){
            System.out.println("Magreza Leve");
        } else if(imc >= 18.5 && imc < 25){
            System.out.println("Saudavel");
        } else if(imc >= 25 && imc < 30){
            System.out.println("Sobrepeso");
        } else if(imc >= 30 && imc < 35){
            System.out.println("Obesidade Grau I");
        } else if(imc >= 35 && imc < 40){
            System.out.println("Obesidade Grau II (Severa)");
        } else{
            System.out.println("Obesidade Grau III (Morbida)");
        }
        sc.close();
    }

}

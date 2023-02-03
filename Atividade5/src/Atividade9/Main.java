package Atividade9;

import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a Massa em gramas: ");
        double pesoinicial = sc.nextDouble();
        double peso = pesoinicial;
        int horas = 0, minutos = 0, segundos = 0;
        while(peso > 0.5){
            peso /= 2;
            segundos += 50;
            if(segundos >= 60){
                minutos += 1;
                segundos -= 60;
                if(minutos >= 60){
                    horas += 1;
                    minutos -= 60;
                }
            }
        }
        System.out.print("Massa Inicial: ");
        System.out.printf("%.2fg\n" , pesoinicial);
        System.out.print("Massa Final: ");
        System.out.printf("%.2fg\n" , peso);
        System.out.println("Tempo calculado: " + horas + ":" + minutos + ":" + segundos);
        sc.close();
    }
    
}

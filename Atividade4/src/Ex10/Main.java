/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex10;

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
        System.out.println("Informe a hora de inicio e a hora do fim do jogo do modo hh:mm:ss");
        System.out.print("Inicio: ");
        String inicio = sc.nextLine();
        System.out.print("Final: ");
        String fim = sc.nextLine();
        String[] splitI = inicio.split(":");
        String[] splitF = fim.split(":");
        int horaI = Integer.parseInt(splitI[0]);
        int horaF = Integer.parseInt(splitF[0]);
        int minI = Integer.parseInt(splitI[1]);
        int minF = Integer.parseInt(splitF[1]);
        int secI = Integer.parseInt(splitI[2]);
        int secF = Integer.parseInt(splitF[2]);
        if (secF >= secI) {
            secF -= secI;
        } else {
            secF += 60 - secI;
            minF--;
        }
        if (minF >= minI) {
            minF -= minI;
        } else {
            minF += 60 - minI;
            horaF--;
        }
        if (horaF >= horaI) {
            horaF -= horaI;
        } else {
            horaF += 24 - horaI;
        }
        System.out.println("\nDuracao: " + horaF + ":" + minF + ":" + secF);
    }

}

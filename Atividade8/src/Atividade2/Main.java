/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro um = new Carro("Vermelho", "Ford" , 2022, 220);
        Carro dois = new Carro("Preto", "Audi" , 2023, 310);
        um.ligar();
        um.pegarMarcha(1);
        um.acelerar();
        um.acelerar();
        um.acelerar();
        um.acelerar();
        um.acelerar();
        um.pegarMarcha(2);
        um.acelerar();
        um.freiar();
        um.freiar();
        um.pegarMarcha(1);
        um.freiar();
        um.freiar();
        um.freiar();
        um.freiar();
        um.pegarMarcha(-1);
        um.acelerar();
        um.desligar();
        um.ligar();
        um.freiar();
        um.pegarMarcha(0);
        um.desligar();
        
        System.out.println("\n\n\n");
        dois.ligar();
        dois.pegarMarcha(1);
        dois.acelerar();
        dois.acelerar();
        dois.acelerar();
        dois.acelerar();
        dois.pegarMarcha(2);
        dois.acelerar();
        dois.acelerar();
        dois.acelerar();
        dois.acelerar();
        dois.pegarMarcha(3);
        for(int i = 0; i < 25; i++){
            dois.acelerar();
        }
        for(int i = 0; i < 23; i++){
            dois.freiar();
        }
        dois.pegarMarcha(1);
        dois.pegarMarcha(2);
        dois.freiar();
        dois.freiar();
        dois.freiar();
        dois.freiar();
        dois.pegarMarcha(1);
        dois.freiar();
        dois.freiar();
        dois.freiar();
        dois.freiar();
        dois.pegarMarcha(0);
        dois.desligar();
    }
    
}

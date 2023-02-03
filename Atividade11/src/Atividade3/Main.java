/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade3;

/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lobo lobo = new Lobo(60, 10, 4, "Cinza");
        Cachorro cachorro = new Cachorro(9, 3, 4, "Caramelo");
        cachorro.reagir("Agressiva");
        cachorro.reagir(6);
        cachorro.reagir(false);
        cachorro.reagir();
    }
    
}

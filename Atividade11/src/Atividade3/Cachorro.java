/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade3;

/**
 *
 * @author pedro
 */
public class Cachorro extends Lobo {

    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au Au");
    }

    public void enterrarOsso() {
        System.out.println("Cava Cava Cava");
        System.out.println("Coloca Osso");
        System.out.println("Enterra");
    }

    public void abanarRabo() {
        System.out.println("Abanando o Rabo");
    }

    public void reagir(String frase) {
        if (frase.equals("Agradavel")) {
            emitirSom();
            abanarRabo();
        } else {
            System.out.println("Rosnando");
        }
    }

    public void reagir(int hora) {
        if (hora >= 5 && hora < 12) {
            abanarRabo();
        } else if (hora >= 12 && hora <= 18) {
            abanarRabo();
            emitirSom();
        } else {
            System.out.println("Ignorou");
        }
    }

    public void reagir(Boolean dono) {
        if (dono) {
            abanarRabo();
        } else {
            System.out.println("Rosnando");
            emitirSom();
        }
    }

    public void reagir() {
        if (getIdade() < 5) {
            if (getPeso() < 10) {
                abanarRabo();
            } else {
                emitirSom();
            }
        } else {
            if (getPeso() < 10) {
                System.out.println("Rosnando");
            } else {
                System.out.println("Ignorou");
            }
        }
    }
}

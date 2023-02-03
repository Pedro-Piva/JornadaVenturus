/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade3;

/**
 *
 * @author pedro
 */
public class OperacaoMatematica {

    protected int n;
    private int numero;
    
    public void parOuImpar() {
        if(n % 2 == 0){
            System.out.println("O Numero: " + n + " eh Par");
        } else {
            System.out.println("O Numero: " + n + " eh Impar");
        }
    }

    public void negativoOuPositivo() {
        if(n >= 0){
            System.out.println("O Numero: " + n + " eh Positivo");
        } else {
            System.out.println("O Numero: " + n + " eh Negativo");
        }
    }
    
    public void parOuImparN() {
        if(numero % 2 == 0){
            System.out.println("O Numero: " + numero + " eh Par");
        } else {
            System.out.println("O Numero: " + numero + " eh Impar");
        }
    }

    public void negativoOuPositivoN() {
        if(numero >= 0){
            System.out.println("O Numero: " + n + " eh Positivo");
        } else {
            System.out.println("O Numero: " + n + " eh Negativo");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

}

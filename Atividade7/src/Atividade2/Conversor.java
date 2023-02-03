/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author pedro
 */
public class Conversor {
    public void converter(double cot, double valor){
        valor *= cot;
        valor *= 1.06;
        System.out.println("Preco em Reais: " + valor);
    }
}

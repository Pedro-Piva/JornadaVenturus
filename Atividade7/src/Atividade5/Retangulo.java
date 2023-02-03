/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade5;

/**
 *
 * @author pedro
 */
public class Retangulo {

    private int altura;
    private int largura;

    public Retangulo(int a, int l) {
        this.altura = a;
        this.largura = l;
    }

    public void area() {
        System.out.println("Area = " + altura * largura);
    }

    public void diagonal() {
        System.out.println("Diagonal = " + Math.sqrt((altura * altura) + (largura * largura)));
    }

    public void perimetro() {
        System.out.println("Perimetro = " + (altura * 2 + largura * 2));
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
}

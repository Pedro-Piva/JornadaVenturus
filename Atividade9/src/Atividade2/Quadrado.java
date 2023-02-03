/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author pedro
 */
public class Quadrado implements Figura{
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }
    
    @Override
    public void getNomeFigura() {
        System.out.println("Quadrado");
    }

    @Override
    public void getArea() {
        System.out.println("Area = " + lado * lado);
    }

    @Override
    public void getPerimetro() {
        System.out.println("Perimetro = " + lado * 4);
    }
}

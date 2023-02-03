/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author pedro
 */
public class Triangulo implements Figura {

    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(int base, int altura, int ladoA, int ladoB, int ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public void getNomeFigura() {
        System.out.println("Triangulo");
    }

    @Override
    public void getArea() {
        System.out.println("Area = " + (base * altura) / 2);
    }

    @Override
    public void getPerimetro() {
        System.out.println("Perimetro = " +(ladoA + ladoB + ladoC));
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

}

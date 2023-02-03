/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author pedro
 */
public class Triangulo {

    private int ladoA;
    private int ladoB;
    private int ladoC;

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public Triangulo(int a, int b, int c) {
        this.ladoA = a;
        this.ladoB = b;
        this.ladoC = c;
    }

    public double area() {
        double area = 0;
        int semiPerimetro = (ladoA + ladoB + ladoC) / 2;
        area = Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC));
        return area;
    }
}

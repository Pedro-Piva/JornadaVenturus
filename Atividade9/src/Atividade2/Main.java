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
        Quadrado quadrado = new Quadrado(5);
        Triangulo triangulo = new Triangulo(4, 3, 3, 4, 5);
        System.out.println("-----------------");
        quadrado.getNomeFigura();
        quadrado.getArea();
        quadrado.getPerimetro();
        System.out.println("-----------------");
        triangulo.getNomeFigura();
        triangulo.getArea();
        triangulo.getPerimetro();
        System.out.println("-----------------");
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author pedro
 */
public class Circulo extends Forma{
    private int raio;
    final double pi = 3.14159;

    public Circulo(int raio, Cor cor) {
        super(cor);
        this.raio = raio;
    }
    @Override
    public void area(){
        System.out.println("Area do Circulo = " + (raio * raio) * pi);
    }
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author pedro
 */
public class Retangulo extends Forma{
    private int altura;
    private int largura;

    public Retangulo(int altura, int largura, Cor cor) {
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }
    
    @Override
    public void area(){
        System.out.println("Area do Retangulo = " + altura * largura);
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

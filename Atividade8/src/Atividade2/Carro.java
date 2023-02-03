/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author pedro
 */
public class Carro {

    private String cor;
    private String marca;
    private int ano;
    private int marcha;
    private boolean ligado;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public Carro(String cor, String marca, int ano, int velocidadeMaxima) {
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
        this.ligado = false;
        this.marcha = 0;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("Carro Ja esta Ligado");
        } else {
            System.out.println("Carro Esta Ligado");
            ligado = true;
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Carro esta Desligado");
        } else {
            System.out.println("Carro Ja esta Desligado");
        }
    }

    public void acelerar() {
        if (ligado) {
            switch (marcha) {
                case -1 -> {
                    if (velocidadeAtual <= 0) {
                        velocidadeAtual -= 10;
                        System.out.println("Velocidade Atual: " + velocidadeAtual);
                    } else {
                        System.out.println("Desacelerar para Utilizar a Marcha Re");
                    }
                }
                case 0 -> {
                    System.out.println("Nao eh possivel acelerar no ponto morto");
                }
                case 1 -> {
                    if (velocidadeAtual >= 0 && velocidadeAtual < 40) {
                        velocidadeAtual += 10;
                        System.out.println("Velocidade Atual: " + velocidadeAtual);
                    } else {
                        System.out.println("Trocar para a Marcha Adequada");
                        System.out.println("Velocidade Atual: " + velocidadeAtual);
                    }
                }
                case 2 -> {
                    if (velocidadeAtual >= 40 && velocidadeAtual <= 80) {
                        velocidadeAtual += 10;
                        System.out.println("Velocidade Atual: " + velocidadeAtual);
                    } else {
                        System.out.println("Trocar para a Marcha Adequada");
                        System.out.println("Velocidade Atual: " + velocidadeAtual);
                    }
                }
                case 3 -> {
                    if (velocidadeAtual >= 80) {
                        if (velocidadeMaxima > (velocidadeAtual + 10)) {
                            velocidadeAtual += 10;
                            System.out.println("Velocidade Atual: " + velocidadeAtual);
                        } else {
                            velocidadeAtual = velocidadeMaxima;
                            System.out.println("Velocidade Atual: " + velocidadeAtual);
                            System.out.println("Velocidade MAXIMA!!");
                        }
                    } else {
                        System.out.println("Trocar para a Marcha Adequada");
                        System.out.println("Velocidade Atual: " + velocidadeAtual);
                    }
                }
            }
        } else {
            System.out.println("Carro Desligado");
        }
    }

    public void freiar() {
        if (ligado) {
            switch (marcha) {
                case -1 -> {
                    if (velocidadeAtual <= 0) {
                        velocidadeAtual += 10;
                        if (velocidadeAtual > 0) {
                            velocidadeAtual = 0;
                        }
                        System.out.println("Velocidade Atual: " + velocidadeAtual);
                    }
                }
                case 0 -> {
                    velocidadeAtual -= 10;
                    if (velocidadeAtual < 0) {
                        velocidadeAtual = 0;
                    }
                    System.out.println("Velocidade Atual: " + velocidadeAtual);
                }
                case 1 -> {
                    velocidadeAtual -= 10;
                    if (velocidadeAtual < 0) {
                        velocidadeAtual = 0;
                    }
                    System.out.println("Velocidade Atual: " + velocidadeAtual);
                }
                case 2 -> {
                    velocidadeAtual -= 10;
                    if (velocidadeAtual < 40) {
                        velocidadeAtual = 40;
                        System.out.println("Trocar de Marcha!");
                    }
                    System.out.println("Velocidade Atual: " + velocidadeAtual);
                }
                case 3 -> {
                    velocidadeAtual -= 10;
                    if (velocidadeAtual < 80) {
                        velocidadeAtual = 80;
                        System.out.println("Trocar de Marcha!");
                    }
                    System.out.println("Velocidade Atual: " + velocidadeAtual);
                }
            }
        } else {
            System.out.println("Carro Desligado");
        }
    }

    public void pegarMarcha(int numero) {
        if (ligado) {
            switch (numero) {
                case -1 -> {
                    if (velocidadeAtual <= 0) {
                        System.out.println("Marcha Re");
                        System.out.println("Velocidade Atual: " + velocidadeAtual);
                        marcha = -1;
                    } else {
                        System.out.println("Velocidade Incompativel com a Marcha");
                    }
                }
                case 0 -> {
                    if (velocidadeAtual == 0) {
                        System.out.println("Ponto Morto");
                        System.out.println("Velocidade Atual: " + velocidadeAtual);
                        marcha = 0;
                    } else {
                        System.out.println("Velocidade Incompativel com a Marcha");
                    }
                }
                case 1 -> {
                    if (velocidadeAtual >= 0 && velocidadeAtual <= 40) {
                        System.out.println("Media");
                        System.out.println("Velocidade Atual: " + velocidadeAtual);
                        marcha = 1;
                    } else {
                        System.out.println("Velocidade Incompativel com a Marcha");
                    }
                }
                case 2 -> {
                    if (velocidadeAtual >= 40 && velocidadeAtual <= 80) {
                        System.out.println("Alta");
                        System.out.println("Velocidade Atual: " + velocidadeAtual);
                        marcha = 2;
                    } else {
                        System.out.println("Velocidade Incompativel com a Marcha");
                    }
                }
                case 3 -> {
                    if (velocidadeAtual >= 80) {
                        System.out.println("Final");
                        System.out.println("Velocidade Atual: " + velocidadeAtual);
                        marcha = 3;
                    } else {
                        System.out.println("Velocidade Incompativel com a Marcha");
                    }
                }
                default -> {
                    System.out.println("Marchas de -1 a 3");
                }
            }
        } else {
            System.out.println("Carro Desligado");
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}

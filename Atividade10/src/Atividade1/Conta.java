/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Conta {

    private int numeroConta;
    private String proprietario;
    private double balanco;

    public Conta(int numeroConta, String proprietario, double balanco) {
        this.numeroConta = numeroConta;
        this.proprietario = proprietario;
        this.balanco = balanco;
    }

    public void deposito() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor a ser Depositado: ");
        this.balanco += sc.nextDouble();
        System.out.println("Balanco Atual: " + balanco);
    }

    public void saque() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor a ser Sacado: ");
        this.balanco -= sc.nextDouble();
        System.out.println("Balanco Atual: " + balanco);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getBalanco() {
        return balanco;
    }

    public void setBalanco(double balanco) {
        this.balanco = balanco;
    }

}

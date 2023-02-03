/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author pedro
 */
public class Conta implements ControleConta {

    protected final int numeroConta;
    private String proprietario;
    protected double saldo;

    public Conta(int numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.proprietario = nome;
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        double balance = getSaldo();
        balance -= valor;
        balance -= 5;
        setSaldo(balance);
    }

    @Override
    public void depositar(double valor) {
        setSaldo(valor + getSaldo());
    }

    private void setSaldo(double valor){
        this.saldo = valor;
    }
    
    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}

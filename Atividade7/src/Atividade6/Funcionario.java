/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade6;

/**
 *
 * @author pedro
 */
public class Funcionario {

    private String nome;
    private double imposto;
    private double salarioBruto;

    public Funcionario(String nome, double imposto, double salarioBruto) {
        this.nome = nome;
        this.imposto = imposto;
        this.salarioBruto = salarioBruto;
    }

    public void salarioLiquido() {
        System.out.print("Salario Liquido = ");
        System.out.printf("%.2f\n", salarioBruto * ((100 - imposto) / 100));
    }

    public void aumentoSalario(float porcentagem) {
        this.salarioBruto = (porcentagem/100 + 1) * salarioBruto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

}

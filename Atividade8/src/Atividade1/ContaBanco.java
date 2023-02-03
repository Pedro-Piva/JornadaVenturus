/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author pedro
 */
public class ContaBanco {

    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(String type, String nome, int numero) {
        this.tipo = type;
        this.dono = nome;
        this.numConta = numero;
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta() {
        if (status == true) {
            System.out.println(dono);
            System.out.println("Conta Ja Aberta!!\n");
        } else {
            switch (tipo) {
                case "CC" -> {
                    this.saldo += 50;
                    this.status = true;
                }
                case "CP" -> {
                    this.saldo += 150;
                    this.status = true;
                }
                default ->
                    System.out.println("Tipo Nao Reconhecido");
            }
            System.out.println(dono);
            System.out.println("Conta Aberta com Sucesso\n");
        }
    }

    public void fecharConta() {
        if (saldo == 0) {
            status = true;
            System.out.println(dono);
            System.out.println("Conta Fechada com sucesso\n");
        } else {
            System.out.println(dono);
            System.out.println("Nao eh Possivel Fechar a conta, Saldo Diferente de 0\n");
        }
    }

    public void sacar(double quantia) {
        if (status) {
            if (saldo >= quantia) {
                saldo -= quantia;
                System.out.println(dono);
                System.out.println("Saque Concluido");
                System.out.print("Saldo Atual: ");
                System.out.printf("%.2f\n\n", saldo);
            } else {
                System.out.println(dono);
                System.out.println("Saldo Insuficiente");
                System.out.print("Saldo Atual: ");
                System.out.printf("%.2f\n\n", saldo);
            }
        } else {
            System.out.println(dono);
            System.out.println("Conta nao esta aberta\n");
        }
    }

    public void depositar(double quantia) {
        if (status) {
            if (quantia < 0) {
                System.out.println(dono);
                System.out.println("Nao eh Possivel Depositar um Valor Negativo\n");
            } else {
                saldo += quantia;
                System.out.println(dono);
                System.out.println("Deposito Concluido");
                System.out.print("Saldo Atual: ");
                System.out.printf("%.2f\n\n", saldo);
            }
        } else {
            System.out.println(dono);
            System.out.println("Conta Nao esta Aberta\n");
        }
    }

    public void pagarMensal() {
        if (status) {
            switch (tipo) {
                case "CC" -> {
                    saldo -= 12;
                    System.out.println(dono);
                    System.out.print("Saldo Atual: ");
                    System.out.printf("%.2f\n\n", saldo);
                }
                case "CP" -> {
                    saldo -= 20;
                    System.out.println(dono);
                    System.out.print("Saldo Atual: ");
                    System.out.printf("%.2f\n\n", saldo);
                }
                default -> {
                    System.out.println(dono);
                    System.out.println("Tipo de Conta Invalida\n");
                }
            }
        } else {
            System.out.println(dono);
            System.out.println("Conta nao esta aberta\n");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

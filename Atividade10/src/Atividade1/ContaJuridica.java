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
public class ContaJuridica extends Conta{
    private double limiteEmprestimo;

    public ContaJuridica(double limiteEmprestimo, int numeroConta, String proprietario, double balanco) {
        super(numeroConta, proprietario, balanco);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o Valor do Emprestimo: ");
        double valor = sc.nextDouble();
        if(valor > limiteEmprestimo){
            System.out.println("Nao possui Limite!");
        } else {
            this.setBalanco(valor + this.getBalanco() - 10);
            System.out.println("Emprestimo Concluido\nBalanco Atual: " + this.getBalanco());
        }
    }
    
    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
}

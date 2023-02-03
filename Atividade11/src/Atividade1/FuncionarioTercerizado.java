/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author pedro
 */
public class FuncionarioTercerizado extends Funcionario{
    private double despesaAdicional;

    public FuncionarioTercerizado(double despesaAdicional, String nome, int horas, double valorPorHora) {
        super(nome, horas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }
    @Override
    public void pagamento(){
        double pagamento = getHoras() * getValorPorHora();
        pagamento += (1.1 * despesaAdicional);
        System.out.println("Funcionario Tercerizado " + getNome() + "\nPagamento: " + pagamento);
    }
    public double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }
    
}

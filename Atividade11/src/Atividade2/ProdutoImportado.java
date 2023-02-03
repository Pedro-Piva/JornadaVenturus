/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author pedro
 */
public class ProdutoImportado extends Produto {

    private double taxaAlfandega;

    public ProdutoImportado(double taxaAlfandega, String nome, double preco) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public void etiquetaPreco() {
        System.out.print("Produto: " + getNome());
        System.out.printf(" R$ %.2f (Taxa Alfandega: R$ %.2f)\n", getPreco() + taxaAlfandega, taxaAlfandega);
    }

    public void precoTotal() {
        System.out.printf("R$ %.2f ", getPreco() + taxaAlfandega);
    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

}

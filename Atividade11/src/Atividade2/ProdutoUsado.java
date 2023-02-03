/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author pedro
 */
public class ProdutoUsado extends Produto{
    private String dataFabricacao;

    public ProdutoUsado(String dataFabricacao, String nome, double preco) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }
    @Override
    public void etiquetaPreco(){
        System.out.print("Produto: " + getNome());
        System.out.printf("(usado)R$ %.2f (Data de Fabricacao: %s)\n", getPreco(), dataFabricacao);
    }
    
    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
}

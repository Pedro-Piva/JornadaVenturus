package Desafio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a Quantidade de Produtos: ");
        int produtos = sc.nextInt();
        for (int i = 0; i < produtos; i++) {
            System.out.print("Informe o Preco do Produto: ");
            double preco = sc.nextDouble();
            System.out.print("Informe a Categoria (1 - Limpeza; 2 - Alimentacao 3 - vestuario) do Produto: ");
            int categoria = sc.nextInt();
            System.out.print("Informe a Situacao(R - Refrigerados; N - nao Refrigerados) do Produto: ");
            String situacao = sc.next();
            Produto p1 = new Produto(preco, categoria, situacao);
            p1.reajuste();
            System.out.print("Preco com Aumento: ");
            System.out.printf("R$%.2f\n", p1.getPreco());
            p1.desconto();
            System.out.print("Preco com Desconto: ");
            System.out.printf("R$%.2f\n", p1.getPreco());
            p1.classificacao();
        }
    }

}

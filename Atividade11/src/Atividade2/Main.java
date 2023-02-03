/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList();
        boolean WHILE = true;
        while (WHILE) {
            System.out.print("1 - Adicionar Produto\n2 - Adicionar Produto Usado\n3 - Adicionar Produto Importado\n0 - Sair\nOpcao: ");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 0 -> {
                    WHILE = false;
                }
                case 1 -> {
                    System.out.print("Informe o Nome do Produto: ");
                    sc.skip("\n");
                    String nome = sc.nextLine();
                    System.out.print("Informe o Preco do Produto: ");
                    double valor = sc.nextDouble();
                    produtos.add(new Produto(nome, valor));
                }
                case 2 -> {
                    System.out.print("Informe o Nome do Produto: ");
                    sc.skip("\n");
                    String nome = sc.nextLine();
                    System.out.print("Informe a Data de Fabricacao do Produto: ");
                    String data = sc.nextLine();
                    System.out.print("Informe o Preco do Produto: ");
                    double valor = sc.nextDouble();
                    produtos.add(new ProdutoUsado(data, nome, valor));
                }
                case 3 -> {
                    System.out.print("Informe o Nome do Produto: ");
                    sc.skip("\n");
                    String nome = sc.nextLine();
                    System.out.print("Informe o Preco do Produto: ");
                    double valor = sc.nextDouble();
                    System.out.print("Informe a Taxa de Alfandega do Produto: ");
                    double alfandega = sc.nextDouble();
                    produtos.add(new ProdutoImportado(alfandega, nome, valor));
                }
                default -> {
                    System.out.println("Informe uma Opcao Valida");
                }
            }
        }
        System.out.println("-------------------");
        for (Produto produto : produtos) {
            produto.etiquetaPreco();
            System.out.println("-------------------");
        }
    }

}

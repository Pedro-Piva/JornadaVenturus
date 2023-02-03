/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade4;

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
        ArrayList<Itens> cardapio = new ArrayList();
        cardapio.add(new Itens(1, "Cachorro Quente", 7.00));
        cardapio.add(new Itens(2, "X-Salada", 9.00));
        cardapio.add(new Itens(3, "X-Bacon", 11.00));
        cardapio.add(new Itens(4, "Torrada", 5.00));
        cardapio.add(new Itens(5, "Refrigerante", 4.00));
        System.out.print("Informe o Codigo do Produto: ");
        int codigo = sc.nextInt();
        System.out.print("Informe a Quantidade: ");
        int qnt = sc.nextInt();
        int posicao = 0;
        for(int i = 0; i < cardapio.size(); i++){
            if(cardapio.get(i).getCodigo() == codigo){
                posicao = i;
                break;
            }
        }
        double conta = cardapio.get(posicao).getPreco() * qnt;
        System.out.print("Total a ser Pago: ");
        System.out.printf("%.2f\n", conta);
        sc.close();
    }
    
}

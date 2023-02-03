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
        ArrayList<Forma> figuras = new ArrayList();
        System.out.print("Informe o Numero de Figuras: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("1 - Circulo\n2 - Retangulo\nOpcao: ");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> {
                    System.out.println("Informe a cor: ");
                    System.out.print("Vermelho, Preto e Azul: ");
                    sc.skip("\n");
                    switch (sc.nextLine()) {
                        case "Vermelho" -> {
                            System.out.print("Informe o Raio: ");
                            figuras.add(new Circulo(sc.nextInt(), Cor.RED));
                        }
                        case "Preto" -> {
                            System.out.print("Informe o Raio: ");
                            figuras.add(new Circulo(sc.nextInt(), Cor.BLACK));
                        }
                        case "Azul" -> {
                            System.out.print("Informe o Raio: ");
                            figuras.add(new Circulo(sc.nextInt(), Cor.BLUE));
                        }
                        default -> {
                            System.out.println("Informe uma opcao Valida!");
                            i--;
                            break;
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Informe a cor: ");
                    System.out.print("Vermelho, Preto e Azul: ");
                    sc.skip("\n");
                    switch (sc.nextLine()) {
                        case "Vermelho" -> {
                            System.out.print("Informe a Altura: ");
                            int altura = sc.nextInt();
                            System.out.print("Informe a Largura: ");
                            int largura = sc.nextInt();
                            figuras.add(new Retangulo(altura, largura, Cor.RED));
                        }
                        case "Preto" -> {
                            System.out.print("Informe a Altura: ");
                            int altura = sc.nextInt();
                            System.out.print("Informe a Largura: ");
                            int largura = sc.nextInt();
                            figuras.add(new Retangulo(altura, largura, Cor.BLACK));
                        }
                        case "Azul" -> {
                            System.out.print("Informe a Altura: ");
                            int altura = sc.nextInt();
                            System.out.print("Informe a Largura: ");
                            int largura = sc.nextInt();
                            figuras.add(new Retangulo(altura, largura, Cor.BLUE));
                        }
                        default -> {
                            System.out.println("Informe uma opcao Valida!");
                            i--;
                            break;
                        }
                    }
                }
                default -> {
                    System.out.println("Informe uma opcao Valida!");
                    i--;
                }
            }
        }
        System.out.println("--------------------");
        for (Forma figura : figuras) {
            figura.area();
            System.out.println("--------------------");
        }
    }

}

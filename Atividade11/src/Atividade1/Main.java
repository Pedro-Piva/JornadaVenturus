/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.ArrayList;
import java.util.Scanner;

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
        ArrayList<Funcionario> funcionarios = new ArrayList();
        boolean WHILE = true;
        while (WHILE) {
            System.out.print("1 - Adicionar Funcionario\n2 - Adicionar Funcionario Tercerizado\n0 - Sair\nOpcao: ");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 0 -> {
                    WHILE = false;
                }
                case 1 -> {
                    System.out.print("Informe o Nome do Funcionario: ");
                    sc.skip("\n");
                    String nome = sc.nextLine();
                    System.out.print("Informe o Numero de Horas Trabalhadas: ");
                    int horas = sc.nextInt();
                    System.out.print("Informe o Valor por Hora: ");
                    double valor = sc.nextDouble();
                    funcionarios.add(new Funcionario(nome, horas, valor));
                }
                case 2 -> {
                    System.out.print("Informe o Nome do Funcionario: ");
                    sc.skip("\n");
                    String nome = sc.nextLine();
                    System.out.print("Informe o Numero de Horas Trabalhadas: ");
                    int horas = sc.nextInt();
                    System.out.print("Informe o Valor por Hora: ");
                    double valor = sc.nextDouble();
                    System.out.print("Informe a Despeza Adicional: ");
                    double despeza = sc.nextDouble();
                    funcionarios.add(new FuncionarioTercerizado(despeza, nome, horas, valor));
                }
                default -> {
                    System.out.println("Informe uma Opcao Valida");
                }
            }
        }
        System.out.println("-------------------");
        for(Funcionario funcionario: funcionarios){
            funcionario.pagamento();
            System.out.println("-------------------");
        }
    }

}

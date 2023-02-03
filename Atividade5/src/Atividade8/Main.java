package Atividade8;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float media = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Informe o Nome do Aluno: ");
            String aluno1 = sc.nextLine();
            System.out.print("Informe a Primeira nota do " + aluno1 + ": ");
            float notaA1 = sc.nextFloat();
            System.out.print("Informe a Segunda nota do " + aluno1 + ": ");
            float notaA12 = sc.nextFloat();
            sc.skip("\n");
            media += (notaA1 + notaA12) / 2;
            if ((notaA12 + notaA1) / 2 >= 6) {
                System.out.println("Aluno " + aluno1 + " Aprovado");
            } else {
                System.out.println("Aluno " + aluno1 + " Reprovado");
            }
        }
        media /= 3;
        System.out.println("Media Final da turma: " + media);
        sc.close();
    }

}

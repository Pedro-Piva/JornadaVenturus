/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade3;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        System.out.print("Informe o caminho do Arquivo: ");
        String caminho = sc.nextLine();
        File file = new File(caminho);
        ArrayList<Candidato> candidatos = new ArrayList();
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] s = sc.nextLine().split(",");
                boolean existe = false;
                int pos = 0;
                for (int i = 0; i < candidatos.size(); i++) {
                    if (candidatos.get(i).getNome().equals(s[0])) {
                        pos = i;
                        existe = true;
                    }
                }
                if (existe) {
                    candidatos.get(pos).addVotos(Integer.parseInt(s[1]));
                } else {
                    candidatos.add(new Candidato(s[0], Integer.parseInt(s[1])));
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(Candidato c: candidatos){
            System.out.println(c.getNome() + ": " + c.getVotos());
        }
    }

}

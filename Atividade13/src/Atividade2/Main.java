/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String caminho = sc.nextLine();
        File file = new File(caminho);
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] s = sc.nextLine().split(",");
                produtos.add(new Produto(s[0], Double.parseDouble(s[1])));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        double medio = 0;
        for (Produto p : produtos) {
            medio += p.getPreco();
        }
        medio /= produtos.size();
        System.out.println("Preco Medio: " + medio);
        Comparator<Produto> comp = (p1, p2) -> {
            return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
        };
        List<Produto> lista = new ArrayList();
        for (Produto p : produtos) {
            if (p.getPreco() < medio) {
                lista.add(p);
            }
        }
        lista.sort(comp);
        for (Produto p : lista) {
            System.out.println(p.getNome());
        }
    }

}

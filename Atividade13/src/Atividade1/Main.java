package Atividade1;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> listaO = new ArrayList();
        listaO.add(3);
        listaO.add(4);
        listaO.add(5);
        listaO.add(10);
        listaO.add(7);
        listaO.add(14);
        listaO.add(16);
        List<Integer> list = listaO.stream().collect(Collectors.toList());
        Consumer<Integer> cons = (Integer i) -> list.set(list.indexOf(i), i * 10);
        list.forEach(cons);
        System.out.println(list);
        List<Integer> lista = listaO.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());
        cons = (Integer i) -> lista.set(lista.indexOf(i), i * 20);
        lista.forEach(cons);
        System.out.println(lista);
    }

    public void aumento() {

    }
}

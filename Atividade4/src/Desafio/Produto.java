package Desafio;

public class Produto {

    private double preco;
    private int categoria;
    private String situacao;

    public Produto(double price, int cat, String sit) {
        this.preco = price;
        this.categoria = cat;
        this.situacao = sit;
    }

    public double getPreco() {
        return preco;
    }

    public int getCat() {
        return categoria;
    }

    public String getSit() {
        return situacao;
    }

    public void reajuste() {
        if (this.preco <= 25) {
            switch (categoria) {
                case 1 -> {
                    this.preco *= 1.05;
                }
                case 2 -> {
                    this.preco *= 1.08;
                }
                case 3 -> {
                    this.preco *= 1.1;
                }
            }
        } else {
            switch (categoria) {
                case 1 -> {
                    this.preco *= 1.12;
                }
                case 2 -> {
                    this.preco *= 1.15;
                }
                case 3 -> {
                    this.preco *= 1.18;
                }
            }
        }
    }

    public void desconto() {
        if (this.categoria == 2 && this.situacao.equals("R")) {
            this.preco *= 0.92;
        } else if (this.categoria == 2) {
            this.preco *= 0.95;
        } else if (this.situacao.equals("R")) {
            this.preco *= 0.95;
        } else {
            System.out.println("Nao Ha Desconto");
        }
    }

    public void classificacao() {
        if (this.preco <= 50) {
            System.out.println("Barato");
        } else if (this.preco > 50 && this.preco < 120) {
            System.out.println("Normal");
        } else {
            System.out.println("Caro");
        }
    }
}

package com.pedropareschi.classes;

public class Mineral {
    private String densidade;
    private double preco;
    private String cor;
    private boolean magnetismo;
    private Elemento[] elementos;
    private Minerio[] minerios;

    public Mineral() {
    }

    public Mineral(String densidade, double preco, String cor, boolean magnetismo, Elemento[] elementos) {
        this.densidade = densidade;
        this.preco = preco;
        this.cor = cor;
        this.magnetismo = magnetismo;
        this.elementos = elementos;
    }

    public String getDensidade() {
        return densidade;
    }

    public void setDensidade(String densidade) {
        this.densidade = densidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isMagnetismo() {
        return magnetismo;
    }

    public void setMagnetismo(boolean magnetismo) {
        this.magnetismo = magnetismo;
    }

    public Elemento[] getElementos() {
        return elementos;
    }

    public void setElementos(Elemento[] elementos) {
        this.elementos = elementos;
    }

    public Minerio[] getMinerios() {
        return minerios;
    }

    public void setMinerios(Minerio[] minerios) {
        this.minerios = minerios;
    }
}

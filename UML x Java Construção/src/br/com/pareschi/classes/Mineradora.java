package com.pedropareschi.classes;

public class Mineradora {
    private String nome;
    private String cnpj;
    private Minerio[] minerios;

    public Mineradora() {
    }

    public Mineradora(String nome, String cnpj, Minerio[] minerios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.minerios = minerios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Minerio[] getMinerios() {
        return minerios;
    }

    public void setMinerios(Minerio[] minerios) {
        this.minerios = minerios;
    }
}

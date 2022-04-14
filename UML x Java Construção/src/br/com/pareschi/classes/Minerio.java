package com.pedropareschi.classes;

public class Minerio {
    private String endereco;
    private Mineral mineral;
    private Minerador[] mineradores;
    private String mineradora;

    public Minerio() {
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Mineral getMineral() {
        return mineral;
    }

    public void setMineral(Mineral mineral) {
        this.mineral = mineral;
    }

    public Minerador[] getMineradores() {
        return mineradores;
    }

    public void setMineradores(Minerador[] mineradores) {
        this.mineradores = mineradores;
    }

    public String getMineradora() {
        return mineradora;
    }

    public void setMineradora(String mineradora) {
        this.mineradora = mineradora;
    }
}

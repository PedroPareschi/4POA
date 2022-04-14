package com.pedropareschi.classes;

public class Elemento {
    private String nome;
    private String simbolo;
    private double massaAtomica;
    private int numeroAtomico;

    public Elemento() {
    }

    public Elemento(String nome, String simbolo, double massaAtomica, int numeroAtomico) {
        this.nome = nome;
        this.simbolo = simbolo;
        this.massaAtomica = massaAtomica;
        this.numeroAtomico = numeroAtomico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public double getMassaAtomica() {
        return massaAtomica;
    }

    public void setMassaAtomica(double massaAtomica) {
        this.massaAtomica = massaAtomica;
    }

    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    public void setNumeroAtomico(int numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }
}

package com.pedropareschi.classes;

public class Minerador {
    private String nome;
    private String cpf;
    private Minerio minerio;

    public Minerador() {
    }

    public Minerador(String nome, String cpf, Minerio minerio) {
        this.nome = nome;
        this.cpf = cpf;
        this.minerio = minerio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Minerio getMinerio() {
        return minerio;
    }

    public void setMinerio(Minerio minerio) {
        this.minerio = minerio;
    }
}

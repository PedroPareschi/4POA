package br.com.pedropareschi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Paralelepipedo {
    private double arestaA;
    private double arestaB;
    private double arestaC;

    public Paralelepipedo() {
    }

    public Paralelepipedo(double arestaA, double arestaB, double arestaC) {
        this.arestaA = arestaA;
        this.arestaB = arestaB;
        this.arestaC = arestaC;
    }

    public double getArestaA() {
        return arestaA;
    }

    public void setArestaA(double arestaA) {
        this.arestaA = arestaA;
    }

    public double getArestaB() {
        return arestaB;
    }

    public void setArestaB(double arestaB) {
        this.arestaB = arestaB;
    }

    public double getArestaC() {
        return arestaC;
    }

    public void setArestaC(double arestaC) {
        this.arestaC = arestaC;
    }

    public double getVolume() {
        return this.arestaA * this.arestaB * this.arestaC;
    }

    public double getAreaAB() {
        return arestaA * arestaB;
    }

    public double getAreaAC() {
        return arestaA * arestaC;
    }

    public double getAreaBC() {
        return arestaB * arestaC;
    }

    public double getAreaTotal() {
        return (2 * getAreaAB()) + (2 * getAreaAC()) + (2 * getAreaBC());
    }

    public void escrever() {
        try {
            FileWriter fw = new FileWriter("resultado.txt", false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Área: " + this.getAreaTotal());
            bw.newLine();
            bw.write("Volume: " + this.getVolume());
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

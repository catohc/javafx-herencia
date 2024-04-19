package com.example.herencia.Models;

public class Mago extends Humano{
    private String magia;

    public Mago(String vida, String def, String magia) {
        super(vida, def);
        this.magia = magia;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }
}

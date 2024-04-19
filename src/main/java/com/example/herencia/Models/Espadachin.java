package com.example.herencia.Models;

public class Espadachin extends Humano{
    private String danocrit = "120";

    public Espadachin(String vida, String def, String danocrit) {
        super(vida, def);
        this.danocrit = danocrit;
    }

    public String getDanocrit() {
        return danocrit;
    }

    public void setDanocrit(String danocrit) {
        this.danocrit = danocrit;
    }
}

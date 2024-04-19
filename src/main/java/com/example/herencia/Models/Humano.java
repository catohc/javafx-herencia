package com.example.herencia.Models;

public class Humano {
    protected String vida = "120";
    protected String def = "64";

    public Humano(String vida, String def) {
        this.vida = vida;
        this.def = def;
    }

    public String getVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }
}

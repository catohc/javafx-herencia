package com.example.herencia.Models;

public class Mounstruos {
    protected String dano = "34";
    protected String vida = "240";

    public Mounstruos(String dano, String vida) {
        this.dano = dano;
        this.vida = vida;
    }

    public String getDano() {
        return dano;
    }

    public void setDano(String dano) {
        this.dano = dano;
    }

    public String getVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }
}

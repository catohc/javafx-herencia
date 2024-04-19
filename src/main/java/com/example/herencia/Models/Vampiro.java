package com.example.herencia.Models;

public class Vampiro extends Mounstruos{
    private String sangrado;

    public Vampiro(String dano, String vida, String sangrado) {
        super(dano, vida);
        this.sangrado = sangrado;
    }

    public String getSangrado() {
        return sangrado;
    }

    public void setSangrado(String sangrado) {
        this.sangrado = sangrado;
    }
}

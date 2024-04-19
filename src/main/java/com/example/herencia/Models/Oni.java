package com.example.herencia.Models;

public class Oni extends Mounstruos{
    private String alucinacion;

    public Oni(String dano, String vida, String alucinacion) {
        super(dano, vida);
        this.alucinacion = alucinacion;
    }

    public String getAlucinacion() {
        return alucinacion;
    }

    public void setAlucinacion(String alucinacion) {
        this.alucinacion = alucinacion;
    }
}

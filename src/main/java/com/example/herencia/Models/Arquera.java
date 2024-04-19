package com.example.herencia.Models;

public class Arquera extends Humano{
    private String distancedamage;

    public Arquera(String vida, String def, String distancedamage) {
        super(vida, def);
        this.distancedamage = distancedamage;
    }

    public String getDistancedamage() {
        return distancedamage;
    }

    public void setDistancedamage(String distancedamage) {
        this.distancedamage = distancedamage;
    }
}

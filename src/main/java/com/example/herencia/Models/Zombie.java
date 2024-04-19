package com.example.herencia.Models;

public class Zombie extends Mounstruos{
    private String envenenamiento;

    public Zombie(String dano, String vida, String envenenamiento) {
        super(dano, vida);
        this.envenenamiento = envenenamiento;
    }

    public String getEnvenenamiento() {
        return envenenamiento;
    }

    public void setEnvenenamiento(String envenenamiento) {
        this.envenenamiento = envenenamiento;
    }
}

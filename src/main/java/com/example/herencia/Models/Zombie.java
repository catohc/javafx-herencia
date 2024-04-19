package com.example.herencia.Models;

public class Zombie extends Mounstruos{
    private String envenenamiento;

    public Zombie(String dano, String vida, String envenenamiento) {
        super(dano, vida);
        this.envenenamiento = envenenamiento;
    }
}

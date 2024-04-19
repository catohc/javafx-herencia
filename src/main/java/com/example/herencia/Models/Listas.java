package com.example.herencia.Models;

import java.util.ArrayList;

public class Listas {
    private ArrayList<Espadachin> listaE = new ArrayList<>();

    public ArrayList<Espadachin> getListaE() {
        return listaE;
    }

    public boolean setListaE(Espadachin espadachin) {
        return listaE.add(espadachin);
    }
    private ArrayList<Arquera>ListaA = new ArrayList<>();

    public ArrayList<Arquera> getListaA() {
        return ListaA;
    }

    public boolean setListaA(Arquera arquera) {
        return ListaA.add(arquera);
    }
    private ArrayList<Mago> listaMag = new ArrayList<>();

    public ArrayList<Mago> getListaMag() {
        return listaMag;
    }

    public boolean setListaMag(Mago mag) {
        return listaMag.add(mag);
    }
    private ArrayList<Zombie> listaZom = new ArrayList<>();

    public ArrayList<Zombie> getListaZom() {
        return listaZom;
    }

    public boolean setListaZom(Zombie zom) {
        return listaZom.add(zom);
    }
    private ArrayList<Oni> listaOni = new ArrayList<>();

    public ArrayList<Oni> getListaOni() {
        return listaOni;
    }

    public boolean setListaOni(Oni oni) {
        return listaOni.add(oni);
    }
    private ArrayList<Vampiro> Listavamp = new ArrayList<>();

    public ArrayList<Vampiro> getListavamp() {
        return Listavamp;
    }

    public boolean setListavamp(Vampiro vampiro) {
        return Listavamp.add(vampiro);
    }
}

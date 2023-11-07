package com.corenetworks.modelo;

public class Bateria extends InstrumentoMusical{

    private int noPlatillos;
    @Override
    public String emitirSonido() {
        return "taca taca";
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "noPlatillos=" + noPlatillos +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Bateria() {
    }

    public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.noPlatillos = noPlatillos;
    }

    public int getNoPlatillos() {
        return noPlatillos;
    }

    public void setNoPlatillos(int noPlatillos) {
        this.noPlatillos = noPlatillos;
    }
}

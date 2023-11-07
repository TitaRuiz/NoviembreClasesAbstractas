package com.corenetworks.modelo;

public class Guitarra extends InstrumentoMusical{
    private String tiposCuerda;

    @Override
    public String emitirSonido() {
        return "gli gli";
    }

    @Override
    public String toString() {
        return "Guitarra{" +
                "tiposCuerda='" + tiposCuerda + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Guitarra() {
    }

    public Guitarra(String marca, String tiposCuerda) {
        super(marca);
        this.tiposCuerda = tiposCuerda;
    }

    public String getTiposCuerda() {
        return tiposCuerda;
    }

    public void setTiposCuerda(String tiposCuerda) {
        this.tiposCuerda = tiposCuerda;
    }
}

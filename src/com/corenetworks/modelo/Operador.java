package com.corenetworks.modelo;

public class Operador extends  Empleado{

    private double incentivo;
    private int piezas;
    @Override
    public double calcularNomina() {
        return sueldo + incentivo*piezas;
    }

    @Override
    public String toString() {
        return "Operador{" +
                "incentivo=" + incentivo +
                ", piezas=" + piezas +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    public Operador() {
    }

    public Operador(String nombre, double sueldo, double incentivo, int piezas) {
        super(nombre, sueldo);
        this.incentivo = incentivo;
        this.piezas = piezas;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }
}

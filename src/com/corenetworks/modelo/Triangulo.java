package com.corenetworks.modelo;

public class Triangulo extends Figura{
    //1.metodos
    private double altura;
    private double base;
    //2.metodos
    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "altura=" + altura +
                ", base=" + base +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    //3.constructores

    public Triangulo() {
    }

    public Triangulo(int x, int y, double altura, double base) {
        super(x, y);
        this.altura = altura;
        this.base = base;
    }
    //4.getters y setters

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}

package com.corenetworks.presentacion;

import com.corenetworks.modelo.Cuadrado;
import com.corenetworks.modelo.Figura;
import com.corenetworks.modelo.Triangulo;

public class ProbarPolimorfismoFigura {
    public static void main(String[] args) {
        Cuadrado cPeque = new Cuadrado();
        cPeque.setLado(8);
        cPeque.setX(0);
        cPeque.setY(0);

        Figura cMediano = new Cuadrado(0,5,3);

        Triangulo tPeque = new Triangulo();
        tPeque.setX(8);
        tPeque.setY(3);
        tPeque.setAltura(5);
        tPeque.setBase(10);

        Figura tMediano = new Triangulo(2,2,7,6);

        Figura[] figuras = {cPeque, cMediano, tPeque, tMediano};

        for (Figura elemento:
             figuras) {
            if(elemento instanceof Cuadrado){
                System.out.println("Lado " + ((Cuadrado) elemento).getLado());
            }

            if(elemento instanceof Triangulo){
                System.out.println("Base " + ((Triangulo) elemento).getBase() + " , Altura " + ((Triangulo) elemento).getAltura() );
            }
            System.out.println("Calcular el area -> " + elemento.calcularArea());
            System.out.println(elemento.toString());
        }

    }
}

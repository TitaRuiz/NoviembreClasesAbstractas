package com.corenetworks.presentacion;

import com.corenetworks.modelo.Circulo;
import com.corenetworks.modelo.Figura;
import com.corenetworks.modelo.Rectangulo;

public class ProbarFigura {
    public static void main(String[] args) {
        /* No se puede instanciar la clase Figura porque es abstracta
        Figura f1 = new Figura() ;
         */

        Rectangulo r1 = new Rectangulo(0,0,4,2);
        System.out.println("Area rectangulo " + r1.calcularArea());
        System.out.println(r1.toString());

        Circulo c1 = new Circulo(4,4,2);
        System.out.println("Area del circulo " + c1.calcularArea());
        System.out.println(c1.toString());

        }
    }


package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;
import com.corenetworks.modelo.Gerente;
import com.corenetworks.modelo.Operador;
import com.corenetworks.modelo.Vendedor;
import com.sun.security.jgss.GSSUtil;

public class ProbarPolimorfismo {

    public static void main(String[] args) {
        //Probar polimorfismo
        //Gerente g1 = new Gerente("Pepe",2_000, 500);
        Empleado e1 = new Gerente("Poli",3_000,700);
        System.out.println("Calcular nómina -> " + e1.calcularNomina());
        System.out.println(e1.toString());
        Gerente g2 = (Gerente) e1;
        System.out.println("Bono -> " + g2.getBono());

        Empleado e2 = new Vendedor("Luis ",1_500,20_000,0.01);
        System.out.println("Calcular nómina -> " + e2.calcularNomina());
        System.out.println(e2.toString());

        Empleado e3 = new Operador("Pedro",1_000,.02,1_000);
        System.out.println("Calcular nómina ->" + e3.calcularNomina());
        System.out.println(e3.toString());

        Empleado[] empleados = new Empleado[3];
        empleados[0] = e1;
        empleados[1] = e2;
        empleados[2] = e3;

        for (Empleado elemento:empleados
             ) {
            if(elemento instanceof Empleado){
                System.out.println("Entra al bucle ----");
            }
            if(elemento instanceof Gerente){
                System.out.println("Bono -> "+ ((Gerente) elemento).getBono());
            }
            if(elemento instanceof  Vendedor){
                System.out.println("Ventas " + ((Vendedor)elemento).getVentas());
            }
            if (elemento instanceof Operador) {
                System.out.println("Piezas -> "+ ((Operador)elemento).getPiezas());
            }
            System.out.println("Calcular nómina -> "+ elemento.calcularNomina());
            System.out.println(elemento.toString());
        }

    }
}

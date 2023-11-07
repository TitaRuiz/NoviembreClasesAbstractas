package com.corenetworks.presentacion;

import com.corenetworks.modelo.Gerente;
import com.corenetworks.modelo.Operador;
import com.corenetworks.modelo.Vendedor;

public class ProbarEmpleado {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Luis B",3_000,500);
        System.out.println("Calculo nomina Gerente " + g1.calcularNomina());
        System.out.println(g1.toString());

        Vendedor v1 = new Vendedor("Raul R.",1_000,15_000,0.01);
        System.out.println("Calculo nomina vendedor "+ v1.calcularNomina());
        System.out.println(v1.toString());

        Operador o1 = new Operador("Juan López",900,1,1200);
        System.out.println("Calculo nomina operador "+ o1.calcularNomina());
        System.out.println(o1.toString());
    }
}

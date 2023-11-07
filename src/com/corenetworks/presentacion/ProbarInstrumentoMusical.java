package com.corenetworks.presentacion;

import com.corenetworks.modelo.Bateria;
import com.corenetworks.modelo.Flauta;
import com.corenetworks.modelo.Guitarra;

public class ProbarInstrumentoMusical {
    public static void main(String[] args) {
        Guitarra g1 = new Guitarra("Yamaha","larga");
        System.out.println(g1.toString());
        System.out.println(g1.emitirSonido());

        Bateria b1 = new Bateria("xxx",6);
        System.out.println(b1.toString());
        System.out.println(b1.emitirSonido());

        Flauta f1 = new Flauta("Amelin","madera");
        System.out.println(f1.toString());
        System.out.println(f1.emitirSonido());
    }
}

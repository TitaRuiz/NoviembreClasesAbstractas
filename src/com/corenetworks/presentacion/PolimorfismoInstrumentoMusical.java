package com.corenetworks.presentacion;

import com.corenetworks.modelo.Bateria;
import com.corenetworks.modelo.Flauta;
import com.corenetworks.modelo.Guitarra;
import com.corenetworks.modelo.InstrumentoMusical;

public class PolimorfismoInstrumentoMusical {
    public static void main(String[] args) {
        InstrumentoMusical guido = new Guitarra("Yamaha","Nylon");
        InstrumentoMusical bataca = new Bateria("XXX",5);
        InstrumentoMusical ham = new Flauta("Helsi","PVC");
        InstrumentoMusical[] instrumentos = {guido, bataca,ham};
        for (InstrumentoMusical elemto:
             instrumentos) {
            System.out.println(elemto.emitirSonido());
            System.out.println(elemto.toString());

        }
        for(int i=0 ; i<instrumentos.length; i++){
            System.out.println(instrumentos[i].emitirSonido());
            System.out.println(instrumentos[i].toString());
        }

    }
}

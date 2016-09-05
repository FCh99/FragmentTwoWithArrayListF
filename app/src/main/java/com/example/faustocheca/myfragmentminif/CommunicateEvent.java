package com.example.faustocheca.myfragmentminif;

import java.util.ArrayList;

/**
 * Created by faustocheca on 14/8/16.
 */
public class CommunicateEvent {
   ArrayList<Coche>coches;

    public CommunicateEvent(ArrayList<Coche> coches) {
        this.coches = coches;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    @Override
    public String toString() {
        return "CommunicateEvent{" +
                "coches=" + coches +
                '}';
    }
}

package com.example.faustocheca.myfragmentminif;

/**
 * Created by faustocheca on 14/8/16.
 */
public class Coche {

    String marca;
    String color;

    public Coche(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

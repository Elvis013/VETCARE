package com.example.vetcare.actividades.clases;

public class Mascota {
    private String nombre;
    private int fotoResId;

    public Mascota(String nombre, int fotoResId) {
        this.nombre = nombre;
        this.fotoResId = fotoResId;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFotoResId() {
        return fotoResId;
    }
}

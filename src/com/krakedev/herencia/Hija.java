package com.krakedev.herencia;

public class Hija extends Padre {

    public Hija(String virtudes, String defectos, String nombre) {
        super(virtudes, defectos, nombre);
    }

    @Override
    public String toString() {
        return "Hija [nombre=" + getNombre() + 
               ", virtudes=" + getVirtudes() + 
               ", defectos=" + getDefectos() + 
               ", totalAhorrado=" + getTotalAhorrado() + "]";
    }
}
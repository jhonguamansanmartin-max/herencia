package com.krakedev.herencia;

public class Hijo extends Padre {
    private int juguetes;

    public Hijo(String virtudes, String defectos, int juguetes, String nombre) {
        super(virtudes, defectos, nombre);
        this.juguetes = juguetes;
    }

    // Sobreescritura de ahorrar() - Solo ahorra el 50%
    @Override
    public void ahorrar(double monto) {
        super.ahorrar(monto * 0.5);
    }

    @Override
    public String toString() {
        return "Hijo [nombre=" + getNombre() + 
               ", virtudes=" + getVirtudes() + 
               ", defectos=" + getDefectos() + 
               ", juguetes=" + juguetes + 
               ", totalAhorrado=" + getTotalAhorrado() + "]";
    }
}
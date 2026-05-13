

public class Padre {
    private String virtudes;
    private String defectos;
    private double totalAhorrado;
    private String nombre;

    
    public Padre(String virtudes, String defectos, String nombre) {
        this.virtudes = virtudes;
        this.defectos = defectos;
        this.nombre = nombre;
        this.totalAhorrado = 0.0;
    }

    // Getters y Setters
    public String getVirtudes() {
        return virtudes;
    }

    public void setVirtudes(String virtudes) {
        this.virtudes = virtudes;
    }

    public String getDefectos() {
        return defectos;
    }

    public void setDefectos(String defectos) {
        this.defectos = defectos;
    }

    public double getTotalAhorrado() {
        return totalAhorrado;
    }

    public void setTotalAhorrado(double totalAhorrado) {
        this.totalAhorrado = totalAhorrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ahorrar(double monto) {
        this.totalAhorrado += monto;
    }

    @Override
    public String toString() {
        return "Padre [nombre=" + nombre + 
               ", virtudes=" + virtudes + 
               ", defectos=" + defectos + 
               ", totalAhorrado=" + totalAhorrado + "]";
    }
}
package models;

public class Contacto {

    private String nombre;
    private String numeroTelefono;
    private static int globalID = 1;

    private int id = globalID;

    public Contacto(String nombre, String numeroTelefono) {
        globalID++;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "   Contacto No. " + id +
               "\nNombre: " + getNombre() +
               "\nTelefono: " + getNumeroTelefono();
    }
}

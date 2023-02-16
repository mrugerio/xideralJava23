package mementoejemplo;

public class Memento {
 private String nombre,apellidos;

    // Constructor
     public Memento(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    // Getter & Setter
    public String getNombre() { return this.nombre;}
    public void setNombre(String nombre) {this.nombre = nombre; }

    public String getApellidos() {return this.apellidos; }
    public void setApellidos(String apellidos) {this.apellidos = apellidos; }
}

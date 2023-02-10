

public class Publicacion {
    
    String nombre;

    public Publicacion() {}
	
    public Publicacion(String _nombre) {
        this.nombre = _nombre;
    }

public String getNombre() { return nombre;}

public void setNombre(String nombre) {this.nombre = nombre;}

    @Override
    public String toString() {
        return "Publicacion{" + "nombre=" + nombre + '}';
    }
}

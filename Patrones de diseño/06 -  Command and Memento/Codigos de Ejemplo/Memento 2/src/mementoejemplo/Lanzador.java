package mementoejemplo;

public class Lanzador {
    public static void main(String[] args) {
       
   // Crear el objeto originador/creador
        Originator creador = new Originator("Eberth", "Mezeta Xool");
        // Crear el objeto gestor/vigilante del Memento
        Caretaker vigilante= new Caretaker();
        // Crear el Memento y asociarlo al objeto gestor
        vigilante.setMemento( creador.createMemento() );
        // Mostrar los datos del objeto
        System.out.println("Nombre completo: [" + creador.getNombre() + " " + creador.getApellidos() + "]" );
        // Modificar los datos del objeto
        creador.setNombre("Francisco");
        creador.setApellidos("Perez Azueta");
        // Mostrar los datos del objeto
        System.out.println("Nombre completo: [" + creador.getNombre() + " " + creador.getApellidos() + "]" );
        // Restaurar los datos del objeto
        creador.setMemento( vigilante.getMemento() );
        // Mostrar los datos del objeto
        System.out.println("Nombre completo: [" + creador.getNombre() + " " + creador.getApellidos() + "]" );
    }
}

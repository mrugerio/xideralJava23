package command_update;

public class Juego {
    private Personaje personaje;
    private Command botonA;
    private Command botonB;
    private Command botonY;
    private Command botonX;

    public Juego() {
      this.personaje = new Personaje();
    }
    
    public void ejecutarComando(Boton btonPresionado){
    procesaEntrada(btonPresionado);
    }
    
    public void procesaEntrada(Boton btonPresionado){
    if(btonPresionado==Boton.BotonA)botonA.ejecutar(this.personaje);
    if(btonPresionado==Boton.BotonB)botonB.ejecutar(this.personaje);
    if(btonPresionado==Boton.BotonX)botonX.ejecutar(this.personaje);
    if(btonPresionado==Boton.BotonY)botonY.ejecutar(this.personaje);      
    }

    public void setBotonA(Command botonA) {
        this.botonA = botonA;
    }

    public void setBotonB(Command botonB) {
        this.botonB = botonB;
    }

    public void setBotonY(Command botonY) {
        this.botonY = botonY;
    }

    public void setBotonX(Command botonX) {
        this.botonX = botonX;
    }
}

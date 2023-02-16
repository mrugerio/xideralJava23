public class Email {
    
    private final String titulo;
    private final String destinatarios;
    private final String mensaje;
    

    public Email(String _titulo, String _destinatarios, String _mensaje) {
        this.titulo = _titulo;
        this.destinatarios = _destinatarios;
        this.mensaje = _mensaje;
    }    
    
    public String getTitulo() {  return titulo;  }
    
    public String getDestinatarios() { return destinatarios;  }
	
    public String getMensaje() { return mensaje;  }
    
    public void send() {}
    
    @Override
    public String toString() {
return "Para: "+this.getDestinatarios()
        +"\nTitulo: "+this.getTitulo()
        +"\n________________________________________\n"
        +this.getMensaje();
	}    
}

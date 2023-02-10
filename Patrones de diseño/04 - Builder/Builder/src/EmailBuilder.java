import java.util.HashSet;
import java.util.Set;
/**
 * @author Victor Lavalle
 */
public class EmailBuilder {
 Set <String> destinatarios;
String title,saludo,despedida,texto;

    public EmailBuilder addTitle(String _title){
        this.title=_title;
        return this;
    }
    
    public EmailBuilder addSaludo(String _saludo){
        this.saludo=_saludo;
        return this;
    }
    
    public EmailBuilder addDestinatario(String _destinatario){
         if(destinatarios==null){
        destinatarios = new HashSet<>();}
        destinatarios.add(_destinatario);
        return this;
    }
    
    public EmailBuilder addDespedida(String _despedida){
        this.despedida=_despedida;
        return this;
    }
    
       public EmailBuilder addTexto(String _texto){
        this.texto=_texto;
        return this;
    }
    
    public Email build(){
       Email email = new Email(title, destinatarios.toString(),
	saludo + "\n" + texto + "\n" + despedida);
       return email;
    }
}
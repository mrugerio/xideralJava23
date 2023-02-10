/**
 * @author Victor Lavalle
 */
public class Cliente {

    public Cliente() {
        
        String destinatario = "gortiz@uady.mx";
        String destinatario2 = "jgarcila@yahoo.com";
        String saludo = "Hola Juan";
        String texto = "Favor de calificar las ADA's de Diseño";
        String despedida = "Saludos y Gracias";
        String tituloCorreo = "Seguimiento a Diseño Software";
                
        EmailBuilder builder = new EmailBuilder();
        
       Email email =builder.addTitle(tituloCorreo).addSaludo(saludo)
               .addDestinatario(destinatario).addDestinatario(destinatario2)
               .addTexto(texto).addDespedida(despedida).build();
       
        System.out.println(email.toString());
    }
public static void main(String[] args) {
		new Cliente();
	}
}

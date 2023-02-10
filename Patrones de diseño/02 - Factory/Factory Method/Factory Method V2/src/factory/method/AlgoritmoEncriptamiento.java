package factory.method;
/**
 * @author Victor Lavalle
 */
public interface AlgoritmoEncriptamiento {
    public abstract void configurar();
    public abstract String encriptar(String texto);
    public abstract String desencriptar(String textoEncriptado);
}

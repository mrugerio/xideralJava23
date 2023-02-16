
/**
 * @author Victor Lavalle
 */
public class FactoryDivulgacion extends FactoryPublicacionArticulo {

    @Override
    public Articulo createArticulo() {
        return new ArticuloDivulgacion();
    }

    @Override
    public Publicacion createPublicacion() {
        return new Blog();
    }
}

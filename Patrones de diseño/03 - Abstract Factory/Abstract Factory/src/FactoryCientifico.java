
/**
 * @author Victor Lavalle
 */
public class FactoryCientifico extends FactoryPublicacionArticulo {

    @Override
    public Articulo createArticulo() {
        return new ArticuloCientifico();
    }

    @Override
    public Publicacion createPublicacion() {
        return new RevistaCientifica();   
    }
}

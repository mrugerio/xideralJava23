package factory.method;
/**
 * @author Victor Lavalle
 */
public class FactoryAlgoEncripGHash implements FactoryAlgoEncriptamiento {
    
    @Override
    public AlgoritmoEncriptamiento create() {
        AlgoritmoEncriptamiento algo = new GHash();
        algo.configurar();
        return algo;
    }

}

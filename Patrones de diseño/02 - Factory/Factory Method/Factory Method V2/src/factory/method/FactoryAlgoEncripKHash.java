package factory.method;
/**
 * @author Victor Lavalle
 */
public class FactoryAlgoEncripKHash implements FactoryAlgoEncriptamiento {

    @Override
    public AlgoritmoEncriptamiento create() {
        AlgoritmoEncriptamiento algo = new KHash();
        algo.configurar();
        return algo;
	}
}

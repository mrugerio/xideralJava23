public class FactoryAlgoEncripGHash implements FactoryAlgoEncriptamiento {

	@Override
	public AlgoritmoEncriptamiento create() {
		AlgoritmoEncriptamiento algoritmoEncriptamiento = new GHash();
		algoritmoEncriptamiento.configurar();
		return algoritmoEncriptamiento;
	}

}

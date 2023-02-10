public class FactoryAlgoEncripKHash implements FactoryAlgoEncriptamiento {

	@Override
	public AlgoritmoEncriptamiento create() {
		AlgoritmoEncriptamiento algoritmoEncriptamiento = new KHash();;
		algoritmoEncriptamiento.configurar();
		return algoritmoEncriptamiento;
	}
}

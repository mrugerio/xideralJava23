package factory.method;

/**
 * @author Victor Lavalle
 */
public class FactoryAlgoEncriptamiento {

    public static AlgoEncriptamiento createInstance(String algoType){
        AlgoEncriptamiento algo= null;
    if(algoType.equals("khash")){algo =new KHash();}

    if (algoType.equals("ghash")){ algo = new GHash();}
  
  algo.configurar();
  return algo;
    }
}

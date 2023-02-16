package Model;

public interface IVotable extends IContable, Comparable {
	public void votar();
	public String getNombre();
}

package Model;

import java.awt.Color;

public class Votable implements IVotable {

	private String nombre;
	private int votos = 0;
	private Color color;

	public Votable(String nombre, Color color) {
		this.nombre = nombre;
		this.color = color;
	}

	@Override
	public void votar() {
		votos++;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public int getCuenta() {
		// TODO Auto-generated method stub
		return votos;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public IVotable cloneThis() {
		Votable clonVotable = new Votable(nombre, color);
		clonVotable.votos = votos;
		return clonVotable;
	}

	@Override
	public int compareTo(Object o) {
		Votable votable = (Votable) o;
		return this.getNombre().compareTo(votable.getNombre());
	}

}

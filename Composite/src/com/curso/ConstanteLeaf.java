package com.curso;

public class ConstanteLeaf implements Component {
	
	private double valorConstante;
	
	public ConstanteLeaf(double valorConstante) {
		this.valorConstante = valorConstante;
	}

	@Override
	public double getValor() {
		return valorConstante;
	}

	@Override
	public String toString() {
		return "ConstanteLeaf [valorConstante=" + valorConstante + "]";
	}
	
}

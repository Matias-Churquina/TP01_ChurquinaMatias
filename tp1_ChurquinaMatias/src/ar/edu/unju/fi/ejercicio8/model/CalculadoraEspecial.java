package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private Integer n;
	
	public CalculadoraEspecial() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double calcularSumatoria() {
		double res = 0;
		for (int i = 1; i<=n; i++ ) {
			double aux = (i*(i+1)/2);
			aux = Math.pow(aux, 2);
			res = aux + res;
		}
		return res;
	}
	
	public double calcularProductoria() {
		double res = 1;
		for (int i = 1; i<=n; i++ ) {
			double aux = i*(i+4);
			res = aux * res;
		}
		return res;
	}
	
	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}
	
	
	
}

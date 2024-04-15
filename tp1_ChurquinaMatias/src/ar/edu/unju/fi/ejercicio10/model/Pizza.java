package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private double diametro;
	private double precio;
	private double area;
	private boolean ingEspecial;
	private final double esp20 = 500;
	private final double esp30 = 750;
	private final double esp40 = 1000;
	
	public double calcularPrecio() {
		if ( diametro == 20 ) {
			precio = 4500;
			if ( ingEspecial == true ) {
				precio = precio + esp20;
			}
		} else {
			if ( diametro == 30 ) {
				precio = 4800;
				if ( ingEspecial == true ) {
					precio = precio + esp30;
				}
			} else {
				precio = 5500;
				if ( ingEspecial == true ) {
					precio = precio + esp40;
				}
			}
		}
		return precio;
	}
	
	public double calcularArea() {
		double radio = diametro/2;
		area = Math.PI * (Math.pow(radio, 2)) ; 
		return area;
	}
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	
	public void mostrarDatos() {
		System.out.println("Diámetro = " + diametro );
		System.out.println("Ingredientes especiales = " + ingEspecial );
		System.out.println("Precio Pizza = " + precio );
		System.out.println("Área de la pizza = " + area);
	}
	
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngEspecial() {
		return ingEspecial;
	}
	public void setIngEspecial(boolean ingEspecial) {
		this.ingEspecial = ingEspecial;
	}
	
	
	
	
}

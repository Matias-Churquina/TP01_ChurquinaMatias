package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private int codigo;
	private double precio;
	private int descuento = 25;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public double calcularDescuento() {
		double desc;
		desc = precio - (precio * (descuento * 0.010));
		return desc;
	}
	
	public void mostrarDatos() {
		System.out.println();
		System.out.println("Nombre del producto: " + nombre );
		System.out.println("Código: " + codigo );
		System.out.println("Precio: " + precio );
		System.out.println("Precio con descuento del 25%: " + calcularDescuento());
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}

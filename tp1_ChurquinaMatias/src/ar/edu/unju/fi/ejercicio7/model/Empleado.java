package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private Integer legajo;
	private double salario;
	final double salarioMin = 210000.00;
	final double merito = 20000.00;
	
	public Empleado(String nombre, Integer legajo, double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;		
		if (salario < salarioMin)  {
			this.salario = salarioMin;
		} else {
			this.salario = salario;
		}
	}

	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", legajo=" + legajo + ", salario=" + salario + "]";
	}

	public double aumento( Empleado e) {
		e.salario = salario + merito;
		return salario;
	}

	public void mostrarDatos() {
		System.out.println();
		System.out.println("Nombre del empleado: " + nombre );
		System.out.println("Legajo: " + legajo );
		System.out.println("Salario: " + salario );
	}
	
	
}

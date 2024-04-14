package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

import java.time.Period;

public class Persona {
	private Integer dni;
	private String nombre;
	private String provincia;
	private LocalDate fechaNacimiento;
	
	public int calcularEdad( LocalDate f ) {
		LocalDate fActual = LocalDate.now();
		Period periodo = Period.between(f, fActual);
		int edad = periodo.getYears() ;
		return edad;
	}
	
	public boolean esMayorEdad( Integer e ) {
		boolean mayor = false;
		if ( e >= 18 ) {
			mayor = true;
		}
		return mayor;
	}
	
	public String toString() {		
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", provincia=" + provincia + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	
	public void mostrarDatos( Persona p) { 
			//Persona p = new Persona();
			System.out.println(p.toString());
			Integer a = calcularEdad(p.fechaNacimiento);
			if ( p.esMayorEdad(a) == true) {
				System.out.println("Tiene: " + a + " años" +". La persona es mayor de edad."); 
			} else {
				System.out.println("Tiene: " + a + " años" +". La persona no es mayor de edad.");
			} 
	}
	
	public Persona(Integer dni, String nombre, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.provincia = "Jujuy";
		this.fechaNacimiento = fechaNacimiento;
	}

	public Persona() {
		super();
	}

	public Persona(Integer dni, String nombre, String provincia, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.provincia = provincia;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}

package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cd = Calendar.getInstance();
		System.out.print("Ingrese nombre de la persona: ");
		String nombre = sc.next();
		System.out.println("Ingrese fecha de nacimiento: ");
		System.out.print("Ingrese dia: ");
		int dia = sc.nextInt();
		System.out.print("Ingrese mes: ");
		int mes = sc.nextInt()-1;
		System.out.print("Ingrese anio: ");
		int anio = sc.nextInt();
		cd.set(anio, mes, dia);
		
		Persona p = new Persona(nombre, cd);
		
		p.mostrarDatos();
		p.Estacion();
		
		sc.close();
	}

}

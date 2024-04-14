package ar.edu.unju.fi.ejercicio7.main;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Ingrese legajo del Empleado: ");
		Integer legajo = sc.nextInt();
		System.out.print("Ingrese nombre del Empleado: ");
		String nombre = sc.next();
		System.out.print("Ingrese su Salario: ");
		double salario = sc.nextDouble();

		Empleado e = new Empleado(nombre, legajo, salario);
		
		e.mostrarDatos();
		e.aumento(e);
		e.mostrarDatos();
		sc.close();
	}

}

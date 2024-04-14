package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Ingrese el valor de n para poder calcular: ");
		Integer n = sc.nextInt();

		CalculadoraEspecial cal = new CalculadoraEspecial();
		cal.setN(n);
		
		System.out.println("El resultado de la sumatoria es: " + 
		                    cal.calcularSumatoria());
		System.out.println("El resultado de la productoria es: " + 
		                    cal.calcularProductoria());
		
		sc.close();
	}

}

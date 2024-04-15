package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		do {
			System.out.println();
			//sc.next();
			System.out.print("Ingrese diametro de la pizza: ");
			Integer diametro = sc.nextInt();
			System.out.print("Tiene ingredientes especiales: ");
			boolean especial = sc.nextBoolean();
			Pizza p = new Pizza();
			p.setDiametro(diametro);
			p.setIngEspecial(especial);
			p.calcularPrecio();
			p.calcularArea();
			System.out.println("** Pizza " + i + " **");
			p.mostrarDatos();
			i++;
		}while(i<=3);
		sc.close();
	}
}



package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int i = 1;
		do {
			System.out.println();
			System.out.print("Ingrese nombre del producto: ");
			String nombre = sc.next();
			System.out.print("Ingrese cOdigo del producto: ");
			Integer cod = sc.nextInt();
			System.out.print("Ingrese el precio del producto: ");
			double n = sc.nextDouble();
			
			Producto prod = new Producto();
			prod.setNombre(nombre);
			prod.setCodigo(cod);
			prod.setPrecio(n);
			prod.mostrarDatos();
			i++;
		} while( i <= 3);
		sc.close();
	}

}

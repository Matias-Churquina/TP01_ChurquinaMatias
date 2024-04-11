package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número entre 0 y 10: ");
		int num = sc.nextInt();
		int aux = num;
		int fac = 1;
		if ( num >= 0 && num <= 10) {
			while (aux > 0) {
				if ( aux != 0 ) {
					fac = fac * aux;
					aux --;
				} 
			}
			System.out.print("El Factorial de " + num + " es: " + fac );
		} else {
			System.out.println("ERROR. Debe ingresar un número entre 0 y 10.");
		}
	}

}

package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número entre 1 y 9: ");
		int num = sc.nextInt();
		int aux = num;
		if ( num >= 1 && num <= 9) {
			 for (int i = 0 ; i <= 10 ; i++) {
				 System.out.println(num + " x " + i + " = " + (num * i ));
			}
		} else {
			System.out.println("ERROR. Debe ingresar un número entre 1 y 9.");
		}

	}

}

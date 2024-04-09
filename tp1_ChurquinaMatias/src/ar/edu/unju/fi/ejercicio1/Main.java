package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		System.out.println("**  Program: Promedio de 5 números enteros.  **");
		Scanner sc= new Scanner(System.in);
		int i = 1;
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		System.out.println("Ingrese número 1:" );
		num1 = sc.nextInt();
		System.out.println("Ingrese número 2:" );
		num2 = sc.nextInt();
		System.out.println("Ingrese número 3:" );
		num3 = sc.nextInt();
		System.out.println("Ingrese número 4:" );
		num4 = sc.nextInt();
		System.out.println("Ingrese número 5:" );
		num5 = sc.nextInt();
		float promedio= ((num1+num2+num3+num4+num5)/5f);
		System.out.println("- El promedio es: " + promedio );		
	}
}
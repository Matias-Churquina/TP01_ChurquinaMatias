package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número entero:");
		int num = sc.nextInt();
		if (num%2 == 0) {
			System.out.println("Número ingresado par. ");
			System.out.print("Resultado: " + (num * 3));
		} else {
			System.out.println("Número ingresado impar. ");
			System.out.print("Resultado: " + (num * 2));
		}
		sc.close();
	}

}

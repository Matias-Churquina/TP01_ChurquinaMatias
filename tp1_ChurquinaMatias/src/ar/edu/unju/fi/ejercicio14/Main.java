package ar.edu.unju.fi.ejercicio14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> arreglo = new ArrayList<>();
		System.out.print("Ingrese tamaño del arreglo (entre 3 y 10): ");
		int len = sc.nextInt();
		int i = 1;
		if(len >= 3 && len <= 10) {
			while(i <= len) {
				System.out.print("Ingrese un número entero: " );
				arreglo.add(sc.nextInt());
				i++;
			}
			System.out.println("   --- ARRAY DE ENTEROS ---23 ");
			i = 0;
			for (Integer in:arreglo) {
				i = i+in; 
				System.out.println(" Valor= " + in );
			}
			System.out.println("Suma total de los valores= " + i);
		} else {
			System.out.println("ERROR. El tamaño debe ser entre 3 y 10");
		}
		sc.close();
	}
}

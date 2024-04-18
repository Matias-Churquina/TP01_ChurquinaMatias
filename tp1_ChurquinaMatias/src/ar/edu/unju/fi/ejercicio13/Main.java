package ar.edu.unju.fi.ejercicio13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> arreglo = new ArrayList<>();
		int i = 1;
		do {
			System.out.print("Ingrese un número entero: ");
			Integer ob = sc.nextInt();
			arreglo.add(ob);
			i++;
		}while(i<9);
		System.out.println("    --- ARRAY ---");
		i = -1;
		for (Integer in:arreglo) {
			i += 1;
			System.out.println(" Índice= " + i  + 
					           " Valor= " + in );
		}
		sc.close();
	}
}

package ar.edu.unju.fi.ejercicio15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> strings = new ArrayList<>();
		System.out.print("Ingrese tamaño del arreglo (entre 5 y 10): ");
		int len = sc.nextInt();
		int i = 1;
		if(len >= 5 && len <= 10) {
			while( i <= len ) {
				System.out.print("Ingrese nombre: ");			
				strings.add(sc.next());
				i++;
			}
			System.out.println("  --- Array de Strings del primer objeto al último ---");
			int j = -1;
			for (String in:strings) {
				j += 1;
				System.out.println(" Valor " + j + "= " + in );
			}
			System.out.println("  --- Array de Strings del último objeto al primero ---");
			for ( i = strings.size()-1 ; i >= 0; i--) {
			    System.out.println(" Valor " + len + "= " + strings.get(i));
			    len--;
			}
		} else {
			System.out.println("Error. Debe ingresar un tamaño entre 5 y 10.");
		}
		sc.close();
	}

}

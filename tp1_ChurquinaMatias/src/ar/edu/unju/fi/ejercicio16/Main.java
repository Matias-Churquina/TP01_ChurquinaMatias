package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nombres = new String[5];
		for(int i=0; i<5; i++) {
			System.out.print("Ingrese nombre: ");
			nombres[i]= sc.next();
		}
		System.out.println("  --- Array de Strings --- ");
		mostrarObj(nombres);
		System.out.println();
		System.out.println("Tamaño del array= " + nombres.length);
		System.out.println();
		byte rem = 0;
		do {
			System.out.print("Ingrese índice a eliminar: ");
			rem = sc.nextByte();
		}while(rem < 0 && rem >= nombres.length);
		
		eliminarObj(nombres, rem);
		mostrarObj(nombres);
		sc.close();
	}
	
	public static void mostrarObj(String[] nombre ){
		int j = 0;
		while(j < 5) {
			System.out.println("Posición " + j + ". Valor= " + nombre[j] );
			j++;
		}
	}
	public static void eliminarObj(String[] nomb, byte e) {
			for(byte i=e; i < nomb.length; i++) {
				if (i == nomb.length-1) {
					nomb[i]=" ";
				} else {
				    nomb[i] = nomb[i+1];
				} 	
			 }
		}
	}

package ar.edu.unju.fi.ejercicio11.main;

public class Main {

	public static void main(String[] args) {
		int num = 80;
		for(int i = 2, j = 40; j > 0; i+=2, j-- ) {
			System.out.print(num + " ");
			num = num+40-i-1;
		}
	}

}

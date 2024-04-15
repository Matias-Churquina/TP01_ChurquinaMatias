package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.model.Persona;

import java.util.Scanner;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
					System.out.println();
					System.out.print("Ingrese D.N.I.: ");
					Integer dni = sc.nextInt();
					System.out.print("Ingrese nombre: ");
					String nombre = sc.next();
					System.out.print("Ingrese Provincia: ");
					String provincia = sc.next();
					System.out.println("Ingrese fecha de nacimiento ");
					System.out.print("Día: ");
					Integer fechaDia = sc.nextInt();
					System.out.print("Mes: ");
					Integer fechaMes = sc.nextInt();
					System.out.print("Año: ");
					Integer fechaAño = sc.nextInt();
					LocalDate f = LocalDate.of(fechaAño, fechaMes, fechaDia );
					Persona p1 = new Persona(dni, nombre, provincia, f);
					p1.mostrarDatos(p1);
					System.out.println();
					System.out.print("Ingrese D.N.I.: ");
					Integer dni2 = sc.nextInt();
					System.out.print("Ingrese nombre: ");
					String nombre2 = sc.next();
					System.out.println("Ingrese fecha de nacimiento ");
					System.out.print("Día: ");
					Integer fechaDia2 = sc.nextInt();
					System.out.print("Mes: ");
					Integer fechaMes2 = sc.nextInt();
					System.out.print("Año: ");
					Integer fechaAño2 = sc.nextInt();
					LocalDate f2 = LocalDate.of(fechaAño2, fechaMes2, fechaDia2 );
					Persona p2 = new Persona(dni2, nombre2, f2);
					p2.mostrarDatos(p2);
					System.out.println();
					System.out.print("Ingrese D.N.I.: ");
					Integer dni3 = sc.nextInt();
					System.out.print("Ingrese nombre: ");
					String nombre3 = sc.next();
					System.out.print("Ingrese Provincia: ");
					String provincia3 = sc.next();
					System.out.println("Ingrese fecha de nacimiento ");
					System.out.print("Día: ");
					Integer fechaDia3 = sc.nextInt();
					System.out.print("Mes: ");
					Integer fechaMes3 = sc.nextInt();
					System.out.print("Año: ");
					Integer fechaAño3 = sc.nextInt();
					LocalDate f3 = LocalDate.of(fechaAño3, fechaMes3, fechaDia3);
					Persona p3 = new Persona();
					p3.setDni(dni3);
					p3.setNombre(nombre3);
					p3.setProvincia(provincia3);
					p3.setFechaNacimiento(f3);
					p3.mostrarDatos(p3);
					System.out.println();
		System.out.println("**  FIN DE LA CARGA **");
		sc.close();
	}

}

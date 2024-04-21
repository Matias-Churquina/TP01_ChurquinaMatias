package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	private static Scanner sc;
	private static List<Jugador> jugadores;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("============================");
			System.out.println("1 – Alta de jugador");
			System.out.println("2 – Mostrar los datos del jugador ");
			System.out.println("3 – Mostrar todos los jugadores ordenados por apellido.");
			System.out.println("4 – Modificar los datos de un jugador");
			System.out.println("5 – Eliminar un jugador");
			System.out.println("6 – Mostrar cantidad total de jugadores ");
			System.out.println("7 – Mostrar cantidad de jugadores que pertenecen a una nacionalidad");
			System.out.println("8 – Salir.");
			System.out.println("============================");
			System.out.print("    Ingrese una opción: ");
			op = sc.nextInt();
			sc.nextLine();
		    switch (op) {
		     	case 1:
		     		precargarJugadores();
		     		break;
		     	case 2:
		     		mostrarJugadores();
	     			break;
		     	case 3:
		     		ordenarApellido();
	     			break;
		     	case 4:
		     		modificarJugador();
	     			break;
		     	case 5:
		     		elimnarJugador();
	     			break;
		     	case 6:
		     		cantTotal();
	     			break;
		     	case 7:
		     		cantNacionalidad();
	     			break;
		     	case 8:
		     		System.out.println(" --- FIN DEL PROGRAMA  ---");
	     			break;
	     		default: System.out.println("Opción incorrecta.");
		    }
		}while(op != 8);
		sc.close();
	}
	public static void precargarJugadores() {
		if(jugadores == null) {
			jugadores = new ArrayList<>();
		}
		try {
		System.out.println();
		System.out.print("Ingrese nombre: ");
		String nombre = sc.next();
		System.out.print("Ingrese apellido: ");
		String apellido = sc.next();
		System.out.println("Ingrese fecha de nacimiento ");
		System.out.print("Día: ");
		Integer fechaDia = sc.nextInt();
		System.out.print("Mes: ");
		Integer fechaMes = sc.nextInt();
		System.out.print("Año: ");
		Integer fechaAño = sc.nextInt();
		LocalDate f = LocalDate.of(fechaAño, fechaMes, fechaDia );
		System.out.print("Ingrese nacionalidad: ");
		String nacionalidad = sc.next();
		System.out.print("Ingrese estatura.: ");
		double estatura = sc.nextDouble();
		System.out.print("Ingrese peso.: ");
		double peso = sc.nextDouble();
		System.out.print("Ingrese posición: ");
		String posicion = sc.next();
		jugadores.add(new Jugador(nombre, apellido, f, nacionalidad,
				                  estatura, peso, posicion));
		}catch(Exception e) {
			System.out.println("ERROR. Para el ingreso de números decimales "
					+ "debe usar coma ',' como seprardor de decimales.");
		}finally {
			sc.next();
		}
	}
	public static Jugador buscarJugador(String nombre, String apellido) {
		Jugador Encontrado = null;
		for(Jugador jugador: jugadores) {
			if(jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
				Encontrado = jugador;
				break;
			}
		}
		return Encontrado;
	}
	public static void mostrarJugadores() {
		try {
		System.out.println("- Ingrese nombre de jugador a buscar:");
		String nombre = sc.next();
		System.out.println("- Ingrese apellido de jugador a buscar:");
		String apellido = sc.next();
		Jugador bus = buscarJugador(nombre, apellido);
		bus.toString();
		}catch(Exception e){
			System.out.println("Aun no se han cargado destinos a la lista.");
		}
	}
	public static void ordenarApellido() {
		Collections.sort(jugadores ,new Comparator<Jugador>() {

			@Override
			public int compare(Jugador j1, Jugador j2) {
				// TODO Auto-generated method stub
				return j1.getApellido().compareTo(j2.getApellido());
			}
		});
		for (Jugador jugador : jugadores) {
            System.out.println(jugador.toString());
        }
	}
	public static void modificarJugador() {
		System.out.print("- Ingrese nombre de jugador a modificar: ");
		String nombreM = sc.next();
		System.out.print("- Ingrese apellido de jugador a modificar: ");
		String apellidoM = sc.next();
		Jugador bus = buscarJugador(nombreM, apellidoM);				
		if(bus != null) {
			System.out.println();
			System.out.print("Ingrese nombre: ");
			String nombre = sc.next();
			System.out.print("Ingrese apellido: ");
			String apellido = sc.next();
			System.out.println("Ingrese fecha de nacimiento ");
			System.out.print("Día: ");
			Integer fechaDia = sc.nextInt();
			System.out.print("Mes: ");
			Integer fechaMes = sc.nextInt();
			System.out.print("Año: ");
			Integer fechaAño = sc.nextInt();
			LocalDate f = LocalDate.of(fechaAño, fechaMes, fechaDia );
			System.out.print("Ingrese nacionalidad: ");
			String nacionalidad = sc.next();
			try {
				System.out.print("Ingrese estatura.: ");
				double estatura = sc.nextDouble();
				System.out.print("Ingrese peso.: ");
				double peso = sc.nextDouble();	
				System.out.print("Ingrese posición: ");
				String posicion = sc.next();
				bus.setNombre(nombre);
				bus.setApellido(apellido);
				bus.setFechaNac(f);
				bus.setNacionalidad(nacionalidad);
				bus.setEstatura(estatura);
				bus.setPeso(peso);
				bus.setPosicion(posicion);
				System.out.println("Jugador modificado con éxito.");
			}
			catch(Exception e) {
				System.out.println("Para el ingreso de números decimales "
						+ "debe usar coma ',' como seprardor de decimales.");
			}
		}else {
			System.out.println("ERROR. Jugador no encontrado.");
		}
	}
	public static void cantTotal() {
		System.out.println("Cantidad total de jugadores: " + jugadores.size());
	}
	public static void elimnarJugador() {
		System.out.println("- Ingrese nombre de jugador a eliminar: ");
		String nombreM = sc.next();
		System.out.println("- Ingrese apellido de jugador a eliminar: ");
		String apellidoM = sc.next();
		Iterator<Jugador> iterator = jugadores.iterator();
		while(iterator.hasNext()) {
			Jugador jug = iterator.next();
			if(jug.getNombre().equals(nombreM) && jug.getApellido().equals(apellidoM)){
				iterator.remove();
				System.out.println("Jugador eliminado correctamente.");
			}
		}
	}
	public static void cantNacionalidad() {
		int i = 0;
		System.out.print("Ingrese Nacionalidad: ");
		String nacionalidad = sc.next();
		Iterator<Jugador> iterator = jugadores.iterator();
		while(iterator.hasNext()) {
			Jugador jug = iterator.next();
			if(jug.getNacionalidad().equals(nacionalidad));{
				i = i+1;
			}
		}
		System.out.println("Cantidad de jugadores de " +
                nacionalidad + ": " + i);
	}
}

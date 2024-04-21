package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	private static Scanner sc;
	private static List<Pais>  paises;
	private static List<DestinoTuristico> destinos;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		precargarPais();
		int op = 0;
		do {
			System.out.println("============================");
			System.out.println("1 - Alta de destino turistico.");
			System.out.println("2 - Mostrar todos los destinos turístico.");
			System.out.println("3 - Modificar el país de un destino turístico. ");
			System.out.println("4 - Borrar carga de destino turístico.");
			System.out.println("5 - Elimnar un destino turístico.");
			System.out.println("6 - Mostrar los destino turísticos por nombre.");
			System.out.println("7 - Mostrar todos los países.");
			System.out.println("8 - Mostar destinos turísticos de un país.");
			System.out.println("9 - Salir.");
			System.out.println("============================");
			System.out.print("  Ingrese una opción: ");
			op = sc.nextInt();
			sc.nextLine();
		    switch (op) {
		     	case 1:
		     		altaDestino();
		     		break;
		     	case 2:
		     		 mostrarDestinos();
	     			break;
		     	case 3:
		     		modificarPaisDestino();
	     			break;
		     	case 4:
		     		limpiarDestinos();
	     			break;
		     	case 5:
		     		eliminarDestino();
	     			break;
		     	case 6:
		     		mostrarDestinosNombre();
	     			break;
		     	case 7:
		     		 mostrarPaises();
	     			break;
		     	case 8:
		     		DestinosPais();
	     			break;
		     	case 9:
		     		System.out.println(" --- FIN DEL PROGRAMA  ---");
	     			break;
	     		default: System.out.println("Opción incorrecta.");
		    }
		
		}while( op != 9 );
	}
	public static void precargarPais() {
		if(paises == null) {
			paises = new ArrayList<>();
		}
		paises.add(new Pais(111, "Argentina"));
		paises.add(new Pais(222, "Francia"));
		paises.add(new Pais(333, "Italia"));
		paises.add(new Pais(444, "Belgíca"));
		paises.add(new Pais(555, "China"));
	}
	public static Pais buscarPais(int codigo) {
		Pais Encontrado = null;
		for(Pais pais: paises) {
			if(pais.getCodigo() == codigo) {
				Encontrado = pais;
				break;
			}
		}
		return Encontrado;
	}
	public static void altaDestino() {
		if(destinos == null) {
			destinos = new ArrayList<>();
		}
		System.out.println("===== Alta destino =====");
		System.out.print("Ingrese nuevo código de destino: ");
		Integer codigo = sc.nextInt();
		sc.nextLine();
		System.out.print("Ingrese nombre del destino: ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese código del país: ");
		Integer pais = sc.nextInt();
			try {
				System.out.print("Ingrese precio: ");
				double precio = sc.nextDouble();
				System.out.print("Ingrese cantidad de días: ");
				Integer cant = sc.nextInt();
				Pais p = new Pais();
				p = buscarPais(pais);
				if(p != null) {
					DestinoTuristico dest = new DestinoTuristico(codigo, nombre, precio, p, cant);
					if(destinos == null) {
						destinos = new ArrayList<>();
					}
					destinos.add(dest);
				} else {
					System.out.println("El código de país no existe.");
				}
			}catch(Exception e) {
				System.out.println("ERROR. Para el ingreso de números decimales "
						+ "debe usar coma ',' como seprardor de decimales.");
			}
	}
	public static void mostrarDestinos() {
		if(destinos != null) {
			System.out.println("===== Lista de destinos =====");
			destinos.forEach(d->System.out.println(d));
		}else {
			System.out.println("La lista está vacía.");
		}
	}
	public static DestinoTuristico buscarDestino(int codigo) {
		DestinoTuristico Encontrado = null;
		for(DestinoTuristico dest: destinos) {
			if(dest.getCodigo() == codigo) {
				Encontrado = dest;
				break;
			}
		}
		return Encontrado;
	}
	public static void modificarPaisDestino() {
		System.out.println("===== Modificar país de destino =====");
		System.out.print("Ingrese código de destino: ");
		Integer codigo = sc.nextInt();
		DestinoTuristico dest = new DestinoTuristico();
		try {
			dest = buscarDestino(codigo);
			if(dest != null) {
				System.out.print("Ingrese código de país para modificarlo del destino: ");
				Integer codPais = sc.nextInt();
				Pais p = new Pais();
				p = buscarPais(codPais);
				if(p != null) {
					dest.setPais(p);
					System.out.println("País de destino modificado.");
				} else {
					System.out.println("ERRRO. El código de país no existe.");
				}
			} else {
				System.out.println("ERROR. El código de destino no existe.");
			}
		}catch(Exception e){
			System.out.println("Aun no se han cargado destinos a la lista.");
		}
	}
	public static void limpiarDestinos(){
		/*Iterator<DestinoTuristico> iterator = destinos.iterator();
		while(iterator.hasNext()) {
			DestinoTuristico dest = iterator.next();
			iterator.remove();
		}*/
		destinos.clear();
		System.out.println("Destinos turisticos limpio.");
	}
	public static void eliminarDestino(){
		System.out.println("Ingrese código de destino a eliminar: ");
		Integer codigo = sc.nextInt();
		Iterator<DestinoTuristico> iterator = destinos.iterator();
		while(iterator.hasNext()) {
			DestinoTuristico dest = iterator.next();
			if(dest.getCodigo() == codigo){
				iterator.remove();
				System.out.println("Destino " + codigo + " eliminado.");
			}
		}
	}
	public static void mostrarDestinosNombre() {
		Collections.sort(destinos ,new Comparator<DestinoTuristico>() {
			@Override
			public int compare(DestinoTuristico d1, DestinoTuristico d2) {
				// TODO Auto-generated method stub
				return d1.getNombre().compareTo(d2.getNombre());
			}
		});
		for (DestinoTuristico dest : destinos) {
            System.out.println(dest.toString());
        }
	}
	public static void mostrarPaises() {
		System.out.println("===== Lista de paises =====");
		paises.forEach(p->System.out.println(p));	
	}
	public static void DestinosPais() {
		System.out.println("===== Lista de destinos según país =====");
		System.out.print("Ingrese código de pais: ");
		Integer codigo = sc.nextInt();
		for(DestinoTuristico dest: destinos) {
			if(dest.getPais().getCodigo() == codigo) {
				dest.toString();
			}else {
				System.out.println("ERROR. No se encontró el código de país.");
			}
		}
	}
}

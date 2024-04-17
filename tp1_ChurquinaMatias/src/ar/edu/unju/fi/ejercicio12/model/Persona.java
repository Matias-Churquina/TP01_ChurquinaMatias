package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNac = Calendar.getInstance();
	
	
	public Persona(String nombre, Calendar fecha_nac) {
		super();
		this.nombre = nombre;
		this.fechaNac = fecha_nac;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNac=" + fechaNac + "]";
	}

	public int edad() {
		Calendar ahora = Calendar.getInstance();
		long aux = (ahora.getTimeInMillis() - fechaNac.getTimeInMillis()) /1000/60/60/24/12/30;
		int e = (int)aux;
		return e;
	}
	
	public String Signo_zo() {
		String signo = "";
		int n1;
		int n2;
		int mes = fechaNac.get(Calendar.MONTH);
		int diaAnio = fechaNac.get(Calendar.DAY_OF_YEAR);
		Calendar f1 = Calendar.getInstance();
		Calendar f2 = Calendar.getInstance();
		switch (mes) {
			case 0:
				f1.set(20, 0, 0);
				f2.set(18, 1, 0);
				n1 = f1.get(Calendar.DAY_OF_YEAR);
				n2 = f2.get(Calendar.DAY_OF_YEAR);
				if(diaAnio >= n1 && diaAnio <= n2 );
				signo = "Acuario";
				break;
			case 1:
				f1.set(19, 1, 0);
				f2.set(20, 2, 0);
				n1 = f1.get(Calendar.DAY_OF_YEAR);
				n2 = f2.get(Calendar.DAY_OF_YEAR);
				if(diaAnio >= n1 && diaAnio <= n2 );
				signo = "Piscis";
				break;
			case 2:
				f1.set(21, 2, 0);
				f2.set(19, 3, 0);
				n1 = f1.get(Calendar.DAY_OF_YEAR);
				n2 = f2.get(Calendar.DAY_OF_YEAR);
				if(diaAnio >= n1 && diaAnio <= n2 );
				signo = "Aries";
				break;
			case 3:
				f1.set(20, 3, 0);
				f2.set(20, 4, 0);
				n1 = f1.get(Calendar.DAY_OF_YEAR);
				n2 = f2.get(Calendar.DAY_OF_YEAR);
				if(diaAnio >= n1 && diaAnio <= n2 );
				signo = "Tauro";
				break;
			case 4:
				f1.set(21, 4, 0);
				f2.set(20, 5, 0);
				n1 = f1.get(Calendar.DAY_OF_YEAR);
				n2 = f2.get(Calendar.DAY_OF_YEAR);
				if(diaAnio >= n1 && diaAnio <= n2 );
				signo = "Géminis";
				break;
			case 5:
				f1.set(21, 5, 0);
				f2.set(22, 6, 0);
				n1 = f1.get(Calendar.DAY_OF_YEAR);
				n2 = f2.get(Calendar.DAY_OF_YEAR);
				if(diaAnio >= n1 && diaAnio <= n2 );
				signo = "Canser";
				break;
			case 6:
				f1.set(23, 6, 0);
				f2.set(22, 7, 0);
				n1 = f1.get(Calendar.DAY_OF_YEAR);
				n2 = f2.get(Calendar.DAY_OF_YEAR);
				if(diaAnio >= n1 && diaAnio <= n2 );
				signo = "Leo";
				break;
			case 7:
				f1.set(23, 7, 0);
				f2.set(22, 8, 0);
				n1 = f1.get(Calendar.DAY_OF_YEAR);
				n2 = f2.get(Calendar.DAY_OF_YEAR);
				if(diaAnio >= n1 && diaAnio <= n2 );
				signo = "Virgo";
				break;
			case 8:
				f1.set(23, 8, 0);
				f2.set(22, 9, 0);
				n1 = f1.get(Calendar.DAY_OF_YEAR);
				n2 = f2.get(Calendar.DAY_OF_YEAR);
				if(diaAnio >= n1 && diaAnio <= n2 );
				signo = "Libra";
				break;
			case 9:
				f1.set(23, 9, 0);
				f2.set(21, 10, 0);
				n1 = f1.get(Calendar.DAY_OF_YEAR);
				n2 = f2.get(Calendar.DAY_OF_YEAR);
				if(diaAnio >= n1 && diaAnio <= n2 );
				signo = "Escorpio";
				break;
			case 10:
				f1.set(22, 10, 0);
				f2.set(21, 11, 0);
				n1 = f1.get(Calendar.DAY_OF_YEAR);
				n2 = f2.get(Calendar.DAY_OF_YEAR);
				if(diaAnio >= n1 && diaAnio <= n2 );
				signo = "Sagitario";
				break;
			case 11:
				f1.set(22, 11, 0);
				f2.set(19, 0, 0);
				n1 = f1.get(Calendar.DAY_OF_YEAR);
				n2 = f2.get(Calendar.DAY_OF_YEAR);
				if((diaAnio >= n1 && diaAnio <= 365) || (diaAnio >= 1 &&  diaAnio <= n2));
				signo = "Capricornio";
				break;
			case 12:
				break;	
		}
		return signo;
	}
	
	public String Estacion() {
		int diaAnio = fechaNac.get(Calendar.DAY_OF_YEAR);
		Calendar f2Verano = Calendar.getInstance();
		Calendar f3Otonio = Calendar.getInstance();
		Calendar f4Invierno = Calendar.getInstance();
		Calendar f5Primavera = Calendar.getInstance();
		f2Verano.set(20, 2, 0);
		f3Otonio.set(21, 5, 0);
		f4Invierno.set(21, 8, 0);
		f5Primavera.set(21, 11, 0);
		int n2 = f2Verano.get(Calendar.DAY_OF_YEAR);
		int n3 = f3Otonio.get(Calendar.DAY_OF_YEAR);
		int n4 = f4Invierno.get(Calendar.DAY_OF_YEAR);
		int n5 = f5Primavera.get(Calendar.DAY_OF_YEAR);
		if((diaAnio >= n5 && diaAnio <= 365) || (diaAnio >= 1 &&  diaAnio <= n2) ) {
			return "Verano";
		} else {
			if((diaAnio >= n2+1 && diaAnio <= n3-1)) {
				return "Otoño";
			}else {
				if(diaAnio >= n3 && diaAnio <= n4-1) {
					return "Invierno";
				}else {
					if(diaAnio >= n4 && diaAnio <= n5-1) {
						return "Primavera";
					} else {
						return "";
					}
				}
			}
		}
	}
	
	public void mostrarDatos() {
		System.out.println();
		System.out.println("-NOMBRE: " + nombre);
		System.out.println("-FECHA DE NACIMIENTO: " + fechaNac.getTime());
		System.out.println("Edad: " + edad() + " años");
		System.out.println("Signo del zodiaco: " + Signo_zo());
		System.out.println("Estación: " + Estacion());
	}
}

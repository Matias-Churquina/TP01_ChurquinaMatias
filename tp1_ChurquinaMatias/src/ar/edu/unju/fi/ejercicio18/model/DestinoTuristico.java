package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	private Integer codigo;
	private String nombre;
	private double precio;
	private Pais pais;
	private Integer cantDias;
	public DestinoTuristico(Integer codigo, String nombre, double precio, Pais pais, Integer cantDias) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.cantDias = cantDias;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Integer getCantDias() {
		return cantDias;
	}
	public void setCantDias(Integer cantDias) {
		this.cantDias = cantDias;
	}
	@Override
	public String toString() {
		return "DestinoTuristico [codigo=" + codigo + ", nombre=" + nombre + ", precio= $" + precio + ", pais=" + pais
				+ ", cantDias=" + cantDias + "]";
	}
	
	public DestinoTuristico() {
		// TODO Auto-generated constructor stub
	}
}

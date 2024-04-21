package ar.edu.unju.fi.ejercicio18model;

import java.util.List;

public class DestinoTuristico {
    private String codigo;
    private String nombre;
    private float precio;
    private Pais pais;
    private int dias;
	 
    public DestinoTuristico(String codigo, String nombre, float precio, Pais pais, int dias) {	
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.dias = dias;
	}

	public String toString() {
		return "codigo del destino: " + codigo + ", nombre del destino: " + nombre + ", precio: " + precio + "$ , " + pais
				+ ", dias: " + dias;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}
	
	
	
    
    
    
    
    
}


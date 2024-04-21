package ar.edu.unju.fi.ejercicio18model;

public class Pais {
   private String codigo;
   private String nombre;


public Pais(String codigo, String nombre) {
	this.codigo = codigo;
	this.nombre = nombre;
}


public String toString() {
	return "Codigo pais: " + codigo + ", Nombre del pais: " + nombre;
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
   
   
}
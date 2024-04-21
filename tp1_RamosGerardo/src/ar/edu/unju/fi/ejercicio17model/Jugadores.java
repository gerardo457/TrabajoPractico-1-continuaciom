package ar.edu.unju.fi.ejercicio17model;

import java.time.LocalDate;

public class Jugadores {
   private String nombre;
   private String apellido;
   private LocalDate fechadenac;
   private String nacionalidad;
   private float estatura;
   private float peso;
   private String posicion;
   
public Jugadores(String nombre, String apellido, LocalDate fechadenac, String nacionalidad, float estatura, float peso,
		String posicion) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.fechadenac = fechadenac;
	this.nacionalidad = nacionalidad;
	this.estatura = estatura;
	this.peso = peso;
	this.posicion = posicion;
}


@Override
public String toString() {
	return "Nombre: " + nombre + ", Apellido: " + apellido + ", Fecha de nacimiento: " + fechadenac + ", Nacionalidad: "
			+ nacionalidad + ", Estatura: " + estatura + " mts , Peso: " + peso + " kg , Posicion: " + posicion;
}

public int calcularEdad() {
	LocalDate actual = fechadenac.now();
	int edad = actual.getYear()-fechadenac.getYear();
	
	if(fechadenac.getMonthValue() > actual.getMonthValue() || actual.getMonthValue() == fechadenac.getMonthValue() && actual.getDayOfMonth() < fechadenac.getDayOfMonth()) {
	   edad--;	
	}
	return edad;	
}


public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getNacionalidad() {
	return nacionalidad;
}

public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}


public LocalDate getFechadenac() {
	return fechadenac;
}


public void setFechadenac(LocalDate fechadenac) {
	this.fechadenac = fechadenac;
}


public float getEstatura() {
	return estatura;
}


public void setEstatura(float estatura) {
	this.estatura = estatura;
}


public float getPeso() {
	return peso;
}


public void setPeso(float peso) {
	this.peso = peso;
}


public String getPosicion() {
	return posicion;
}


public void setPosicion(String posicion) {
	this.posicion = posicion;
}

}





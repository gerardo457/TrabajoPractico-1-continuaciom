package ar.edu.unju.fi.ejercicio6model;

import java.time.LocalDate;

public class Persona {
     private String dni;
     private String nombre;
     private LocalDate fechadenac;
     private String provincia;


public Persona(){	
}
 
public Persona(String dni, String nombre, LocalDate fechadenac, String provincia) {
	this.dni = dni;
	this.nombre = nombre;
	this.fechadenac = fechadenac;
	this.provincia = provincia;
}

public Persona(String dni, String nombre, LocalDate fechadenac) {
	this.dni = dni;
	this.nombre = nombre;
	this.fechadenac = fechadenac;
	this.provincia ="Jujuy";
}

public int calcularedad(){
	
	
	LocalDate fechaactual = LocalDate.now();
	int actual = fechaactual.getYear();
	int edad = actual - fechadenac.getYear();
	
	if(fechaactual.getMonthValue() < fechadenac.getMonthValue() || 
	   fechaactual.getMonthValue() == fechadenac.getMonthValue() && fechaactual.getDayOfMonth() < fechadenac.getDayOfMonth()) {
	   edad--;	
	}
	return edad;
}

public boolean mayor() {
	
	if(calcularedad() >= 18) {
		return true;
	}else {
	    return false;
	}
}

public void mostrardatos(Persona persona) {
	System.out.println(persona.toString());
	System.out.println("Edad: " + calcularedad() + " años");
	if(mayor()==true) {
	 System.out.print("La persona es mayor de edad");
	}else {
	 System.out.print("La persona no es mayor de edad");
	}
}

public String toString() {
	return "DNI: " + dni + ", Nombre: " + nombre + ", Fecha de nacimiento: " + fechadenac + ", Provincia: " + provincia
			;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public LocalDate getFechadenac() {
	return fechadenac;
}

public void setFechadenac(LocalDate fechadenac) {
	this.fechadenac = fechadenac;
}

public String getProvincia() {
	return provincia;
}

public void setProvincia(String provincia) {
	this.provincia = provincia;
}

}


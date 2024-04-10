package ar.edu.unju.fi.ejercicio6main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6model.Persona;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese nombre: ");
		String nombre = sc.next();
		System.out.print("Ingrese DNI : ");
		String dni = sc.next();
		System.out.print("Ingrese provincia: ");
		String provincia = sc.next();
		System.out.println("ingrese fecha de nacimiento");
	    System.out.print("año:");
	    int anio = sc.nextInt();
	    System.out.print("mes:");
	    int mes = sc.nextInt();
	    System.out.print("dia:");
	    int dia = sc.nextInt();
	    LocalDate fecha = LocalDate.of(anio, mes, dia);
	    
	    Persona persona1 = new Persona();
        persona1.setDni(dni);
        persona1.setNombre(nombre);
        persona1.setProvincia(provincia);
        persona1.setFechadenac(fecha);
        persona1.mostrardatos(persona1);
        System.out.println("");
        
        
	    Persona persona2 = new Persona(dni,nombre,fecha,provincia); 
	    persona2.mostrardatos(persona2);
	    System.out.println("");
        
        
        Persona persona3 = new Persona(dni,nombre,fecha);
        persona3.mostrardatos(persona3);
	}
    
	    
}

package ar.edu.unju.fi.ejercicio12main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		System.out.println("======Ingrese fecha de nacimiento======");
		System.out.print("Ingrese dia: ");
		int dia = sc.nextInt();
		System.out.print("Ingrese mes: ");
		int mes = sc.nextInt();
		System.out.print("Ingrese año: ");
		int anio = sc.nextInt(); 
		
		Calendar fecha = Calendar.getInstance();
		fecha.set(anio,mes-1,dia);
			
	    Persona persona = new Persona(nombre,fecha);
	    
	    System.out.println("Edad: " + persona.calcularEdad());
	    System.out.println("Signo: " + persona.signoZodiacal());
	    System.out.println("Estacion: " + persona.Estaciones());
	}

}

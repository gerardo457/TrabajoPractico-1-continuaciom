package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cant;
		do {
			System.out.print("Ingrese la cantidad de valores que quiere agregar: ");
			cant = sc.nextInt();
			if(cant <=4 || cant > 10) {
			  System.out.println("ERROR, la cantidad tiene que encontrarse dentro del rango [5,10]");
			}
		}while( cant <=4 || cant > 10 );
		
		String[] Array = new String[cant];
		
		int i=0;
		while(i < cant) {
		   System.out.print("Ingrese nombre: ");
		   String nombre = sc.next();
		   Array[i]=nombre;
		   i++;
		}
		
		 System.out.println("\nDesde la primera posicion");
		 System.out.println();
		  for(i = 0; i<cant ; i++) {
			System.out.println("Posicion: [" + i + "] nombre de la persona: " + Array[i]);
		}
		 System.out.println("\nDesde la ultima posicion");
		 System.out.println();
		  for(i = cant-1; i>=0 ; i--) {
			System.out.println("Posicion: [" + i +"] nombre de la persona: " + Array[i]);
		}
	}

}

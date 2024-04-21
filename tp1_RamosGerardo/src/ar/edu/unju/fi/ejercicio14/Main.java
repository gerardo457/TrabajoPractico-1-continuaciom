package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cant;
		do {
			System.out.print("Ingrese la cantidad de valores que quiere agregar: ");
			cant = sc.nextInt();
			if(cant <=2 || cant > 10) {
			  System.out.println("ERROR, la cantidad tiene que encontrarse dentro del rango [3,10]");
			}
		}while( cant <=2 || cant > 10 );
		
		Integer[] Array = new Integer[cant];
		
		int i=0;
		
		while(i<cant) {
		  System.out.print("ingrese numero: ");
		  int num = sc.nextInt();
		  Array[i]=num;
		  i++;
		}
	
		int suma= 0;
		
		for(i = 0; i < cant ;i++) {
			System.out.println("El valor almacenado en la posicion "+ i+ " es: " + Array[i]);
		    suma += Array[i];
		   }
	    	System.out.print("La suma de todo los valores es: " + suma);

	}

}

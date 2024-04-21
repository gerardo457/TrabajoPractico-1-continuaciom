package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[] Array = new String [5];
	
	for(int i=0;i<5;i++) {
	    System.out.print("Ingrese nombre: ");
	    String nombre = sc.next();
	    Array[i]=nombre;
	}
	
	int i=0;
	while(i<5) {
	  System.out.println("\nPosicion: [" + i + "] nombre de la persona: " + Array[i]);
	  System.out.println("Tamaño: " + Array[i].length());
	  i++;
	}
	
	System.out.print("ingrese el indice del elemento que quiere elminar: ");
	byte dato = sc.nextByte();
	
	byte j = 0;
	do{
	  if(dato==j){
		if(dato==4) {
		   Array[dato] = "";
		}else { 
		   System.out.println(Array[j+1]);
		   Array[dato] = Array[j+1];
		   dato++;
	     }
	   }
	  j++;
	 }while( j < 5);

	i=0;
	while(i<5) {
		  System.out.println("\nPosicion: [" + i + "] nombre de la persona: " + Array[i]);
		  System.out.println("Tamaño: " + Array[i].length());
		  i++;
	}
	
 }

}

package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	  
	 Scanner sc = new Scanner(System.in);
	 int num;
	 do {
          System.out.print("Introduzca un numero entre (1-9): ");
          num = sc.nextInt();
          if(num < 1 || num > 9) {
 	         System.out.println("Por favos, Introduzca un numero entre (1-9)");
 	      }
	 }while(num < 1 || num > 9);
     
     System.out.println("\nTabla de multiplicar del numero " + num +":");
     System.out.println("");
     for(int i = 1;i <= 10;i++) {
    	System.out.println( "           "+ num + " x " + i + " = " + num * i);
     }
	}

}

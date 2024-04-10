package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	  
      int num, res = 1, aux;
	  Scanner sc = new Scanner(System.in);
	  do{
	      System.out.print("Introduzca un numero: ");
	      num = sc.nextInt();
	      if(num < 0 || num > 10) {
	         System.out.println("Por favos, Introduzca un numero entre (0-10)");
	      }
	  }while(num < 0 || num > 10 );
	  aux = num;

	    while(num > 0){
	      res = res*num;
	      num--;
	    }
	  
	  
	  System.out.println("el factorial de " + aux + " es igual a: " + res);
	}

}

package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] Array = new Integer[8];
		int i=0;
		
		while(i<8) {
		  System.out.print("ingrese numero: ");
		  int num = sc.nextInt();
		  Array[i] = num;
		  i++;
		}
			
		for(i = 0; i<8;i++) {
			System.out.println("indice: " + i +", valor almacenado: " + Array[i]);
			System.out.println();
		}
	}

}

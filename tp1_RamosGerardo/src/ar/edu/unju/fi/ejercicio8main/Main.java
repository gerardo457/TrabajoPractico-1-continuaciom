package ar.edu.unju.fi.ejercicio8main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca numero: ");
		int numero = sc.nextInt();
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		
		calculadora.setN(numero);
		
		System.out.println("El resultado de la sumatoria es: " + calculadora.calcularSumatoria());
		
		System.out.println("El resultado de la productoria es: " + calculadora.calcularProductoria());
		
	}

}

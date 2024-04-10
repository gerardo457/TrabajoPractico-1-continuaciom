package ar.edu.unju.fi.ejercicio7main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7model.Empleado;

public class Main {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
      System.out.print("Ingrese nombre del empleado: ");
      String nombre = sc.next();
      System.out.print("Ingrese legajo del empleado: ");
      String legajo = sc.next();
      System.out.print("Ingrese salario del empleado: ");
      double salario = sc.nextDouble();
      
      Empleado empleado = new Empleado(nombre,legajo,salario);
      
      empleado.mostrardatos(empleado);
      
      empleado.aumentarsalario(empleado);
      
      empleado.mostrardatos(empleado);
      
      
	}

}

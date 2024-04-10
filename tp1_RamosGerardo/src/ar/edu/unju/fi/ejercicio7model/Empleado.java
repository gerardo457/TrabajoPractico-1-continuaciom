package ar.edu.unju.fi.ejercicio7model;

public class Empleado {
   private String nombre;
   private String legajo;
   private double salario;
   
   final double minimo = 210000.00;
   final double meritos = 20000.00;

   
   public Empleado(String nombre, String legajo, double salario) {
	
	this.nombre = nombre;
	this.legajo = legajo;
	if(salario >= minimo) {
	  this.salario = salario;
	}else{
		this.salario = minimo;	  
    }
  }


public void mostrardatos(Empleado empleado) {
  System.out.println("Nombre del empleado: " + nombre);
  System.out.println("Legajo: " + legajo);
  System.out.println("Salario: $" + salario);
}

public void aumentarsalario(Empleado empleado) {
	empleado.salario = empleado.salario + meritos;
}
   
}

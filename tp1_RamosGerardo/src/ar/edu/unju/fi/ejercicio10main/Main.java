package ar.edu.unju.fi.ejercicio10main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10model.Pizza;

public class Main {

	public static void main(String[] args) {
        int i = 0;
		Scanner sc = new Scanner(System.in);
		
	  do{
		 System.out.println("\n              DIAMETRO DE SU PIZZA");
		 System.out.println("20 (pizza pequeña), 30 (pizza mediana), 40 (pizza grande)");
		 System.out.print("\ningrese el diametro para su pizza: ");
		 int diametro = sc.nextInt();
		 System.out.print("quiere que su pizza tenga ingredientes especiales: ");
		 boolean lleva = sc.nextBoolean();
		 i++;
		 
		 Pizza pizza = new Pizza();
		 
		 pizza.setDiametro(diametro);
		 pizza.setEspeciales(lleva);
		 pizza.setPrecio(pizza.calcularPrecio());
		 pizza.setArea(pizza.calcularArea());
		 
		 System.out.println("\n** PIZZA "+ i +" **");
		 System.out.println("\nDiametro = "+ pizza.getDiametro());
		 System.out.println("Ingredientes especiales = "+ pizza.isEspeciales());
		 System.out.println("Precio Pizza = "+ pizza.getPrecio() + "$");
		 System.out.println("Area de la Pizza = "+ pizza.getArea());
		 
	  }while(i<3);
	  
	}

}

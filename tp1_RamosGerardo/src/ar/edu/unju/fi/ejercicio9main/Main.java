package ar.edu.unju.fi.ejercicio9main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9model.Producto;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		do {
		 Producto producto = generarproducto();	 
		 
		 System.out.println("Nombre: " + producto.getNombre());
		 System.out.println("Codigo: " + producto.getCodigo());
		 System.out.println("Precio: $" + producto.getPrecio());
		 System.out.println("Descuento: %"+ producto.getDescuento());
		 
		 System.out.println("Precio con descuento: $" + producto.calcularDescuento());
		 
		 i++;
		}while( i < 3);
	}
	
	
	 public static Producto generarproducto() {
	         int descuento; 
		     Producto producto = new Producto();
	    	 Scanner sc = new Scanner(System.in);
		     System.out.print("Ingrese nombre del producto: ");
			 String nombre = sc.nextLine();
		     System.out.print("Ingrese codigo: ");
			 String codigo = sc.nextLine();
			 System.out.print("Ingrese precio: ");
			 float precio = Float.parseFloat(sc.next());
		    
		    
		    do{
		        System.out.print("Ingrese descuento [0-50]: ");
		        descuento = sc.nextInt();
		    }while( descuento < 0 || descuento >50);
			
		    producto.setNombre(nombre);
		    producto.setCodigo(codigo);
			producto.setPrecio(precio);
			producto.setDescuento(descuento);
			
		return producto;
	    }

}

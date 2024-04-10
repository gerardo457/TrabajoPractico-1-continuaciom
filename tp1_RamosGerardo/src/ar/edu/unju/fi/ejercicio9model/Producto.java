package ar.edu.unju.fi.ejercicio9model;

public class Producto {
   private String nombre;
   private String codigo;
   private float precio;
   private int descuento;
   
   
   public Producto() {
	   
   }
   
   public float calcularDescuento() {
	   	   
	   return (precio*descuento)/100; 
   }
   

   public String getNombre() {
	return nombre;
   }   

   public void setNombre(String nombre) {
	this.nombre = nombre;
   }

   public String getCodigo() {
	return codigo;
   }

   public void setCodigo(String codigo) {
	this.codigo = codigo;
   }

   public float getPrecio() {
	return precio;
   }

   public void setPrecio(float precio) {
	this.precio = precio;
   }

   public int getDescuento() {
	return descuento;
   }

   public void setDescuento(int descuento) {
	this.descuento = descuento;
   }
   
   
}

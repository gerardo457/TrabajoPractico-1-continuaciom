package ar.edu.unju.fi.ejercicio10model;

public class Pizza {
   private int diametro;
   private int precio;
   private double area;
   private boolean especiales;
   
   final int especiales20 = 500;
   final int especiales30 = 750;
   final int especiales40 = 1000;

   public Pizza() {
	   
   }
   
   public int calcularPrecio(){
	   if(diametro <= 20 && especiales == false) {
		   precio = 4500;
	   }else if(diametro <= 20 && especiales == true){
		   precio = 4500 + especiales20;
	   }else if(diametro <= 30 && especiales == false){
		   precio = 4800;
	   }else if(diametro <= 30 && especiales == true) {
		   precio = 4800 + especiales30;
	   }else if((diametro <= 40 || diametro > 40) && especiales == false) {
		   precio = 5500;
	   }else if((diametro <= 40 || diametro > 40) && especiales == true) {
		   precio = 5500 + especiales40;
	   }
	  return precio;
   }
   
   public double calcularArea() {
	  return Math.PI*Math.pow((diametro/2),2);
   }
   
   public int getDiametro() {
	return diametro;
   }

   public void setDiametro(int diametro) {
	this.diametro = diametro;
   }

   public int getPrecio() {
	return precio;
   } 

   public void setPrecio(int precio) {
	this.precio = precio;
   }
   public double getArea() {
	return area;
   }

   public void setArea(double area) {
	this.area = area;
   }

   public boolean isEspeciales() {
	return especiales;
   }

   public void setEspeciales(boolean especiales) {
	this.especiales = especiales;
   }
   
   
}

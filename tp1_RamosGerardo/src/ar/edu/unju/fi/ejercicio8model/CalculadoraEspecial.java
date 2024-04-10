package ar.edu.unju.fi.ejercicio8model;

public class CalculadoraEspecial {
   private int n;
 
   public CalculadoraEspecial() {
   
   }

   public int getN() {
	return n;
   }

   public void setN(int n) {
	 this.n = n;
   }
   
   public double calcularSumatoria() {
	   double res = 0;
	   for(double k=1 ; k <= n ; k++) {
		  double sumatoria = Math.pow(k*(k+1)/2, 2);
		  res += sumatoria;
	   }
	   return res;
   }
   
   public int calcularProductoria() {
	   int resProductoria = 0;
	   for(int k=1 ; k<=n ; k++) {
		  int sumatoria = k*(k+4);
		  resProductoria += sumatoria;
	   }
	   return resProductoria;
   }
   
  
}


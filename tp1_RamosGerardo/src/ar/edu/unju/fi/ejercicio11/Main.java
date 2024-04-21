package ar.edu.unju.fi.ejercicio11;

public class Main {
	public static void main(String[] args) {
		int num = 80;
		for(int j = 40,i = 2; j>0 ;j--, i++) {
			System.out.print(num +" ");
			num += j-i-1;
		}
	}

}

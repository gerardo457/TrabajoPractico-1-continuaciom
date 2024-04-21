package ar.edu.unju.fi.ejercicio12model;

import java.util.Calendar;

public class Persona {
  private String nombre;
  private Calendar fechadenac;
  
  
  
  public Persona(String nombre, Calendar fechadenac) {
	this.nombre = nombre;
	this.fechadenac = fechadenac;
}

public long calcularEdad() {
	  Calendar hoy = Calendar.getInstance();
	  long fechaactual = hoy.getTimeInMillis();
	  long nac = fechadenac.getTimeInMillis();
	  long diferencia = fechaactual-nac;
	  long edad = diferencia/1000/60/60/24/365;
	  
	  return edad;
  }
  
  public String signoZodiacal() {
	  String signo = null;
	  
	  if(fechadenac.get(fechadenac.MONTH)==2 && fechadenac.get(fechadenac.DAY_OF_MONTH)>=21 || fechadenac.get(fechadenac.MONTH)==3 && fechadenac.get(fechadenac.DAY_OF_MONTH) <=20) {
	      signo = "Aries";
	  }else if(fechadenac.get(fechadenac.MONTH)==3 && fechadenac.get(fechadenac.DAY_OF_MONTH)>=21 || fechadenac.get(fechadenac.MONTH)==4 && fechadenac.get(fechadenac.DAY_OF_MONTH) <=20) {
		  signo = "Tauro";
	  }else if(fechadenac.get(fechadenac.MONTH)==4 && fechadenac.get(fechadenac.DAY_OF_MONTH)>=21 || fechadenac.get(fechadenac.MONTH)==5 && fechadenac.get(fechadenac.DAY_OF_MONTH) <=20){
		  signo = "Geminis";
	  }else if(fechadenac.get(fechadenac.MONTH)==5 && fechadenac.get(fechadenac.DAY_OF_MONTH)>=21 || fechadenac.get(fechadenac.MONTH)==6 && fechadenac.get(fechadenac.DAY_OF_MONTH) <=20) {
		  signo = "Cancer";
	  }else if(fechadenac.get(fechadenac.MONTH)==6 && fechadenac.get(fechadenac.DAY_OF_MONTH)>=21 || fechadenac.get(fechadenac.MONTH)==7 && fechadenac.get(fechadenac.DAY_OF_MONTH) <=20) {
		  signo = "Leo";
	  }else if(fechadenac.get(fechadenac.MONTH)==7 && fechadenac.get(fechadenac.DAY_OF_MONTH)>=21 || fechadenac.get(fechadenac.MONTH)==8 && fechadenac.get(fechadenac.DAY_OF_MONTH) <=20) {
		  signo = "Virgo";
	  }else if(fechadenac.get(fechadenac.MONTH)==8 && fechadenac.get(fechadenac.DAY_OF_MONTH)>=21 || fechadenac.get(fechadenac.MONTH)==9 && fechadenac.get(fechadenac.DAY_OF_MONTH) <=20) {
		  signo = "Libra";
	  }else if(fechadenac.get(fechadenac.MONTH)==9 && fechadenac.get(fechadenac.DAY_OF_MONTH)>=21 || fechadenac.get(fechadenac.MONTH)==10 && fechadenac.get(fechadenac.DAY_OF_MONTH) <=20) {
		  signo = "Escorpio";
	  }else if(fechadenac.get(fechadenac.MONTH)==10 && fechadenac.get(fechadenac.DAY_OF_MONTH)>=21 || fechadenac.get(fechadenac.MONTH)==11 && fechadenac.get(fechadenac.DAY_OF_MONTH) <=20){
		  signo = "Sagitario";
	  }else if(fechadenac.get(fechadenac.MONTH)==11 && fechadenac.get(fechadenac.DAY_OF_MONTH)>=21 || fechadenac.get(fechadenac.MONTH)==0 && fechadenac.get(fechadenac.DAY_OF_MONTH) <=20) {
		  signo = "Capricornio";
	  }else if(fechadenac.get(fechadenac.MONTH)==0 && fechadenac.get(fechadenac.DAY_OF_MONTH)>=21 || fechadenac.get(fechadenac.MONTH)==1 && fechadenac.get(fechadenac.DAY_OF_MONTH) <=20) {
		  signo = "Acuario";
	  }else if(fechadenac.get(fechadenac.MONTH)==1 && fechadenac.get(fechadenac.DAY_OF_MONTH)>=21 || fechadenac.get(fechadenac.MONTH)==2 && fechadenac.get(fechadenac.DAY_OF_MONTH) <=20) {
		  signo = "Picsis";
	  }
	return signo;
  }
  
  public String Estaciones() {
	String estacion;
	  if(fechadenac.get(fechadenac.MONTH)== 11 &&  fechadenac.get(fechadenac.DAY_OF_MONTH)>=21 ||fechadenac.get(fechadenac.MONTH) == 2 &&  fechadenac.get(fechadenac.DAY_OF_MONTH)<=20 || fechadenac.get(fechadenac.MONTH) == 0 || fechadenac.get(fechadenac.MONTH) == 1){
		  estacion = "Verano";
	  }else if(fechadenac.get(fechadenac.MONTH)== 2 &&  fechadenac.get(fechadenac.DAY_OF_MONTH)>=21 ||fechadenac.get(fechadenac.MONTH)== 5 &&  fechadenac.get(fechadenac.DAY_OF_MONTH)<=20 || fechadenac.get(fechadenac.MONTH) == 4 || fechadenac.get(fechadenac.MONTH) == 5){
		  estacion = "Otoño";
	  }else if(fechadenac.get(fechadenac.MONTH)== 5 &&  fechadenac.get(fechadenac.DAY_OF_MONTH)>=21 ||fechadenac.get(fechadenac.MONTH)== 8 &&  fechadenac.get(fechadenac.DAY_OF_MONTH)<=20 || fechadenac.get(fechadenac.MONTH) == 6 || fechadenac.get(fechadenac.MONTH) == 7){
		  estacion = "Invierno";
	  }else{
		  estacion = "Primavera";
	  }
	 return estacion;
  }
}

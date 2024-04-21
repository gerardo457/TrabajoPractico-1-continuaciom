package ar.edu.unju.fi.ejercicio17main;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17model.Jugadores;

public class Main {
	private static List<Jugadores> jugador;
	
	public static void main(String[] args) {
		byte opc;
		Scanner sc = new Scanner(System.in);
		
		do {
	    	System.out.println("\n========================================================"+
	    			       "\n 1 – Alta de jugador" +
			               "\n 2 – Mostrar datos del jugador"+
				           "\n 3 – Mostrar todos los jugadores ordenados por apellido."+
				           "\n 4 – Modificar los datos de un jugador"+
				           "\n 5 – Eliminar un jugador"+
				           "\n 6 – Mostrar cantidad total de jugadores"+
				           "\n 7 – Mostra cantidad de jugadores que pertenecen a una nacionalidad"+
				           "\n 8 – Salir "+
				           "\n==========================================================");
	    	              System.out.print(" Seleccione opcion: ");
	    	            try {
	    	            	opc= sc.nextByte();
						} catch (Exception e) {
							System.out.println("Tiene que ingresar las opciones que indica el menu");
	    	          		opc=8;
						}
	    	
	    	 switch(opc) {       
	    	    case 1:        
	    	    	            Altadejugador();
	    	    	            
	    	    	break;
	    	    case 2:       
	    	              	    Mostrajugador();
	    	    	break;
	    	    case 3:         Mostrarapellido();       
	    	    	break;
	    	    case 4:         Modificarjugador();
	    	    	break;
	    	    case 5:         Eliminarjugador();
	    	    	break;
	    	    case 6:         Cantjugadores();
	    	    	break;
	    	    case 7:         Mostrarnacionalidad();
	    	    	break;
	    	    case 8:   System.out.println("fin de la operacion");
	    	    	break;
	    	    default:  System.out.println("opcion no valida");
	    	        break;
	    	 }
	    	
		}while(opc!=8);
	}
    
	public static void Altadejugador() {
		 	
		 if(jugador == null) {
			jugador = new ArrayList<>();
		 }
		 
		     boolean pass;
		     Scanner sc = new Scanner(System.in);
		     System.out.print("ingrese nombre:");
             String nombre = sc.nextLine();
             System.out.print("ingrese apellido:");
             String apellido = sc.nextLine();
             LocalDate fechaconformato;
             do {
                 try {
            	       System.out.print("ingrese fecha de nacimiento yyyy-mm-dd :");
        	           String fechasinformato = sc.next();
        	           fechaconformato = LocalDate.parse(fechasinformato);
        	           pass=true;
	     		} catch (Exception e) {
	     			   System.out.println("ERROR, La fecha esta mal ingresada");
				       fechaconformato = LocalDate.now();
			           pass=false;
			    }
             }while(pass==false);
             
             System.out.print("ingrese nacionalidad:");
             String nacionalidad = sc.next();
             
             float estatura;
             do {
               try {
                	 System.out.print("ingrese estatura:");
                     String Cadestatura=sc.next();
                     estatura = Float.parseFloat(Cadestatura);
                     pass = true;
			   }catch (Exception e) {
			     System.out.println("Error, La altura ingresada no es valida");
			     pass=false;
			     estatura= 0;
			   }
             }while(pass==false);
             
             
             float peso;
             do {
                 try {
                	   System.out.print("ingrese peso:");
                       String Cadpeso = sc.next();
                       peso = Float.parseFloat(Cadpeso);
                       pass = true;
  			    }catch (Exception e) {
  			           System.out.println("Error, El peso ingresado no es valido");
  			           pass=false;
  			           peso= 0;
  			       }
             } while(pass==false);
                       
             System.out.print("ingrese posicion(delantero, medio, defensa, arquero): ");
             String pos = sc.next();        
            	
             jugador.add(new Jugadores(nombre, apellido, fechaconformato, nacionalidad, estatura, peso, pos));
		}             
	
	  public static void Mostrajugador() {
		  
		Scanner sc = new Scanner(System.in);
		boolean pass=false;
		
	    if(jugador==null) {
	       System.out.println("No hay jugadores registrados");
	    }else {
		  System.out.print("ingrese nombre: ");
          String nom = sc.nextLine();
          System.out.print("ingrese apeliido: ");
          String ape = sc.nextLine();
           
           System.out.println("\n========== Datos del jugador "+ nom +" "+ape + " ==========");
           
            for(int i=0; i< jugador.size();i++) {
	        	 
	            if(nom.compareTo(jugador.get(i).getNombre())==0 && ape.compareTo(jugador.get(i).getApellido())==0) {
	            	pass=true;
	            	System.out.println(jugador.get(i).toString());
	             }
	          }
            if(pass==false) {
            	System.out.println("\nNo se encontro el jugador");
            }
	    }
         
	 }
	  
	  public static void Mostrarapellido() {
		    
		    if(jugador==null) {
		       System.out.println("No hay jugadores registrados");
		    }else {
               jugador.sort(Comparator.comparing(Jugadores::getApellido));	
               System.out.println("\n========= Ordenado por apellidos =========");
            
               jugador.forEach(j->System.out.println(j));
		    }
	  }
	  
	  public static void Modificarjugador() {
		  Scanner sc = new Scanner(System.in);
		  boolean encontrado=false;
		  if(jugador==null) {
			       System.out.println("No hay jugadores registrados");
		  }else {
		     System.out.print("Ingrese nombre: ");
             String nom = sc.nextLine();
             System.out.print("Ingrese apeliido: ");
             String ape = sc.nextLine();
          
             for(int i=0; i< jugador.size();i++) {
	        	 
	               if(nom.compareTo(jugador.get(i).getNombre())==0 && ape.compareTo(jugador.get(i).getApellido())==0) {
	            	   encontrado=true;
	                   System.out.println("\n======== Modificar Datos ========");
	            	
	                   System.out.print("\ningrese nombre:");
	            	   String nombre = sc.nextLine();
	            	   jugador.get(i).setNombre(nombre);
	            	
	                   System.out.print("ingrese apellido:");
	                   String apellido = sc.nextLine();
	                   jugador.get(i).setApellido(apellido);
	                
	            	   LocalDate fechaconformato;
	            	   boolean pass; 
	       	          
	            	   do {
	                        try {
	            	              System.out.print("ingrese fecha de nacimiento yyyy-mm-dd :");
	        	                  String fechasinformato = sc.next();
	        	                  fechaconformato = LocalDate.parse(fechasinformato);
	        	                  jugador.get(i).setFechadenac(fechaconformato);
	        	                  pass=true;
		                	}catch (Exception e) {
		     			       System.out.println("ERROR, La fecha esta mal ingresada");
				               pass=false;
				             }
	                    }while(pass==false);
	            	
	       	            System.out.print("ingrese nacionalidad:");
	            	    String nac = sc.next();
	            	    jugador.get(i).setNacionalidad(nac);
	            	
	                	float estatura;
	            	   
	                	do {
	                       try {
	                         	 System.out.print("ingrese estatura:");
	                             String Cadestatura=sc.next();
	                             estatura = Float.parseFloat(Cadestatura);
	                             jugador.get(i).setEstatura(estatura);
	                             pass = true;
	      			        }catch (Exception e) {
	      			             System.out.println("Error, La altura ingresada no es valida");
	      			             pass=false;
	      			        }
	                   }while(pass==false);
	            	         	
	                	float peso;
	                   
	                    do {
	                       try {
	                   	         System.out.print("ingrese peso:");
	                             String Cadpeso = sc.next();
	                             peso = Float.parseFloat(Cadpeso);
	                             jugador.get(i).setPeso(peso);
	                             pass = true;
	     			      }catch (Exception e) {
	     			             System.out.println("Error, El peso ingresado no es valido");
	     			             pass=false;
	     			       }
	                    } while(pass==false);
	            	
	            	    System.out.print("ingrese posicion(delantero, medio, defensa, arquero):");
	                	String pos = sc.next();
	                	jugador.get(i).setPosicion(pos);
	            	
	               }
	          }
                if(encontrado==false) {
                	System.out.println("\nNo se encontro el jugador");
                }
		  }
	  }
	  
	  public static void Eliminarjugador() {
	   Scanner sc = new Scanner(System.in);
	   boolean encontrado=false;
	   
	   if(jugador==null) {
	       System.out.println("No hay jugadores registrados");
       }else {
		  System.out.print("ingrese nombre: ");
          String nom = sc.nextLine();
          System.out.print("ingrese apeliido: ");
          String ape = sc.nextLine();
		  
		  Iterator iterator= jugador.iterator();
		  
		   while(iterator.hasNext()){
		 	   Jugadores j = (Jugadores)iterator.next();
			   
		 	    if(j.getApellido().equals(ape) && j.getNombre().equals(nom)) {
		 	    	encontrado=true;
				    iterator.remove();		 
				    System.out.println("======== El jugador "+ nom +" "+ ape + " ha sido eliminado ========");
				    
			    }
		    }
		   if(encontrado==false) {
           	  System.out.println("\nNo se encontro el jugador");
           }
       }
			  		  
   }
	  
	  public static void Cantjugadores() {
		 int cant=0;
		 if(jugador!=null) {
		       
		   for(int i=0; i< jugador.size();i++) {
	          cant++;
	       } 	
		 }
		 
		 System.out.println("La cantidad total de jugadores es: " + cant);
	  }
	  
	  public static void Mostrarnacionalidad() {
		  Scanner sc = new Scanner(System.in);
		  int cant=0;
		  if(jugador==null) {
		      System.out.println("No hay jugadores registrados");
	      }else {
             System.out.print("ingrese nacionalidad: ");
             String nac = sc.next();
          
             System.out.println("\n========= Jugadores con la nacionalidad "+ nac +" =========");
              for(int i=0; i< jugador.size();i++) {
	              if(nac.compareTo(jugador.get(i).getNacionalidad())==0) {
	                 System.out.println(jugador.get(i).toString());
	                 cant++;
	             }
	           }
       	       System.out.println("\nJugadores encontrados: " + cant);
              
	      }
	  }
	  

	  	  
}

package ar.edu.unju.fi.ejercicio18main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17model.Jugadores;
import ar.edu.unju.fi.ejercicio18model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18model.Pais;

public class Main {
      private static List<Pais> paises;
      private static List<DestinoTuristico> turisticos;
      
	public static void main(String[] args) {
		byte opc;
		Scanner sc = new Scanner(System.in);
		Precargardatospais();
		
		do {
	    	System.out.println("========================================="+
	    			       "\n 1 – Alta de destino turístico " +
			               "\n 2 – Mostrar todos los destinos turísticos"+
				           "\n 3 – Modificar el país de un destino turístico"+
				           "\n 4 – Limpiar el ArrayList de destino turísticos"+
				           "\n 5 – Eliminar un destino turístico"+
				           "\n 6 – Mostrar los destinos turísticos ordenados por nombre"+
				           "\n 7 – Mostrar todos los países"+
				           "\n 8 – Mostrar los destinos turísticos que pertenecen a un país"+
				           "\n 9 – Salir "+
				           "\n=========================================");
	    	              System.out.print(" Seleccione opcion: ");
	    	              try{
	    	                opc= sc.nextByte();
	    	              } catch (Exception e) {
	    	          		   System.out.println("Tiene que ingresar las opciones que indica el menu");
	    	          		   opc=9;
	    	              }
	    	             
	    	 switch(opc) {       
	    	    case 1:       Altadestino();    	
	    	    	break;
	    	    case 2:       Mostrardestinos();          	    
	    	    	break;
	    	    case 3:       Modificarpais();
	    	    	break;
	    	    case 4:       Limpiardestinos();
	    	    	break;
	    	    case 5:       Eliminardestino();
	    	    	break;
	    	    case 6:        Ordenarnombre();
	    	    	break;
	    	    case 7:        Mostrarpaises();
	    	    	break;
	    	    case 8:        Mostrardestinoscodigo();
	    	    	break;
	    	    case 9:   System.out.println("fin de la operacion");
	    	    	break;
	    	    default:  System.out.println("opcion no valida");
	    	        break;
	    	 }
	    	
		}while(opc!=9);
	}
	
	  public static void Precargardatospais() {
		if(paises==null) {
			paises = new ArrayList<>();
		}
		paises.add(new Pais("120","Argentina"));
		paises.add(new Pais("100","Bolivia"));
		paises.add(new Pais("125","Brasil"));
		paises.add(new Pais("128","Uruguay"));
	  }
	  
	  
	  public static void Altadestino(){
		  if(turisticos == null) {
			  turisticos = new ArrayList<>();
		  }
		  
		     boolean pass;
		     Scanner sc = new Scanner(System.in);
		     
		     System.out.print("ingrese nombre del destino turistico:");
             String nombre = sc.nextLine();
             System.out.print("ingrese codigo del destino turistico:");
             String codigo = sc.next();
 
          float precio;
          do {
            try {
             	 System.out.print("ingrese precio:");
                  String Cadestatura=sc.next();
                  precio = Float.parseFloat(Cadestatura);
                  pass = true;
			   }catch (Exception e) {
			     System.out.println("Error, El precio ingresado no es valido");
			     pass=false;
			     precio= 0;
			   }
          }while(pass==false);
                    
          System.out.print("ingrese cantidad de dias:");
          int dias = sc.nextInt();
          
          Pais pais=null;
          do {
              System.out.print("ingrese codigo del pais destino:");
              String codpais = sc.next();
              pais = encontropais(codpais);
              pass=true;
              if(pais==null){
                 System.out.println("Error, No se encontro el pais");
                 pass=false;}
           }while(pass==false);
         	
          turisticos.add(new DestinoTuristico(codigo, nombre, precio, pais, dias));
	  }
	  
	  
	  public static Pais encontropais(String codpais){
		  Pais encontrado = null;
		  for(int i=0; i<paises.size(); i++) {
			  if(codpais.compareTo(paises.get(i).getCodigo())==0) {
				  encontrado=paises.get(i);
			  }
		  }
		  return encontrado;
	  }

     public static void Mostrardestinos(){
       if(turisticos==null) {
    	  System.out.println("\nNo se han registrado destinos turisticos");
       }else {
    	  System.out.println("\n========= Destinos turisticos =========");
	      turisticos.forEach(t->System.out.println(t));
       }
    }
     
     
     public static void Modificarpais(){
    	Scanner sc = new Scanner(System.in);
    	boolean pass=false;
    	 
      if(turisticos==null) {
       	 System.out.println("\nNo se han registrado destinos turisticos");
      }else {
         System.out.print("ingrese el codigo del destino turistico: ");
    	 String codturistico= sc.next();
    	
    	 for(int i=0;i < turisticos.size();i++) {
    	   if(codturistico.compareTo(turisticos.get(i).getCodigo())==0) {
    		   pass=true;
    		   System.out.println("\n====== Modificar pais ======");
    		   System.out.print("\ningrese el nombre del pais: ");
    	   	   String pais= sc.next();
    	   	   turisticos.get(i).getPais().setNombre(pais);
    	     }
    	  }
    	 
    	  if(pass==false) {
       	    System.out.println("\nNo se escontro el destino turistico");
          }
        }
     }
     
     public static void Limpiardestinos(){
    	 if(turisticos==null) {
    		System.out.println("\nNo se han registrado destinos turisticos");
    	 }else {
    	    turisticos.clear();
    	    System.out.println("El ArrayList de destino turísticos ha sido limpiado");}
     }
     
     public static void Eliminardestino(){
    	 Scanner sc = new Scanner(System.in);
    	 boolean pass=false;
      if(turisticos==null) {
         System.out.println("\nNo se han registrado destinos turisticos");
      }else {
    	 Iterator iterator= turisticos.iterator();
    	 
    	 System.out.print("ingrese codigo del destino que quiere eliminar: ");
    	 String dato = sc.next();
    	 
    	 while(iterator.hasNext()) {
    		DestinoTuristico d = (DestinoTuristico)iterator.next();
    		
    		if(d.getCodigo().equals(dato)) {
    			pass=true;
    			iterator.remove();
    			System.out.println("\nSe ha eliminado correctamente");
    		}
    		
    	 }
    	 if(pass==false){
    		 System.out.println("\nNo se encontro el destino turistico");
    	 }
      }
    	 
    	 
     }
     public static void Ordenarnombre(){
    	 if(turisticos==null) {
           	 System.out.println("\nNo se han registrado destinos turisticos");
          }else {
        	 System.out.println("\n============= Ordenados por nombre =============");
    	     turisticos.sort(Comparator.comparing(DestinoTuristico::getNombre));
    	     turisticos.forEach(t->System.out.println(t));
          }
     }

     public static void Mostrarpaises(){
       System.out.println("\n============= Paises =============");	 
       paises.forEach(p->System.out.println(p));
     }
     
     public static void Mostrardestinoscodigo(){
    	Scanner sc = new Scanner(System.in);
    	int cant = 0;
    	boolean mostrar=false;
       if(turisticos==null) {
          System.out.println("\nNo se han registrado destinos turisticos");
      }else {
    	 System.out.print("ingrese el codigo pais: ");
    	 String codpais= sc.next();
    	 
    	 
    	 for(int i=0;i<turisticos.size();i++) {
    		 if(codpais.compareTo(turisticos.get(i).getPais().getCodigo())==0) {
    			 if(mostrar==false) {
    				mostrar=true;
    				System.out.println("\n============= Destinos turisticos de "+ turisticos.get(i).getPais().getNombre() +" =============");
    			 }
    			 cant++;
    			 System.out.println(turisticos.get(i));
    		 }
    	 }
    	 System.out.println("Destinos turisticos encontrados: " + cant );
      }
     }
     
}
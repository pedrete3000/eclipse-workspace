package m5ejercicioextraclase;

import java.util.ArrayList;
import java.util.Scanner;

public class M5EjerciciExtraclase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		byte i;
		String marca, busqueda;
		String acierto = "uno";
		
		  ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    cars.add("Dacia");
		    cars.add("Renault");

		    System.out.println("Introduzca la marca de coche que busca :");
		    marca = sc.nextLine();
		    
		    for (i = 0; i< cars.size();i++) {
		    	
		    	busqueda = cars.get(i);
		    	
		    	if (busqueda.equals(marca)) {
		    		acierto = marca;
		    			    		}
		    }
		    
		  if (acierto.equals(marca)) {
			  
		    System.out.println("La marca "+marca+" es una de las que tenemos disponibles");
		    
		  }
		  
		  else {
		    			System.out.println("La marca que buscas no está en nuestro concesionario");
	}

	}
}



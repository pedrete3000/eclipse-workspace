package pooclase2;

import java.util.ArrayList;
import java.util.Scanner;

public class POOClase2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String marca, modelo;
		int i=0;
		boolean encontrado = false;
		ArrayList<Ordenador> listado = new ArrayList<Ordenador>();
		
			Ordenador cpu1 = new Ordenador("Packard Bell", "345HT","Pentium", 16, 1000 );
			Ordenador cpu2 = new Ordenador("HP", "4700P","PentiumII", 32, 1000 );
			Ordenador cpu3 = new Ordenador("Acer", "345HT","Acer", 32, 500 );
			Ordenador cpu4 = new Ordenador("Lenovo", "yoga","Core i5", 64, 1000 );
			Ordenador cpu5 = new Ordenador("Asus", "Aspire5","Core i7", 64, 1000 );
			
			listado.add(cpu1);
			listado.add(cpu2);
			listado.add(cpu3);
			listado.add(cpu4);
			listado.add(cpu5);
			
			int tamaño = listado.size();
			for (int j=0; j<tamaño;j++) {
				System.out.println(listado.get(j)); }
			
			System.out.println("Introduzca la Marca que está buscando: ");
			marca = sc.nextLine();
			System.out.println("Introduzca el Modelo que está buscando: ");
			modelo = sc.nextLine();
			
			while (i<tamaño && !encontrado) {
			if (listado.get(i).getMarca().equalsIgnoreCase(marca) && listado.get(i).getModelo().equalsIgnoreCase(modelo)) {
				encontrado = true;
			}
			i++;
			}
			
			if (encontrado) {
				System.out.println("Tenemos el Modelo y Marca que está buscando");
			} else
				System.out.println("Lo sentimos, no tenemos el modelo y Marca que busca");
			
			System.out.println(listado);
			//primera variacion del programa. Comento para realizar la segunda
			/*cpu1.programa("Eclipse");
			
			System.out.println(cpu1.getMarca());
			
			System.out.println(cpu2.getProcesador());
			
			System.out.println(cpu2.toString());
			System.out.println(cpu1.toString());*/

		}

	}
	

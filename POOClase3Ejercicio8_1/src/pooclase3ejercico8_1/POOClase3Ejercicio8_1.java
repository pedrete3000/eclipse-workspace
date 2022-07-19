package pooclase3ejercico8_1;

import java.util.ArrayList;
import java.util.Scanner;

public class POOClase3Ejercicio8_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Hotel> listado = new ArrayList<Hotel>();
		Hotel hotel1 = new Hotel("Ritz", 300, 30, 10000);
		Hotel hotel4 = new Hotel("H10", 300, 30, 10000);
		Hotel hotel5 = new Hotel("Ilunion", 300, 30, 10000);

		listado.add(hotel1);
		listado.add(hotel4);
		listado.add(hotel5);
		System.out.println(listado);

		boolean sortir = false;
		int posicion;
		do {
			switch (menu()) {
			case 1:
				posicion = buscarHotel(listado);
				crearHotel(listado, posicion);
				verHoteles(listado);
				break;
			case 2:
				darDeBajaHotel(listado);
				break;
			case 0:
				System.out.println("gracias por usar este programa. Adios");
				sortir = true;
				break;
			}
		} while (!sortir);

		System.out.println(listado);
	}

	private static int menu() {

		byte opcio;
		final byte MINIMO = 0;
		final byte MAXIMO = 4;

		do {
			System.out.println("\nMENú PRINCIPAL");
			System.out.println("1. Opció 1. Crear Hotel");
			System.out.println("2. Opció 2.Dar de Baja Hotel");
			System.out.println("3. Opció 3.");
			System.out.println("0. Sortir de l'aplicació.\n");
			System.out.println("Escoja una opción: ");
			opcio = sc.nextByte();
			if (opcio < MINIMO || opcio > MAXIMO) {
				System.out.println("Escull una opció vàlida");
			}
		} while (opcio < MINIMO || opcio > MAXIMO);
		return opcio;

	}
	public static int buscarHotel(ArrayList<Hotel>listado) {
		System.out.println("Introduzca nombre Hotel");
		String nombre = sc.nextLine();
		boolean encontrado = false;
		int posicion = -1;
		int i =0;
		int size = listado.size();
		while(i<size && !encontrado) {
			if (listado.get(i).getNombre().equalsIgnoreCase(nombre)) {
				encontrado = true;
				posicion = i;
			}
			i++;
		}
		return posicion;
	}

	public static void crearHotel(ArrayList<Hotel> listado, int posicion) {
		if (posicion == -1) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del Hotel");
		String nombre = sc.nextLine();

		System.out.println("Introduzca el numero de Habitaciones");
		int numeroHab = sc.nextInt();
		System.out.println("Introduzca el numero de plantas");
		int numeroPlantas = sc.nextInt();

		System.out.println("Introduzca la superficie total del Hotel");
		int superficieTotal = sc.nextInt();

		Hotel hotel = new Hotel(nombre, numeroHab, numeroPlantas, superficieTotal);

		listado.add(hotel);
		hotel.calcularManteniment();
		} else {
			System.out.println("El Hotel ya esta dado de alta en la base de datos");
		}

	}
	
	public static void verHoteles(listado) {
		for
	}

	public static void darDeBajaHotel(ArrayList<Hotel> listado) {

		System.out.println("Introduzca El Nombre del hotel a eliminar: ");
		sc.nextLine();
		String nombre = sc.nextLine();
		int size = listado.size();
		int i = 0, posicion = 0;
		boolean encontrado = false;
		while (i < size && !encontrado) {
			if (listado.get(i).getNombre().equalsIgnoreCase(nombre)) {
				encontrado = true;
				posicion = i;
			}
			i++;
		}

		if (encontrado) {
			listado.remove(posicion);
			System.out.println("Hemos eliminado el hotel de nuestra base de datos");
		} else
			System.out.println("El nombre del Hotel no está en nuestra base de datos");

		System.out.println(listado);
	}

}
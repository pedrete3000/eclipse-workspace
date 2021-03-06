package pooclase3ejercicio8_3;

import java.util.ArrayList;
import java.util.Scanner;

public class POOClase3Ejercicio8_3 {
	
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args, String name, String lastName) {
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente("Fernando", "lopez");
		Cliente cliente2 = new Cliente("Maria","jimenez");
		Cliente cliente3 = new Cliente("Ilunion", "Perez");

		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		

		boolean sortir = false;
		int posicion;
		do {
			switch (menu()) {
			case 1:
				posicion = buscarCliente(clientes);
				crearCliente(clientes, posicion);
				verClientes(clientes);
				break;
			case 2:
				eliminarCliente(clientes, name, lastName);
				break;
		
			case 0:
				System.out.println("gracias por usar este programa. Adios");
				sortir = true;
				break;
			}
		} while (!sortir);

		System.out.println(clientes);
	}

	private static int menu() {

		byte opcio;
		final byte MINIMO = 0;
		final byte MAXIMO = 4;

		do {
			System.out.println("\n******MENÚ PRINCIPAL*****");
			System.out.println("1. Opció 1. Crear cliente");
			System.out.println("2. Opció 2.Dar de Baja cliente");
			System.out.println("3. Opció 3.Ver cliente");
			System.out.println("4. Opció 4.Modificar cliente");
			System.out.println("0. Sortir de l'aplicació.\n");
			System.out.println("Escoja una opción: ");
			opcio = sc.nextByte();
			sc.nextLine();
			if (opcio < MINIMO || opcio > MAXIMO) {
				System.out.println("Escoja una opció vàlida");
			}
		} while (opcio < MINIMO || opcio > MAXIMO);
		return opcio;

	}

	public static int buscarCliente(ArrayList<Cliente> clientes) {
		System.out.println("Introduzca nombre cliente");
		String name = sc.nextLine();
		System.out.println("Introduzca Apellido cliente");
		String lastName = sc.nextLine();
		boolean encontrado = false;
		int posicion = -1;
		int i = 0;
		int size = clientes.size();
		while (i < size && !encontrado) {
			if (clientes.get(i).getName().equalsIgnoreCase(name) && clientes.get(i).getLastName().equalsIgnoreCase(lastName)) {
				encontrado = true;
				posicion = i;
			}
			i++;
		}
		return posicion;
	}
	public static Cliente buscarCliente (ArrayList<Cliente>clientes, String name, String lastName) {
		int size = clientes.size(), i=0;
		Cliente cliente1 = new Cliente(name, lastName);
		while (i<size && cliente1 != null ) {
			if (clientes.get(0).getName().equalsIgnoreCase(name) && 
			clientes.get(0).getLastName().equalsIgnoreCase(lastName)) {
				cliente1 = null;
			} 
			i++;
		}
		return (cliente1);
	}
	public static void crearCliente(ArrayList<Cliente> clientes, int posicion) {
		if (posicion ==-1 ) {
			System.out.println("El cliente NO se encuentra en la base de datos, a continucación introduzca los datos:");
			System.out.println("Introduzca Nombre cliente a añadir");
			String name = sc.nextLine();
			System.out.println("Introduzca Apellido cliente a añadir");
			String lastName = sc.nextLine();
		Cliente cliente = new Cliente(name, lastName);
		clientes.add(cliente);
		} else 
		System.out.println("Este cliente ya se encuentra en nuestra base de datos");
	}
	
	public static void eliminarCliente(ArrayList<Cliente>clientes, String name, String lastName) {
		
		System.out.println("Introduzca Nombre Cliente");
		name = sc.nextLine();
		System.out.println("Introduzca Apellido Cliente");
		lastName = sc.nextLine();
		
		if (buscarCliente(clientes, name, lastName) ==null) {
			System.out.println("El cliente "+name+"  "+lastName+" ya está en nuestra base de datos");
		} else {
			
			clientes.add(buscarCliente(clientes, name, lastName));
		}
	}
public static void verClientes (ArrayList<Cliente> clientes) {
	int size = clientes.size();
	for (int i =0; i<size;i++) {
		System.out.println(clientes.get(i));
	}
}
}


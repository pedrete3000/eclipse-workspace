package m4ejercicio3;


import java.util.Scanner;

public class M4Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		byte edad;
		String titulo, paro;
		
		System.out.println("Tienes título universitario? (S/N) : ");
		titulo = sc.nextLine();
		
		System.out.println("Estas en Paro? (S/N) : ");
		paro = sc.nextLine();
		
		System.out.println("Introduce tu edad : ");
		edad = sc.nextByte();

		if (edad >= 18 && titulo.equals("S") || paro.equals("S")) {
			System.out.println("Beca concedida");
		}
		else {
			System.out.println("Beca Denegada");
		}
	}

}

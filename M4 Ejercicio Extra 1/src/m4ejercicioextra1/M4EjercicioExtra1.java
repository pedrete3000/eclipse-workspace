package m4ejercicioextra1;

import java.util.Scanner;

public class M4EjercicioExtra1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int divisor, dividendo, cociente;
						
		System.out.println("Introduce un numero entre 2 y 7 ");
		divisor = sc.nextInt();
		sc.nextLine();
		
		if (divisor < 2 || divisor > 7 ) {
			System.out.println("El numero debe estar entre 2 y 7");
		} else
		{
		System.out.println("Introduce el dividendo  ");
		dividendo = sc.nextInt();
		sc.nextLine();
		cociente = dividendo%divisor;
		
				if (cociente == 0) {
					System.out.println("El numero "+dividendo+" es multiplo del numero "+divisor);
				}
				else {
					System.out.println("El numero "+dividendo+" NO es multiplo del numero "+divisor);
			}
		}

	}
}

package m7_2ejercicio2;

import java.util.Scanner;

public class M7_2Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ast = "*";
		
		System.out.println("Introduzca el numero de lineas del árbol");
		int numero = sc.nextInt();

	for (int i = numero; i >=1 ; i--) {
		
			for (int j=i; j>=1; j--) {
				
				System.out.print(ast);
			}
			System.out.println();
		}
	}
}

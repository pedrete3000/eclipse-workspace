package m7_2ejercicio3;

import java.util.Scanner;

public class M7_2Ejercicio3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String text = "";
		
		System.out.println("Introduzca un numero");
		byte numero = sc.nextByte();
		

	for (int i = 1; i <=numero ; i++) {
		
			for (int j=1; j<=i; j++) {
			
					text += "*";
			}
			text += "\n";
	}
	
	for (int i = numero-1; i >=1 ; i--) {
				
			for (int j=1; j<=i; j++) {
				
					text += "*";
				}
				text += "\n";
	}
	System.out.println(text);
	}

	}


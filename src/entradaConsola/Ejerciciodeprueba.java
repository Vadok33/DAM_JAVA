package entradaConsola;

import java.util.Scanner;

public class Ejerciciodeprueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor introduce un número");
		
		int num1 = entrada.nextInt();
		
		System.out.println("Por favor introduce otro número");
		
		int num2 = entrada.nextInt();
		
		if (num2 > num1) {
			
			System.out.println("Num2 es mayor que num1");
		}
			else {
				if (num1 == num2 ) {
					System.out.println("Son iguales");
				}
				else {
				System.out.println("Num1 es mayor que num2");
				}
			}


	}

}

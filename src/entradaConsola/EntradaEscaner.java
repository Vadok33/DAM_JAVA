package entradaConsola;

import java.util.Scanner;
import java.util.Locale;

public class EntradaEscaner {

	public static void main(String[] args) {
		
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor introduce tu nombre");
		
		String nombre = entrada.nextLine();
		
		System.out.println("Por favor introduce tu edad");
		
		int edad= entrada.nextInt();
		
		//edad = edad + 1;
		edad++;
		
		System.out.println("Hola " +nombre+ " el año que vienes tendras " +edad+" años");
		
		
		}

}

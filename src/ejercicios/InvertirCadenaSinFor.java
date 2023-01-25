package ejercicios;

import java.util.Scanner;

public class InvertirCadenaSinFor {

	
	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Introduce un texto y pulsa intro");
			String cadena = entrada.nextLine();
			
			if(!cadena.isEmpty()) {
		System.out.println(invertirCadena(cadena));
				
			}
			else {
				System.out.println("La cadena está vacia");
		
			}
		}
	}
	
	public static String invertirCadena(String cadena) {
		  if (cadena.isEmpty()) {
		    return cadena;
		  }
		  return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
	}
}

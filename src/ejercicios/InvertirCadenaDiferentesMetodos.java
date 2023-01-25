package ejercicios;

import java.util.Scanner;

public class InvertirCadenaDiferentesMetodos {

	public static void main(String[] args) {
	
	try (Scanner entrada = new Scanner(System.in)) {
		System.out.println("Introduce un texto y pulsa intro");
		String cadena = entrada.nextLine();
		
		if(!cadena.isEmpty()) {
	System.out.println(invertir(cadena));
			
		}
		else {
			System.out.println("La cadena está vacia");
	
	}
	}
}

	private static String invertir(String cadena) {
		String invertida = "";
		
		for (int indice = cadena.length() - 1; indice >= 0; indice--) {
		
		invertida += cadena.charAt(indice);
	}
	
		return invertida;
	}
}


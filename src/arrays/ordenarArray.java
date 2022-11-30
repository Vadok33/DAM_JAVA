package arrays;

import java.util.Scanner;


public class ordenarArray {

	public static void main(String[] args) {
		// Ordenar array de menor a mayor
		// Inicio
		System.out.print("\n*** Inicio de programa");
		System.out.println(" Ordenar Array ***");
		
		// VARIABLES
		
		int menor = 0;
		int numElementos;
		int i;
		
		/// LEER NUMERO TOTAL DE ELEMENTOS
		
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.print("\nIntroduce el número total de elementos:");
			numElementos = entrada.nextInt();
		}
		while(numElementos <= 0);
		
		// DECLARAR Y CONSTRUIR ARRAY
		
		int[] miArray = new int[numElementos];
		
		// RECOGER NUMEROS POR CONSOLA
		
		for(i = 0; i<numElementos; i++) {
			System.out.println("Introduce número(" +(i+1)+ "): ");
			miArray[i]=entrada.nextInt();
			
		}
		// ESCRIBIR ARRAY SIN ORDENAR
		
		System.out.print("\nArray sin ordenar: ");
		for(int num:miArray) {
			System.out.print("[" +num +"] ");
		}
		
		// ORDENAR ARRAY (BUCLE FOR ANIDADO)
	
		for (i=0; i<miArray.length; i++){
			
			for(int j=i ;j < miArray.length; j++) {
				if(miArray[i] > miArray[j]) {
					menor = miArray[j];
					miArray[j] = miArray[i];
					miArray[i] = menor;
				}
			}
		}
		
		// ESCRIBIR ARRAY ORDENADO (FOR EACH)
		
		System.out.print("\nArray ordenado de menor a mayor: ");
			for(int num:miArray) {
				System.out.print("[" +num + "] ");
			}
		// FIN
			entrada.close();
			System.out.println();
			System.out.println("\nFin de programa");
	}
	

}

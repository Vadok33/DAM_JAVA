package pruebaGit;

import java.util.Scanner;
import java.util.Arrays;

public class pruebaB {

	public static void main(String[] args) {
		
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
	       
		// ORDENAR ARRAY CON SORT
		
	    System.out.println("\nArray ordenado de menor a mayor:" );
	     
	    Arrays.sort(miArray);
	    Arrays.toString(miArray);
	    
	    System.out.println(Arrays.toString(miArray));
	       }
		
	}


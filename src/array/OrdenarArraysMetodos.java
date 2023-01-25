package array;

import java.util.Arrays;
import java.util.Scanner;


public class OrdenarArraysMetodos {

	public static void main(String[] args) {
	
			int numElementos;
	        int i;
	        
		
		Scanner entrada = new Scanner(System.in);
	        do {
	            
	        System.out.println("Introduce el número total de elementos:");
	        numElementos = entrada.nextInt();
	        
	        }
	        while (numElementos <= 0);
	        
	        int[] miArray = new int [numElementos];
	        
	        for (i = 0; i < numElementos; i++) {
	            System.out.println("Introduce numero (" +(i+1)+ ") ");
	            miArray[i]=entrada.nextInt();
	        }
	        
	        System.out.println("\nArray sin ordenar: ");
	        for (int num: miArray) {
	            System.out.print("[" +num+ "]");
	            }
	        System.out.println(" ");
	        
	        Arrays.sort(miArray);
	        
	        System.out.println("\nArray ordenado de menor a mayor:" );
	        
	        for(int s : miArray) {
	        	System.out.print("[" +s+ "]");
	        }
	        
	        
	}

}

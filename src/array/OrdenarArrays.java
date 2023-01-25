package array;

import java.util.Scanner;

public class OrdenarArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int numero = 0;
	   
	    
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Introduce el número total de elementos");
			numero = entrada.nextInt();
			
			int [] A = new int[numero];
			
			for (i = 0; i < numero; i++) {
				System.out.println("Introduce número(" +(i+1)+ "): ");
				
				A[i] = entrada.nextInt();

				
			}
		      int z, j, aux;
		        for (z = 0; z < A.length - 1; z++) {
		            for (j = 0; j < A.length - z - 1; j++) {                                                              
		                if (A[j + 1] < A[j]) {
		                    aux = A[j + 1];
		                    A[j + 1] = A[j];
		                    A[j] = aux;
		  
		        } 
		            }
		        }
		        for(int c=0;c<A.length;c++){
		            System.out.print(A[c]+ " ");
		            
		        }		
			}
	}
}


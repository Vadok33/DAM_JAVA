package ordenArray;

import java.util.Scanner;

public class ordenarA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b = 0;
		int veces = 0;
		 
		   
		try (Scanner entrada = new Scanner(System.in)) {
		System.out.println("Introduce el número total de elementos");
		veces = entrada.nextInt();

		int [] A = new int[veces];

		for (b = 0; b < veces; b++) {
		System.out.println("Introduce número(" +(b+1)+ "): ");

		A[b] = entrada.nextInt();


		}
		     int i, j, aux;
		       for (i = 1; i <=A.length; i++) {
		           for (j = i; j <= A.length; j++) {                                                              
		               if (j < i) {
		            	   aux = i;
		            	   i = j;
		            	   j = aux;
		       }
		     }
		  }
		       for(int c=0;c<A.length;c++)
		       {
		           System.out.println(A[c]);
		       } }
		}
		


	}



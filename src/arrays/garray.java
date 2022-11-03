// Ejercicio para sacar la nota media

package arrays;

import java.util.Scanner;

public class garray {

	public static void main(String[] args) {
		// CALCULAR NOTA MEDIA
		
		//INICIO
		
		System.out.println("\n*** Calcular nota media");
		
		//VARIABLES
		
		int numNotas, i;
		double suma = 0;
		double media = 0;
		
		//LEER EL NUMERO DE NOTAS
		
		Scanner entrada = new Scanner(System.in);
		
		do {
					
		System.out.println("Introduce el numero total de notas");
		numNotas = entrada.nextInt();
		
		}while(numNotas<=0);
		
		//DEFINIR Y CONSTRUIR ARRAY
		
		double [] miArray = new double[numNotas];
		
		for (i = 0; i<numNotas; i++) {
			
			//SOLICITAR NOTA
			System.out.println("Nota(" +(i+1)+ "): ");
			
			// GUARDAR NOTA EN ARRAY
			miArray[i]= entrada.nextDouble();
			
			//SUMAR NOTA
			suma = suma + miArray[i];
			
		}
			//CALCULAR NOTA MEDIA
			media = suma / numNotas;
			
			//MOSTRAR NOTAS (FOR-EACH)
			i=1;
			for (double nota:miArray) {
				System.out.println("Nota(" +(i+1)+ "):" +nota);
			}
		
			//MOSTRAR RESULTADO
			
			System.out.println("\nLa nota media es" + media);
			
			//FIN
			
			
			
			
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

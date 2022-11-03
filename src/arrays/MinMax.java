package arrays;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		
		int i;
		int minimo = 0;
		int maximo = 0;
		int posicionMin = 0;
		int posicionMax = 0;
		int numero2 = 0;
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		numero2 = entrada.nextInt();
		
		int [] numero = new int [numero2];
		
		
		
		for (i = 0; i < numero2; i++) {
			System.out.println("Introduce número(" +(i+1)+ "): ");
			
			numero [i] = entrada.nextInt();
			
			if (i==0) {
				minimo = numero[0];
				maximo = numero[0];
			}
			if (numero[i] <= minimo) {
				
				minimo = numero[i];
				posicionMin = i + 1;
			}
			if (numero[i] >= maximo) {
				
				maximo = numero[i];
				posicionMax = i + 1;
				
			}
		}
		System.out.println("El minimo es "+ minimo + " y su posicion es " + posicionMin);
		System.out.println("El maximo es "+ maximo + " y su posicion es " + posicionMax);
	}

}

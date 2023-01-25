package array;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;



public class Arrays {

	public static void main(String[] args) {
		DecimalFormat dec = new DecimalFormat("##.##");
		
		System.out.println("\n*** Calcular Nota Media");
		
		int numNotas, i;
		double suma = 0;
		double media = 0;
		
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Introduce el número total de notas:");
			numNotas = entrada.nextInt();
			
		
		}
		while (numNotas <= 0);
		
		double[] miArray = new double[numNotas];
		
		for (i = 0; i < numNotas; i++) {
			
			System.out.println("Nota(" + (i+1) + ")" );
			miArray[i] = entrada.nextDouble();
			suma = suma + miArray[i];
			
		}
		media = suma / numNotas;
		i=1;
		for (double nota:miArray);
		System.out.println("\nLa nota media es " + (dec.format(media)));
		entrada.close();
		System.out.println("\nFin de programa");
		
		
	}

}

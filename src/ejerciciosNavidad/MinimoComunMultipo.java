package ejerciciosNavidad;

import java.util.Scanner;

public class MinimoComunMultipo {
	
	public static void main(String[] args) {

		System.out.println("INICIO");
	    try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce el primer número: ");
			int num1 = sc.nextInt();
			
			System.out.println("Introduce el segundo número: ");
			int num2 = sc.nextInt();


			
			int mcd = calcularMCD(num1, num2);
			int mcm = calcularMCM(num1, num2, mcd);

			System.out.println("El MCD de " + num1 + " y " + num2 + " es " + mcd);
			System.out.println("El MCM de " + num1 + " y " + num2 + " es " + mcm);
		}
	    
	    System.out.println("\nFIN");
}

	  public static int calcularMCD(int a, int b) {
	    if (b == 0) {
	      return a;
	      }
	      else {
	      return calcularMCD(b, a % b);
}
	    }
	  	public static int calcularMCM(int a, int b,int mcd) {
	  	return a*b / mcd;
	  	
	  	}
	  }
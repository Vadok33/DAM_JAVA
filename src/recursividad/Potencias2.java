package recursividad;

import java.util.Scanner;

public class Potencias2 {
	public class EjercicioExponente {

	    public static void main(String[] args) {
	   	 Scanner scanner = new Scanner(System.in);
	   	 System.out.println("Escribe una base:");
	    	double base = scanner.nextDouble();
	    	System.out.println("Escribe un exponente entero(no negativo):");
	   	 int exp = scanner.nextInt();
	    	System.out.println(iteratividad(base,exp));
	    	System.out.println(recursividad(base,exp));
	   	 
	    }
	    public static double iteratividad(double base, int exp) {
	    
	    	double aux=base;
	    	double resultado=0;
	   	 for (int i = 1; i < exp; i++) {
	   		 
	   	 resultado=aux*base;
	   	 aux=+resultado;
	   	 
	   	 
	   	 
	   	 }
	   	 return resultado;
	    }
	    public static double recursividad(double base, int exp) {
	   	 
	   	 
	   	 double resultado=1;
	   	 if (exp==0) {
	   		 resultado=1;
	   	 }else {
	   		 
	   		 resultado= base * recursividad(base,exp-1);
	   		 
	   	 }
	return resultado;

	}
	}

}

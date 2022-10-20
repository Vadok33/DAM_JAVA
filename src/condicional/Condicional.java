package condicional;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
				System.out.println("Por favor introduce un número");
		
		int num1 = entrada.nextInt();
				
			System.out.println("Por favor introduce otro numero");
		
		int num2 = entrada.nextInt();
		 
		//int num1 = 5;
		//int num2 = 10;

		if (num2 > num1){

			System.out.println("El primer numero es menor");
		}

		else {
	   		 if (num2 == num1) {
	   			 System.out.println("Num2 es igual que num1");
	   	 }else {
	   		 if (num2<num1) {
	   		 System.out.println("Num1 es mayor que num2");
	   	 }
	    }
       }
	  }
}


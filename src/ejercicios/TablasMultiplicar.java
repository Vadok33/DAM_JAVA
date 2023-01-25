package ejercicios;

import java.util.Scanner;

public class TablasMultiplicar {
	
	public static void main(String[] args) {
		
		int res = 0;
		int mul;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero del 1 al 10");
		int num = entrada.nextInt();
		
		while (1 <= num && num <= 10) {
		
			for (mul = 1; mul <= 10; mul++) {
				res = num * mul;
			System.out.println(num + " x " + mul + " = " + res);
			
			}
			
			System.out.println("Introduce un numero");
			num = entrada.nextInt();
		}
	}
}

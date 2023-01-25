package banco;

import java.util.Scanner;

public class Cajero {

	CuentaCorriente	cliente1 = new CuentaCorriente("123","Pepe", 0);
	
	public static void main(String[] args) {
	

	
	System.out.println("*** Cajero JAVA 5ºD ***");
	System.out.println("Desarrollado por Álvaro Baquedano");
	
	System.out.println("Opciones:");
	System.out.println("----------");
	System.out.println("1 - Sacar dinero");
	System.out.println("2 - Ingresar dinero");
	System.out.println("3 - Consultar Saldo");
	System.out.println("4 - Salir");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("\nIntroduzca una opción:");
	int opcion = 0;
	
	while (opcion != 4) {
		
		opcion = sc.nextInt();
		
	switch (opcion) {
	
	case 1:
		retirar();
	break;
	
	case 2: 
//		ingresar();
	break;
	
	case 3:
//		consultar();
	break;
	
	case 4: System.out.println("Has cerrado sesión");
		
	break;
	
	default:

		System.out.println("\nIntroduzca una opción del 1 al 4");
	
	}
	
	}
	sc.close();
}
	public static  void retirar() {
		Scanner sc = new Scanner(System.in);
		cliente1.getsaldo;
		if (cliente1.saldo > 0) {
			double saldo = sc.nextDouble();
			cliente1.saldo = cliente1.saldo - saldo;
		}
		else {
			System.out.println("No tienes sufiente saldo");
		}
	sc.close();
	}

	
}

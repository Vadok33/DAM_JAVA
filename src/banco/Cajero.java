package banco;

import java.util.Scanner;

public class Cajero {

	
	public static void main(String[] args) {
	
		//Crear objeto (miCuenta)
		CuentaCorriente miCuenta = new CuentaCorriente("1234567k","Alvaro", "1500");
				
		//Estado inicial de miCuenta
		
		
		
		
		
		
		// Opciones del cajero
		
		
		
		
		
		int opcion = 0;
		
	do {
		System.out.println("\n*** Bienvenido a Farlok Bank *** \nIntroduzca una opción: \n---------- \n¿Que desea hacer? \n---------- \n1 - Sacar dinero \n2 - Ingresar dinero \n3 - Consultar Saldo \n4 - Salir");
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();
		
	
	
		
	switch (opcion) {
	
	
	//Sacar dinero
	case 1:
		miCuenta.retirar(miCuenta);
	break;
	
	//Ingresar dinero
	case 2: 
		miCuenta.ingresar(miCuenta);
	break;
	
	//consultar saldo
	case 3:
		miCuenta.consultar(miCuenta);
	break;
	
	//Salir
	case 4:
		miCuenta.salir();
		
	break;
	
	default:
		System.out.println("\nIntroduzca una opción");
		
	}
	}
		while (opcion !=4);
	
	
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

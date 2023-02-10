package banco;

import java.util.Scanner;

public class Cajero {

	
	public static void main(String[] args) {
	
	//Crear objeto (miCuenta)
		CuentaCorriente miCuenta = new CuentaCorriente("1234567k","Alvaro Elena", 1500.00, 20);
				
	//Estado inicial de miCuenta
		
		
		
		
		
		
	// Opciones del cajero3
		
		
		
		
	int opcion = 0;
	System.out.println("\n*** Bienvenido a Farlok Bank *** \n\n ¿Que desea hacer?");
	do {
	
	System.out.println("\n---------- \n1 - Sacar dinero \n2 - Ingresar dinero \n3 - Consultar Saldo \n4 - Salir");
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
		System.out.println("\nDebe seleccionar una de las opciones disponibles");
		
	}
	}
		while (opcion !=4);
	
	
	}
	

	
}

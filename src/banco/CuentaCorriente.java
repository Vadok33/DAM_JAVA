package banco;

import java.util.Scanner;

public class CuentaCorriente {
	
	// Atributos
	
	String dni;		// del titular
	String nombre;	// del titular
	double saldo;	// efectivo disponible en mi cuenta
	
	//Metodos CONSTRUCTORES
	
public CuentaCorriente () {		
}
public CuentaCorriente(String dni, String nombre, double saldo) {

this.dni = dni;
this.nombre = nombre;
this.saldo = saldo;
}

//Métodos GETTERS & SETTERS
public String getnombre() {
    return nombre;
}

public double getsaldo() {
    return saldo;
}

public String getdni() {
	return dni;
}

public void setnombre(String nombre) {
    this.nombre = nombre;
}

public void setsaldo(double saldo) {
    this.saldo = saldo;
}

public void setdni(String dni) {
	this.dni = dni;
}

//Métodos de OPERACIONES

public void salir (){
	System.out.println("Hasta pronto!");
}

public void retirar(CuentaCorriente miCuenta) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Tu saldo es: "+ miCuenta.saldo+"€");
	System.out.println("¿Cuanto dinero desea sacar?");
	double importe = sc.nextDouble();
	if (importe <= 0){
		System.out.println("El importe no puede ser negativo");	
	}
	if (importe >= miCuenta.saldo){
		System.out.println("No dispones de saldo suficiente");	
	}
	
	miCuenta.saldo -= importe;
	System.out.println("Ha retirado "+importe+"€");
	System.out.println("Su nuevo saldo es de: "+ miCuenta.saldo+"€");
	System.out.println("\n¿Desea realizar otra operación? \n---------- \n1 - Sacar dinero \n2 - Ingresar dinero \n3 - Consultar Saldo \n4 - Salir");
}

public void ingresar(CuentaCorriente miCuenta) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Tu saldo es: "+ miCuenta.saldo+"€");
	System.out.println("¿Cuanto dinero desea ingresar?");
	double importe = sc.nextDouble();
	if (importe <= 0){
		System.out.println("El importe no puede ser negativo");
		}
	
	miCuenta.saldo += importe;
	System.out.println("Su nuevo saldo es de: "+ miCuenta.saldo+"€");
	System.out.println("\n¿Desea realizar otra operación? \n---------- \n1 - Sacar dinero \n2 - Ingresar dinero \n3 - Consultar Saldo \n4 - Salir");
}

public void consultar(CuentaCorriente miCuenta) {
	System.out.println("Tu saldo es: \n"+ miCuenta.saldo+"€");
	System.out.println("\n¿Desea realizar otra operación? \n---------- \n1 - Sacar dinero \n2 - Ingresar dinero \n3 - Consultar Saldo \n4 - Salir");
}

}

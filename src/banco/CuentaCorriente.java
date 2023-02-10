package banco;

import java.util.Scanner;

public class CuentaCorriente {
	
	// Atributos
	
	String dni;		// dni del titular
	String nombre;	// nombre del titular
	double saldo;	// efectivo disponible en mi cuenta
	double limite;	// limite para sacar
	
	//Metodos CONSTRUCTORES
	
public CuentaCorriente () {		
}
public CuentaCorriente(String dni, String nombre, double saldo, double limite) {

this.dni = dni;
this.nombre = nombre;
this.saldo = saldo;
this.limite = limite;
}

//Métodos GETTERS & SETTERS
public String getnombre() {
    return nombre;
}
public Double getlimite() {
    return limite;
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
public Double setlimite() {
    return limite;
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
	System.out.println("Su saldo es: "+ miCuenta.saldo+"€ y tiene un límite de :"+ miCuenta.limite+"€");
	System.out.println("¿Cuanto dinero desea sacar?");
	double importe = sc.nextDouble();
	if (importe <= 0){
		System.out.println("El importe no puede ser negativo");	
		
	}
	else if (importe > miCuenta.saldo){
		System.out.println("No dispones de saldo suficiente");	
	}
	else if (importe > miCuenta.limite){
			System.out.println("El importe supera el limite que puede sacar");	
	}		
	else {
	
	miCuenta.saldo -= importe;
	System.out.println("Ha retirado "+importe+"€");
	System.out.println("Su nuevo saldo es de: "+ miCuenta.saldo+"€");
	System.out.println("\n¿Desea realizar otra operación?");
}
}
public void ingresar(CuentaCorriente miCuenta) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Su saldo es: "+ miCuenta.saldo+"€");
	System.out.println("¿Cuanto dinero desea ingresar?");
	double importe = sc.nextDouble();
	if (importe <= 0){
		System.out.println("El importe no puede ser negativo");
		}
	else {
	
	miCuenta.saldo += importe;
	System.out.println("Su nuevo saldo es de: "+ miCuenta.saldo+"€");
	System.out.println("\n¿Desea realizar otra operación?");
}
}
public void consultar(CuentaCorriente miCuenta) {
	System.out.println("Sr/Sra "+  miCuenta.nombre + " con DNI "+ miCuenta.dni);
	System.out.println("Su saldo es: \n"+ miCuenta.saldo+"€ y tiene un límite de :"+ miCuenta.limite+"€");
	System.out.println("\n¿Desea realizar otra operación?");
}

}

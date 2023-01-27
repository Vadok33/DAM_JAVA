package banco;



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
	System.out.println("Tu saldo es: "+ miCuenta.saldo);
	System.out.println("¿Cuanto dinero desea sacar?");
}

public void ingresar(CuentaCorriente miCuenta) {
	Scanner sc=new Scanner (System.in);
}

public void consultar(CuentaCorriente miCuenta) {
	
}

}

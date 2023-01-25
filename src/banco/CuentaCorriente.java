package banco;

public class CuentaCorriente {
	String dni;

	String nombre;
	
	double saldo;
	
public CuentaCorriente () {
		
}
public CuentaCorriente(String dni, String nombre, double saldo) {

this.dni = dni;

this.nombre = nombre;

this.saldo = saldo;

}
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
public void retirar() {
	
}

public void ingresar() {
	
}

public void consultar() {
	
}

}

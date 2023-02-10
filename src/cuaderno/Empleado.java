package cuaderno;

public class Empleado extends Persona{

	
	//Atributos
	private int idEmpleado;
	private int categoria;
	private String cargo;
	private double sueldo;
	
	
	
	
	
	//Constructores 
	
	public Empleado() {}
	public Empleado(int idEmpleado, int categoria, String cargo, double sueldo, int idPersona, String dni, String nombre, String apellido, String domicilio, String telefono) {
		super(idPersona, dni, nombre, apellido, domicilio, telefono);
		this.idEmpleado = idEmpleado;
		this.categoria = categoria;
		this.cargo = cargo;
		this.sueldo = sueldo;
		
		

}
	//GETTER AND SETTER





	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}


	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
}

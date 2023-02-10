package cuaderno;

public class Persona {

	private int idPersona;
	private String dni;
	private String nombre;
	private String apellido;
	private String domicilio;
	private String telefono;
	
	//CONSTRUTORES
	public Persona() {}
	public Persona(int idPersona, String dni, String nombre, String apellido, String domicilio, String telefono) {
		
	this.idPersona	= idPersona;
	this.dni = dni;
	this.nombre = nombre;
	this.apellido = apellido;
	this.domicilio = domicilio;
	this.telefono = telefono;
		
	}
	
	//GETTER Y SETTER
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
	
		
	
	
	
}
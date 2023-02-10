package cuaderno;

public class Jefe extends Empleado{
	
	//Stributos
	private int idJefe;
	private String dptoJefe;
	
	//Constructores
public Jefe() {}

	public Jefe(int idJefe, String dptoJefe, int idEmpleado, int categoria, String cargo, double sueldo, int idPersona, String dni, String nombre,
			String apellido, String domicilio, String telefono) {
		super(idEmpleado, categoria, cargo, sueldo, idPersona, dni, nombre, apellido, domicilio, telefono);
		this.idJefe = idJefe;
		this.dptoJefe = dptoJefe;
	}

	

	//setter and getter
	
public int getIdJefe() {
		return idJefe;
	}

	public void setIdJefe(int idJefe) {
		this.idJefe = idJefe;
	}

	public String getDptoJefe() {
		return dptoJefe;
	}

	public void setDptoJefe(String dptoJefe) {
		this.dptoJefe = dptoJefe;
	}
}

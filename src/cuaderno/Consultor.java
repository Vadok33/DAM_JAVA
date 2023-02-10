package cuaderno;

public class Consultor extends Persona{

	//Atributos
	
	private int idConsultor;
	private double tarifaHora;
	private String nombreConsultora;


	//Constructores
public Consultor() {}
public Consultor(int idConsultor, double tarifaHora, String nombreConsultora, int idPersona, String dni, String nombre, String apellido, String domicilio, String telefono) {
	
	super(idPersona, dni, nombre, apellido, domicilio, telefono);
	this.idConsultor = idConsultor;
	this.tarifaHora = tarifaHora;
	this.nombreConsultora = nombreConsultora;
	
}
public int getIdConsultor() {
	return idConsultor;
}
public void setIdConsultor(int idConsultor) {
	this.idConsultor = idConsultor;
}
public double getTarifaHora() {
	return tarifaHora;
}
public void setTarifaHora(double tarifaHora) {
	this.tarifaHora = tarifaHora;
}
public String getNombreConsultora() {
	return nombreConsultora;
}
public void setNombreConsultora(String nombreConsultora) {
	this.nombreConsultora = nombreConsultora;
}



}
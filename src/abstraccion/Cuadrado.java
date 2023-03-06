package abstraccion;

public class Cuadrado extends Figura{
	
	//Atributos
	
	private double lado;
	
	//Constructor
	
	public Cuadrado() {
		super();
	}
	
	public Cuadrado(double lado, double posicionX, double posicionY) {
		super();
		this.lado = lado;
}
	@Override
	public double calcularArea() {
		
		double resultado = lado * lado;
		return resultado;
	}

	
	

	
	
}

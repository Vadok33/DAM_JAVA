package abstraccion;

public class Circulo extends Figura{
	
	//Atributos
	
		private double radio;

	//Constructor 
		
	public Circulo(double radio, double posicionX, double posicionY) {
		super(posicionX, posicionY);
		this.radio = radio;	
	}	
		
	@Override
	public double calcularArea() {
		final double PI = 3.14;
		double resultado = PI * radio * radio;
		return resultado;
	}

	
	

}

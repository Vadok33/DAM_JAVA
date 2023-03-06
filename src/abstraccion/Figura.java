package abstraccion;

public abstract class Figura {

	
	//Variables
	
	protected double posicionX;
	protected double posicionY;
	
	//Constructores
	
	protected Figura() {
	}

	protected Figura(double posicionX, double posicionY) {
		super();
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}
	
	//Método abstracto
	
	public abstract double calcularArea();
		
}

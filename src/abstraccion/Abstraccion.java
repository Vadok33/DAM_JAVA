package abstraccion;

public class Abstraccion {

	public static void main(String[] args) {
		
		System.out.println();
		Cuadrado cuadrado1 = new Cuadrado(2,0,0);
		System.out.println("El area del cuadrado es: " + cuadrado1.calcularArea());
		
		System.out.println("---------------");
		
		Circulo circulo1 = new Circulo(2,0,0);
		System.out.println("El area del cuadrado es: " + circulo1.calcularArea());

	}

}

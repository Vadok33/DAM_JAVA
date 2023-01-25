package bucleFor;

public class EjemploFor {

	public static void main(String[] args) {
		
		int contador = 0;
		
		for (int cont = 0; cont <= 90; cont++) {
			contador = cont;
			System.out.println("Estoy en la vuelta: " + contador);
		}
		System.out.println("Contador : " + contador );
	}

}

package condicional;

public class Condicional2 {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		if (num2 > num1) {
			
			System.out.println("Num2 es mayor que num1");
		}
			else {
				if (num1 == num2 ) {
					System.out.println("Son iguales");
				}
				else {
				System.out.println("Num1 es mayor que num2");
				}
			}

	}

}

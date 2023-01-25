package funcion;

public class FuncionIf {

	public static void main(String[] args) {
		
		int num1=15;
		int num2=15;
		
		comparaNumeros (num1, num2);
		
	}
		public static void comparaNumeros (int n1, int n2) {
	
		if (n2 > n1) {
			
			System.out.println("Num2 es mayor que num1");
		}
			else {
				if (n1 == n2 ) {
					System.out.println("Son iguales");
				}
				else {
				System.out.println("Num1 es mayor que num2");
				}
			}
		}
}


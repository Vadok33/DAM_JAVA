package funcion;

public class Funcionif {

	public static void main(String[] args) {
		
		int num1 = 15;
		int num2 = 10;
		
		comparaNumeros(num1, num2);
		
	}
	public static void comparaNumeros (int n1, int n2) {
		
		if (n1 < n2){

			System.out.println("Num2 es mayor que num1");
		}

		else {
	   		 if (n2 == n1) {
	   			 System.out.println("Num2 es igual que num1");
	   	 }else {
	   		 if (n2<n1) {
	   		 System.out.println("Num1 es mayor que num2");
	   	 }
	    }
       }
	}

}

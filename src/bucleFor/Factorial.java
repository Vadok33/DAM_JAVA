package bucleFor;

import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		
		int num1;
		String entrada;
		double resultado = 1;
		double resultado2 = 1;
		double factorial = 1;
		
		entrada = JOptionPane.showInputDialog(null, "Introduce un numero para factorizarlo");
		num1 = Integer.parseInt(entrada);
		
		do {
			resultado = resultado * factorial;
			System.out.println(factorial + " x " + resultado);
			factorial++;
			
		}
		while (factorial <= num1);
		JOptionPane.showMessageDialog(null, "*********BUCLE WHILE******** = " + resultado);
		
		for(factorial = num1; factorial > 0; factorial--) {
			resultado2 = resultado2 * factorial;
		}
		while (num1 != 1) {
			factorial = num1 * factorial;	
			num1++;
			JOptionPane.showInputDialog(null, "*********BUCLE FOR******** = " + factorial);
		}
		
	}

}

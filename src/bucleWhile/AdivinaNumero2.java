package bucleWhile;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class AdivinaNumero2 {

	public static void main(String[] args) {
		int aleatorio = 0;
		String entrada;
		int num1 = 1;
		int intentos = 0;
		int n;
		
		aleatorio = (int)(Math.random()*100+1);
		
		ArrayList<Integer> resultados = new ArrayList<Integer>();
		
		do {
			intentos++;

			entrada = JOptionPane.showInputDialog("Por favor, introduce un número del 1 al 100");
			
			 num1 = Integer.parseInt(entrada);
			 
			 n = num1;
			 resultados.add(n);
			 
			if (num1 < aleatorio) {
					JOptionPane.showMessageDialog(null, "El número es mayor que " +num1);
				}
				else {
					if (num1 > aleatorio) {
					JOptionPane.showMessageDialog(null, "El numero es menor que " +num1);
				}
				}
		}
		
		while (aleatorio != num1); 
		
		
		JOptionPane.showMessageDialog(null, "Lo has conseguido en " + intentos + " intentos");	
		JOptionPane.showMessageDialog(null, "Estos son tus intentos " + resultados);	
		
		}
	}


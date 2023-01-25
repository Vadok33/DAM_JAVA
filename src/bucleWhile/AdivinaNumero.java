package bucleWhile;

import javax.swing.JOptionPane;


public class AdivinaNumero {

	public static void main(String[] args) {
		int aleatorio = 0;
		String entrada;
		int num1 = 1;
		int intentos = 0;
		
		aleatorio = (int)(Math.random()*5+1);
		

		while (aleatorio != num1) {
			
			 entrada = JOptionPane.showInputDialog("Por favor, introduce un número");
			
			 num1 = Integer.parseInt(entrada);
			 
			 intentos++;
			 
			 
			
			if (num1 < aleatorio) {
				JOptionPane.showMessageDialog(null, "El número es mayor");
			}
			else {
				if (num1 > aleatorio) {
				JOptionPane.showMessageDialog(null, "El numero es menor");
			}
			}
			
		}
		JOptionPane.showMessageDialog(null, "Lo has conseguido en " + intentos + " intentos");
	}

}


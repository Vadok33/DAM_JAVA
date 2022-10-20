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

	aleatorio = (int)(Math.random()*100+1);

	do {
		intentos++;
		
		entrada = JOptionPane.showInputDialog("Por favor, introduce un número del 1 al 100");

		num1 = Integer.parseInt(entrada);
		
		if (num1 < aleatorio) {
			JOptionPane.showMessageDialog(null, "El número es mayor");
		}
		else {
			if (num1 > aleatorio) {
			JOptionPane.showMessageDialog(null, "El numero es menor");
				}
			 }
		}
	while (aleatorio != num1); {
	}
	JOptionPane.showMessageDialog(null, "Lo has conseguido en " + intentos + " intentos");
}

}
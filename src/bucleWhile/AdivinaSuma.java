package bucleWhile;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class AdivinaSuma {

	public static void main(String[] args) {
			int aleatorio1;
			int aleatorio2;
			String entrada;
			int resultado;
			int num1;
			int intentos = 0;
			
			
		do {
			
			aleatorio1 = (int)(Math.random()*100+1);
			aleatorio2 = (int)(Math.random()*100+1);
			
			entrada = JOptionPane.showInputDialog("Calcula "+ aleatorio1 + " + " +aleatorio2);
			num1 = Integer.parseInt(entrada);
			
			resultado = aleatorio1 + aleatorio2;
			
			if (num1 == resultado) {
					intentos++;
			}
			else{
				JOptionPane.showMessageDialog(null, "Has fallado, has acertado " + intentos + " veces");
			}
		}
		while (resultado == num1);
		}
	}



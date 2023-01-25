package bucleWhile;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Suma2NumerosDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio1;
		int aleatorio2;
		int resultado;
		String entrada;
		int num1;
		int intentos = 0;
		int sumas;
		
		ArrayList<Integer> listasumas = new ArrayList<Integer>();
		
		do {
			aleatorio1 = (int)(Math.random()*10+1);
			aleatorio2 = (int)(Math.random()*10+1);
	
			entrada = JOptionPane.showInputDialog(aleatorio1 +" + "+ aleatorio2);
			 num1 = Integer.parseInt(entrada);
			 resultado = aleatorio1 + aleatorio2;
			 
			 if (num1 == resultado) {
				intentos++;
				
				sumas = aleatorio1 + aleatorio2;
				 listasumas.add(sumas);
			}
			else {
				JOptionPane.showMessageDialog(null, "Has fallado, has acertado "+intentos);
				JOptionPane.showMessageDialog(null, "Estas son los resultados de las sumas " + listasumas);
			}
			
			 
			 
		}
		
		while (resultado == num1);
	}

}

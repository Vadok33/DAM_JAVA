package bucleWhile;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Suma2NumerosDoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio1;
		int aleatorio2;
		int resultado;
		String entrada;
		int num1;
		int intentos = 0;
		int sumas;
		int fallos = 0;
		
		ArrayList<Integer> listasumas = new ArrayList<Integer>();
		
		aleatorio1 = (int)(Math.random()*10+1);
		aleatorio2 = (int)(Math.random()*10+1);
		
		do {
			
	
			entrada = JOptionPane.showInputDialog(aleatorio1 +" + "+ aleatorio2);
			 num1 = Integer.parseInt(entrada);
			 resultado = aleatorio1 + aleatorio2;
			 
			 if (num1 == resultado) {
				intentos++;
				
				aleatorio1 = (int)(Math.random()*10+1);
				aleatorio2 = (int)(Math.random()*10+1);
				
				sumas = aleatorio1 + aleatorio2;
				 listasumas.add(sumas);
			}
			else {
				fallos++;
				JOptionPane.showMessageDialog(null, "Has fallado");
			}
			
			 
			 
		}
		
		while (fallos != 3);
		JOptionPane.showMessageDialog(null, "No tienes más intentos, en total has acertado " +intentos+ " sumas");
		JOptionPane.showMessageDialog(null, "Estas son los resultados de las sumas " + listasumas);
	}

}

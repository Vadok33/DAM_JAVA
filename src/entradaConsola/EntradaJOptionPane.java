package entradaConsola;

import javax.swing.JOptionPane;

public class EntradaJOptionPane {

	public static void main(String[] args) {
		
		// I/O
		
		String nombretxt = JOptionPane.showInputDialog("Por favor, introduce tu nombre");
		
		String edadtxt = JOptionPane.showInputDialog("Por favor, introduce tu edad");
		
		int edadint = Integer.parseInt(edadtxt);

		
		JOptionPane.showMessageDialog(null, "Te llamas " + nombretxt);
		
		JOptionPane.showMessageDialog(null, "El año que viene tendrás " + (edadint + 1) + " años");
	}

}

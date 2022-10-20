package entradaConsola;

import javax.swing.JOptionPane;

public class EntradaJOptionPane {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Por favor, introduce tu nombre");
		
		JOptionPane.showMessageDialog(null, "Buenos días " + name + " eres muy puta");
			
	}

}

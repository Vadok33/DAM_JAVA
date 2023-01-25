package condicional;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CondicionalSwitchJOptionPane {
	
	public static void main(String[] args) {
		
		
		String numDia = JOptionPane.showInputDialog("Por favor, introduce el día de la semana");
		int numDiaint = Integer.parseInt(numDia);
		
		diaSemana(numDiaint);
		
				
	}
	
	public static void diaSemana(int numDiaint) {
		
	
	String nombreDia;
	
	switch (numDiaint) {
	
	case 1: nombreDia = "Hoy es Lunes";
	break;
	
	case 2: nombreDia = "Hoy es Martes";
	break;
	
	case 3: nombreDia = "Hoy es Miercoles";
	break;
	
	case 4: nombreDia = "Hoy es Jueves";
	break;
	
	case 5: nombreDia = "Hoy es Viernes";
	break;
	
	case 6: nombreDia = "Hoy es Sabado";
	break;
	
	case 7: nombreDia = "Hoy es Domingo";
	break;
	
	default: nombreDia = "Numero de día incorrecto";
	break;
	
	}
	JOptionPane.showMessageDialog(null, nombreDia);
}
}

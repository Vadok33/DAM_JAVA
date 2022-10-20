package condicional;

import javax.swing.JOptionPane;

public class CondicionalSwitchJOptonPane {
	
	public static void main(String[] args) {
		
		//Scanner entrada = new Scanner(System.in);
		String numDia = JOptionPane.showInputDialog("Introduce el dia de la semana");
		int numDiaInt = Integer.parseInt(numDia);
		
		diaSemana(numDiaInt);
	}

	public static void diaSemana( int numDiaInt){
		
		String nombreDia;
		
		switch (numDiaInt) {
		case 1: nombreDia = "Lunes";
		break;
		case 2: nombreDia = "Martes";
		break;
		case 3: nombreDia = "Miercoles";
		break;
		case 4: nombreDia = "Jueves";
		break;
		case 5: nombreDia = "Viernes";
		break;
		case 6: nombreDia = "Sabado";
		break;
		case 7: nombreDia = "Domingo";
		break;
		default: nombreDia= "Nombre de dia incorrecto";
		}
		
		JOptionPane.showMessageDialog(null , nombreDia);
	}
}

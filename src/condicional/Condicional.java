package condicional;

public class Condicional {

	public static void main(String[] args) {
		
		int numDia=5;
		String nombreDia;
		
		switch (numDia) {
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
		default: nombreDia= "Numero de día incorrecto";
		break;
		
		}
		System.out.println(nombreDia);
		
	}

}

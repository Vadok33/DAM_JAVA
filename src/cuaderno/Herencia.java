package cuaderno;

public class Herencia {

	public static void main(String[] args) {
		
		
		// Inicio
		System.out.println("\n*** HERENCIA ***");
		System.out.println();
		
		
		//Crear objetos
		Empleado empleado1= new Empleado();
		Empleado empleado2= new Empleado();
		Jefe jefe1 = new Jefe();
		Consultor consultor1 = new Consultor();
		
		//Actualizar datos del empleador (SET)
		
		empleado1.setIdEmpleado(1001);
		empleado1.setDni("12345678X");
		empleado1.setNombre("Alvaro");
		empleado1.setApellido("Elena");
		empleado1.setCategoria(2);
		empleado1.setCargo("Scrum Master");
		empleado1.setSueldo(5000);
		
		//Actualizar datos del empleador (SET)
		
		empleado2.setIdEmpleado(2001);
		empleado2.setDni("87654321A");
		empleado2.setNombre("Paco");
		empleado2.setApellido("Porras");
		empleado2.setCategoria(1);
		empleado2.setCargo("Siervo");
		empleado2.setSueldo(1100);
		
		//Actualizar datos consultor1 (SET)
		
		consultor1.setIdConsultor(4001);
		consultor1.setDni("32145612T");
		consultor1.setNombre("Sebas");
		consultor1.setApellido("Topol");
		consultor1.setTarifaHora(45.5);
		consultor1.setNombreConsultora("IBM");
		
		//Actualizar datos de jefe1 (SET)
		
		jefe1.setIdJefe(3001);
		jefe1.setDptoJefe("Desarrollo");
		jefe1.setDni("65498712M");
		jefe1.setNombre("Macauli2");
		jefe1.setApellido("Culquins");
		jefe1.setCategoria(3);
		jefe1.setCargo("PJ");
		jefe1.setSueldo(2500);
		
		//Visualizar datos de empleado1 (GET)
		
		System.out.println("----------------------");
		System.out.println("****** Empleado 1 ******"
				+ "\n ----------------------"
				+ "\n Id Empl : " + empleado1.getIdEmpleado()
				+ "\n DNI : " + empleado1.getDni()
				+ "\n Nombre : " + empleado1.getNombre()
				+ "\n Apellido : " + empleado1.getApellido()
				+ "\n Categoria : " + empleado1.getCategoria()
				+ "\n Cargo : " + empleado1.getCargo()
				+ "\n Sueldo : " + empleado1.getSueldo());
		//Visualizar datos de empleado1 (GET)
		
				System.out.println("----------------------");
				System.out.println("****** Empleado 2 ******"
						+ "\n ----------------------"
						+ "\n Id Empl : " + empleado2.getIdEmpleado()
						+ "\n DNI : " + empleado2.getDni()
						+ "\n Nombre : " + empleado2.getNombre()
						+ "\n Apellido : " + empleado2.getApellido()
						+ "\n Categoria : " + empleado2.getCategoria()
						+ "\n Cargo : " + empleado2.getCargo()
						+ "\n Sueldo : " + empleado2.getSueldo());
				//Visualizar datos de empleado1 (GET)
				
				System.out.println("----------------------");
				System.out.println("****** Consultor 1 ******"
						+ "\n ----------------------"
						+ "\n Id Cons. : " + consultor1.getIdConsultor()
						+ "\n DNI : " + consultor1.getDni()
						+ "\n Nombre : " + consultor1.getNombre()
						+ "\n Apellido : " + consultor1.getApellido()
						+ "\n Tarifa/h : " + consultor1.getTarifaHora()
						+ "\n Empresa : " + consultor1.getNombreConsultora());
				//Visualizar datos de empleado1 (GET)
				
				System.out.println("----------------------");
				System.out.println("****** JEFE ******"
						+ "\n ----------------------"
						+ "\n Id Jefe : " + jefe1.getIdJefe()
						+ "\n Id Dpto. : " + jefe1.getDptoJefe()
						+ "\n Id DNI : " + jefe1.getDni()
						+ "\n Id Nombre : " + jefe1.getNombre()
						+ "\n Id Apellido : " + jefe1.getApellido()
						+ "\n Id Categoria : " + jefe1.getCategoria()
						+ "\n Id Cargo : " + jefe1.getCargo()
						+ "\n Id Sueldo : " + jefe1.getSueldo());
				
				// 
				
				System.out.println("-----------------");
				
				
		
				// Fin de programa
				
				System.out.println("----------------------");
				System.out.println("****** Fin del programa ******");
		
	}

}

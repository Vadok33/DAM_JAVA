package cuaderno;

public class POO {

// TODO Auto-generated method stub

public static void main (String[] args) {

Alumno alumno1 =new Alumno (1, "Alvaro", "Baquedano");

Alumno alumno2 =new Alumno (2, "Daniel", "Navacerrada");

Alumno alumno3 =new Alumno ();

Alumno alumno4 =new Alumno ();


System.out.println("---------------------------------------");
System.out.println("El id del alumno 1 es: " + alumno1.getID());
System.out.println("El nombre del alumno 1 es "+ alumno1.getNombre());
System.out.println("El apellido del alumno 1 es "+ alumno1.getApellido());

System.out.println("---------------------------------------");
System.out.println("El id del alumno 2 es: " + alumno2.getID());
System.out.println("El nombre del alumno 2 es "+ alumno2.getNombre());
System.out.println("El apellido del alumno 2 es "+ alumno2.getApellido());

alumno3.setId(3);
alumno3.setNombre("Gregorio");
alumno3.setApellido("Escriche");

alumno4.setId(4);
alumno4.setNombre("Alexander");
alumno4.setApellido("Zuñiga");

System.out.println("---------------------------------------");
System.out.println("El id del alumno 3 es: " +alumno3.getID());
System.out.println("El nombre del alumno 3 es " +alumno3.getNombre());
System.out.println("El apellido del alumno 3 es: " +alumno3.getApellido());

System.out.println("---------------------------------------");
System.out.println("El id del alumno 4 es: " +alumno4.getID());
System.out.println("El nombre del alumno 4 es " +alumno4.getNombre());
System.out.println("El apellido del alumno 4 es " +alumno4.getApellido());
	}

}
package cuaderno;

public class Alumno {

int id;

String nombre;

String apellido;

public Alumno () {

}

public Alumno(int id, String nombre, String apellido) {

this.id = id;

this.nombre=nombre;

this.apellido=apellido;

}

//Getters y setters

public int getID() {

return id;

}

public void setId(int id) {

this.id=id;

}

public String getNombre() {

return nombre;

}

public void setNombre(String nombre) {

this.nombre = nombre;

}

public String getApellido() {

return apellido;

}

public void setApellido(String apellido) {

this.apellido = apellido;

}

public void mostrarNombre(){

System.out.println("Hola, soy un alumno");

}
 
public void AprobarAsignatura(double calificacion) {

if (calificacion>=5) {

System.out.println("Abrobado");

}else {

System.out.println("Suspenso");

}

}

}
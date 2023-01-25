package recursividad;

import java.util.Scanner;

public class potencias {
   
	public static void main(String[] args) {
        
        System.out.print("Inicio del PROGRAMA Potencias (iteracion y recursividad)\n\t desarrollado por Alvarto Elena y Daniel Navacerrada\n\n");
        double a;
        int n;
        
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese en valor de la base (real):\n");                          // Ingreso de la base 
            a = entrada.nextDouble();
            System.out.print("Ingrese en valor del exponente (entero no negativo):\n");        // Ingreso del exponente 
            do {
                n = entrada.nextInt();
                System.out.print("Ingrese en valor del exponente POSITIVO:\n");             // Ingreso del exponente POSITIVO
            } while (n <=0);
                System.out.println("\tResultado de " + a + " elevado a "+ n+ ":");          // Resulado expresion ingresada 
                System.out.println("\tResultado iterativo= " + iterativo(a,n));                 // Resultado iterativo
                System.out.println("\tResultado recursivo= " + recursivo(a,n));               // Resultado recursivo                                                                  
        }
    }
public static double iterativo(double a, int n) {
    double resultado = 1;
    for (int i = 0; i < n; i++) {
        resultado *= a;
    }  
    return resultado;     
    }

public static double recursivo(double a, int n) {
    double resultado = 1;
    do {
        resultado *= a;
        n--;
    } while (n > 0);
    return resultado;
    }


}

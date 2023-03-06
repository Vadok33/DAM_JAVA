package ejerciciosNavidad;

import java.util.Scanner;

public class CajaRegistradora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("INICIO DEL PROGRAMA");
		
		 Scanner sc = new Scanner(System.in);

		    
		    System.out.print("\nIntroduce el precio del producto: ");
		    double precio = sc.nextDouble();
		   
		    System.out.print("\nIntroduce la cantidad de dinero pagada por el cliente: ");
		    double pago = sc.nextDouble();

		   
		    if (pago > precio) {
		     
		      double cambio = pago - precio;
		      System.out.println("\nSe debe entregar al cliente un cambio de " + cambio + " euros.");
		    } 
		    else 
		    	if (pago < precio) {
		     
		      double faltaPagar = precio - pago;
		      System.out.println("\nFalta por pagar " + faltaPagar + " euros.");
		    } 
		    else {
		    
		      System.out.println("\nEl cliente ha pagado exactamente lo que vale el producto.");
		    }
		System.out.println("\nFIN ");
	}

}

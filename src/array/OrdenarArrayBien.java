package array;

import java.util.Scanner;

public class OrdenarArrayBien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("*** INICIO DEL PROGRAMA ***");
        
        int numElementos;
        int menor=0;
        int i;
        
        Scanner entrada = new Scanner(System.in);
        do {
            
        System.out.println("Introduce el número total de elementos:");
        numElementos = entrada.nextInt();
        
        }
        while (numElementos <= 0);
        
        int[] miArray = new int [numElementos];
        
        for (i = 0; i < numElementos; i++) {
            System.out.println("Introduce numero (" +(i+1)+ ") ");
            miArray[i]=entrada.nextInt();
            
        }
        System.out.println("\nArray sin ordenar: ");
        i=0;
        for (int num: miArray) {
            System.out.print("[" +num+ "]");
            
        }
        for (i = 0; i < miArray.length; i++) {
            
            for (int j = i; j < miArray.length; j++) {
                
                if (miArray[i] > miArray[j]) {
                    
                    menor=miArray[j];
                    miArray[j]=miArray[i];
                    miArray[i]= menor;
                }
                
            }
        }
        System.out.println();
        System.out.println("Array ordenado de menor a mayor:" );
        
        for (int num:miArray) {
            System.out.print("[" +num+ "]");
        }
        entrada.close();
        System.out.println();
        System.out.println("*** FIN DEL PROGRAMA ***");
	}

}

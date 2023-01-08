package facturas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Facturas {

	public static void main(String[] args) {
            
            Scanner sc=new Scanner(System.in);
            boolean salir = false;
            int opcion;
            
            while(!salir){	    
                System.out.println("##########################################");
                System.out.println("##     SYSTEMA DE FACTURACION EQUIP    ###");
                System.out.println("##                                     ###");
                System.out.println("###               MENU                ####");
                System.out.println("##########################################");
                System.out.println("###                                   ####");
                System.out.println("##                                      ##");
                System.out.println("##     1. Crear Factura                 ##");
                System.out.println("##     2. Mostrar Factura               ##");
                System.out.println("##     3. Salir                         ##");
                System.out.println("###                                    ###");
                System.out.println("##########################################");
                System.out.println("###   Ingrese una opcion:             ####");
                opcion=sc.nextInt();sc.nextLine();
                System.out.println("##########################################");
                
                try {
                    
                    switch(opcion){
                        case 1:
                            System.out.println("1. Crear Factura");
                        break;
                        case 2:
                            System.out.println("2. Mostrar Factura");
                        break;
                        case 3:
                            System.out.println("3. Salir");
                        break;
                        case 4:
                            salir = true;
                        break;
                        default:
                            System.out.println("Elige unaopcion del 1 al 3");
                    }                
                }catch(InputMismatchException e){
                    System.out.println("Debes ingresar un número!!");
                    sc.next();
                }
            
            
                
        
            }
                
		
		
	}
}

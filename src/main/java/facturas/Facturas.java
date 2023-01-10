package facturas;

import java.util.InputMismatchException;
import java.util.Scanner;

import facturas.clases.Factura;

public class Facturas {

	public static void main(String[] args) {

		Datos datos = new Datos();
		datos.generarDatos();

		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		while (!salir) {
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
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println("##########################################");

			try {

				switch (opcion) {
				case 1:
					System.out.println("1. Crear Factura");
					
					
					Factura factura = new Factura();
					factura.setCantidad(500d);
					
					datos.generarFactura(factura);
					
					
					break;
				case 2:
					System.out.println("2. Mostrar Factura");
					datos.getFacturas(null);
					
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
			} catch (InputMismatchException e) {
				System.out.println("Debes ingresar un n�mero!!");
				sc.next();
			}

		}

	}

	public void generarDatos() {

	}
}

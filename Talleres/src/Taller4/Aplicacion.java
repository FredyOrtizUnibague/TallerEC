package Talleres.src.Taller4;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista miLista = new Lista();
		Scanner sc = new Scanner(System.in);
		
	
		String continuar = "p";
		while (continuar.equalsIgnoreCase("p"))
		{
			System.out.println("Ingrese el numero de una opción:"
					+ "\n1. Insertar un nombre "
					+ "\n2. Eliminar un nombre "
					+ "\n3. Buscar nombre "
					+ "\n4. Mostrar lista de nombres ");
			
			int opc = sc.nextInt();
			
			switch (opc)
			{
			case 1 :
			{
				System.out.println("Ingrese el nombre");
				sc.nextLine();
				String nombre = sc.nextLine();
				
				Nombres nm = new Nombres(nombre);
				miLista.insertar(nm);
				
				sc.nextLine();
				break;
			}
			case 2 :
			{
				System.out.println("Ingrese la posicion del nombre a eliminar");
				int posicion = sc.nextInt();
				miLista.eliminarPosicion(posicion);
				
				sc.nextLine();
				break;
			}
			
			case 3 :
			{
				System.out.println("Ingrese la posición: ");
				int posicion = sc.nextInt();
				System.out.println(miLista.obtenerNombre(posicion));

				sc.nextLine();
				break;
			}
			case 4 : 
			{
				miLista.verNombres();

				sc.nextLine();
				break;
			}
			
			default :
			{
				System.out.println("Opción invalida.");
			}
			}
			
			System.out.println("Escriba P si desea continuar. Otra letra en caso contrario. ");
			continuar = sc.nextLine();
			System.out.flush();
		}
		sc.close();
		}
		
	}

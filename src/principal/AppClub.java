package principal;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Persona;

public class AppClub {
	private static Scanner Scanner;

	public static void run() {
	
	ArrayList <Persona> personas= new ArrayList <Persona>();
	
	final int ENTRENADOR=1;
	final int FUTBOLISTA=2;
	final int MASAJISTA=3;
	final int TODOS=4;
	final int CONCENTRARSE=5;
	final int VIAJAR=6;
	final int SALIR=7;
	
	Scanner teclado = new Scanner(System.in);
	int opcion_menu;
	

	do {
		System.out.println("------Personas-------");
		System.out.println(ENTRENADOR + ". Crear Entrenador");
		System.out.println(FUTBOLISTA + ". Crear Futbolista");
		System.out.println(MASAJISTA + ". Crear Masajista");
		System.out.println(TODOS + ". Mostrar todos");
		System.out.println(CONCENTRARSE + ". Mostrar concentrarse");
		System.out.println(VIAJAR + ". Mostrar viajar");
		System.out.println(SALIR + ". Salir");
		System.out.println("Elije una de las opciones");
		opcion_menu = teclado.nextInt();

		switch (opcion_menu) {
		case ENTRENADOR:
			System.out.println("primera opcion seleccionada\n");
			break;
		case FUTBOLISTA:
			System.out.println("segunda opcion seleccionada\n");
			break;
		case MASAJISTA:
			System.out.println("tercera opcion seleccionada\n");
			break;
		case CONCENTRARSE:
			System.out.println("tercera opcion seleccionada\n");
			break;
		case VIAJAR:
			System.out.println("tercera opcion seleccionada\n");
			break;
		case SALIR:
			System.out.println("ADIOS");
			break;
		default:
			System.out.println("Opcion incorrecta!");
		}
		System.out.println("");
	} while (opcion_menu != SALIR);
	teclado.close();
	
		
	}
}

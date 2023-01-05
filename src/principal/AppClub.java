package principal;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Entrenador;
import clases.Futbolista;
import clases.Masajista;
import clases.Persona;

public class AppClub {
	private static Scanner Scanner;

	public static void run() {

		ArrayList<Persona> personas = new ArrayList<Persona>();

		final int ENTRENADOR = 1;
		final int FUTBOLISTA = 2;
		final int MASAJISTA = 3;
		final int TODOS = 4;
		final int CONCENTRARSE = 5;
		final int VIAJAR = 6;
		final int SALIR = 7;

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
				Entrenador entrenador = crearEntrenador();
				personas.add(entrenador);
				Scanner.nextLine();
				break;
			case FUTBOLISTA:
				Futbolista futbolista = crearFutbolista();
				personas.add(futbolista);
				Scanner.nextLine();
				break;
			case MASAJISTA:
				Masajista masajista = crearMasajista();
				personas.add(masajista);
				Scanner.nextLine();
				break;
			case TODOS:
				todos(personas);
				break;
			case CONCENTRARSE:
				concentrarse(personas);
				break;
			case VIAJAR:
				viajar(personas);
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

	public static Entrenador crearEntrenador() {
		Scanner = new Scanner(System.in);

		String clase_1;
		int ID_1;
		String nombre_1;
		String apellidos_1;
		int edad_1;
		String titulacion_1;
		int aniosExperiencia_1;

		System.out.println("Que clase es?");
		clase_1 = Scanner.nextLine();
		System.out.println("Cual es su ID?");
		ID_1 = Scanner.nextInt();
		Scanner.nextLine();
		System.out.println("Cual es su nombre?");
		nombre_1 = Scanner.nextLine();
		
		System.out.println("Cual es su apellido");
		apellidos_1 = Scanner.nextLine();
		System.out.println("Cual es su edad?");
		edad_1 = Scanner.nextInt();
		Scanner.nextLine();
		System.out.println("Qué titulación tiene?");
		titulacion_1 = Scanner.nextLine();
		
		System.out.println("Cuantos añios de experiencia tiene?");
		aniosExperiencia_1 = Scanner.nextInt();

		Entrenador entrenador = new Entrenador(clase_1);
		entrenador.setClase(clase_1);
		entrenador.setID(ID_1);
		entrenador.setNombre(nombre_1);
		entrenador.setApellidos(apellidos_1);
		entrenador.setEdad(edad_1);
		entrenador.setTitulacion(titulacion_1);
		entrenador.setAniosExperiencia(aniosExperiencia_1);

		return entrenador;

	}

	public static Futbolista crearFutbolista() {
		Scanner = new Scanner(System.in);

		String clase_2;
		int ID_2;
		String nombre_2;
		String apellidos_2;
		int edad_2;
		int dorsal_2;
		String demarcacion_2;

		System.out.println("Que clase es?");
		clase_2 = Scanner.nextLine();
		System.out.println("Cual es su ID?");
		ID_2 = Scanner.nextInt();
		Scanner.nextLine();
		System.out.println("Cual es su nombre?");
		nombre_2 = Scanner.nextLine();
		
		System.out.println("Cual es su apellido");
		apellidos_2 = Scanner.nextLine();
		System.out.println("Cual es su edad?");
		edad_2 = Scanner.nextInt();
		
		System.out.println("Cual es su número dorsal?");
		dorsal_2 = Scanner.nextInt();
		
		System.out.println("Cual es su demarcación?");
		demarcacion_2 = Scanner.nextLine();

		Futbolista futbolista = new Futbolista(clase_2);
		futbolista.setClase(clase_2);
		futbolista.setID(ID_2);
		futbolista.setNombre(nombre_2);
		futbolista.setApellidos(apellidos_2);
		futbolista.setEdad(edad_2);
		futbolista.setDorsal(dorsal_2);
		futbolista.setDemarcación(demarcacion_2);

		return futbolista;

	}

	public static Masajista crearMasajista() {
		Scanner = new Scanner(System.in);

		String clase_3;
		int ID_3;
		String nombre_3;
		String apellidos_3;
		int edad_3;
		String titulacion_3;
		int aniosExperiencia_3;

		System.out.println("Que clase es?");
		clase_3 = Scanner.nextLine();
		System.out.println("Cual es su ID?");
		ID_3 = Scanner.nextInt();
		Scanner.nextLine();
		System.out.println("Cual es su nombre?");
		nombre_3 = Scanner.nextLine();
		
		System.out.println("Cual es su apellido");
		apellidos_3 = Scanner.nextLine();
		System.out.println("Cual es su edad?");
		edad_3 = Scanner.nextInt();
		Scanner.nextLine();
		System.out.println("Qué titulación tiene?");
		titulacion_3 = Scanner.nextLine();
		
		System.out.println("Cuantos añios de experiencia tiene?");
		aniosExperiencia_3 = Scanner.nextInt();

		Masajista masajista = new Masajista(clase_3);
		masajista.setClase(clase_3);
		masajista.setID(ID_3);
		masajista.setNombre(nombre_3);
		masajista.setApellidos(apellidos_3);
		masajista.setEdad(edad_3);
		masajista.setTitulacion(titulacion_3);
		masajista.setAniosDeExperiencia(aniosExperiencia_3);

		return masajista;

	}
	public static void todos(ArrayList <Persona> personas) {
		for (int i = 0; i < personas.size(); i++) {
			System.out.println(personas.get(i));
		}
	}
	
	public static void concentrarse(ArrayList <Persona> personas) {
		for (Persona persona : personas) {
			persona.concentrarse();
		}
	}
	
	public static void viajar (ArrayList <Persona> personas) {
		for (Persona persona : personas) {
			persona.viajar();
		}
	}

}

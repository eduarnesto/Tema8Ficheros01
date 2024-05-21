package ejercicio07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Principal {

	public static Scanner sc = new Scanner(System.in);
	public static TreeMap<String, Integer> agenda = new TreeMap<String, Integer>();

	public static void main(String[] args) {
		int opc;

		do {
			menu();
			opc = sc.nextInt();
			sc.nextLine();
			
			switch (opc) {
			case 1: 
				anyadirContacto();
				break;
			case 2: 
				mostrarTelefono();
				break;
			case 3: 
				mostrarListado();
				break;
			case 4: 
				guardarDatos();
				break;
			case 5: 
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción elegida no valida");
			}
			
		} while (opc != 5);
		
		sc.close();
	}

	private static void menu() {
		System.out.println("Seleccione una opcion");
		System.out.println("1.- Nuevo contacto");
		System.out.println("2.- Buscar por nombre");
		System.out.println("3.- Mostrar lista de contactos");
		System.out.println("4.- Guardar datos");
		System.out.println("5.- Salir");
	}

	private static void anyadirContacto() {
		String nombre;
		int telefono;
		boolean anyadido = false;

		if (agenda.size() < 20) {
			System.out.println("Introduzca el nombre");
			nombre = sc.nextLine();

			System.out.println("Introduzca el numero de telefono");
			telefono = sc.nextInt();
			sc.nextLine();

			if (agenda.put(nombre, telefono) == null) {
				anyadido = true;
			}
		}
		
		if (anyadido) {
			System.out.println("Se ha añadido correctamente el contacto");
		} else {
			System.out.println("No se ha podido añadir el contacto");
		}

	}
	
	private static void mostrarTelefono() {
		String nombre;
		Integer telefono;
		
		System.out.println("Introduzca el nombre");
		nombre = sc.nextLine();
		
		telefono = agenda.get(nombre);
		
		if (telefono != null) {
			System.out.println("El numero de telefono de " + nombre + " es " + telefono);
		} else {
			System.out.println("No se ha encontrado un contacto con ese nombre");
		}
	}
	
	private static void mostrarListado() {
		for (Entry<String, Integer> par : agenda.entrySet()) {
			System.out.println(par.getKey() + " --> " + par.getValue());
		}
	}

	private static void guardarDatos() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/ejercicio07/agenda.txt"));
			for (Entry<String, Integer> par : agenda.entrySet()) {
				bw.write(par.getKey() + " --> " + par.getValue());
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

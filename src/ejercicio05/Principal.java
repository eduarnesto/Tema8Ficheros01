package ejercicio05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nombre;
		int edad;
		BufferedWriter bw = null;
		Scanner sc = new Scanner (System.in);
		
		try {
			bw = new BufferedWriter(new FileWriter("src/ejercicio05/Datos.txt", true));
			System.out.println("Introduzca un nombre");
			nombre = sc.nextLine();
			
			System.out.println("Introduzca la edad");
			edad = sc.nextInt();
			
			bw.write("Nombre: " + nombre + ", " + "Edad: " + edad);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Fin");
		
		sc.close();
	}

}

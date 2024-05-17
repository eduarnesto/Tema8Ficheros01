package ejercicio03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int contador = 0;
		int edadTotal = 0;
		float alturaTotal = 0;
		float mediaEdad;
		float mediaAltura;
		String linea;
		String[] persona = new String[3];
		Scanner sc = null;

		try {
			sc = new Scanner(new FileReader("src/ejercicio03/Alumnos.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (sc.hasNextLine()) {
			linea = sc.nextLine();
			persona = linea.split(" ");
			System.out.println(persona[0]);
			edadTotal += Integer.valueOf(persona[1]);
			alturaTotal += Float.valueOf(persona[2]);
			contador++;
		}

		mediaEdad = edadTotal / contador;
		mediaAltura = alturaTotal / contador;

		System.out.println("Media de las edades: " + mediaEdad);
		System.out.println("Media de las alturas: " + mediaAltura);

		sc.close();
	}
}

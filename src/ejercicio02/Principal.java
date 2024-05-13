package ejercicio02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double media;
		int contador = 0;
		int suma = 0;
		Scanner sc = null;
		
		try {
			 sc = new Scanner(new FileReader("src/ejercicio02/Enteros.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (sc.hasNextInt()) {
			suma += sc.nextInt();
			contador++;
			sc.nextLine();
		}
		
		media = (double)suma/contador;
		
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
		
		sc.close();
	}

}

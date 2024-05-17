package ejercicio04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String palabra = "";
		Scanner sc = null;
		
		try {
			 sc = new Scanner(new FileReader("src/ejercicio04/Texto.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (!palabra.equals("fin") && sc.hasNext()) {
			palabra = sc.next();
		}
		
		System.out.println(palabra);
		
		sc.close();
	}

}

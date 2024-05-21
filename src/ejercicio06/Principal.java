package ejercicio06;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		BufferedWriter bw = null;
		try {
			Scanner sc = new Scanner(new FileReader("src/ejercicio06/NumerosAleatorios.txt"));
			while(sc.hasNext()) {
				numeros.add(sc.nextInt());
			}
			
			sc.close();
			
			bw = new BufferedWriter(new FileWriter("src/ejercicio06/NumerosOrdenados.txt"));
			for(Integer valor : numeros) {
				bw.write(valor);
				bw.newLine();
			}
			
			bw.flush();
			bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (IOException i) {
			System.out.println("Error con el archivo");
		}
		
	}

}
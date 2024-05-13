package ejercicio03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/ejercicio03/Alumnos.txt"));
		} catch (IOException e) {
			
		}
	}

}

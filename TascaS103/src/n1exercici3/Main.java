package n1exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Donat el fitxer countrties.txt (revisa l'apartat recursos) que conté països i
		 * capitals. El programa ha de llegir el fitxer i guardar les dades en un
		 * HashMap<String, String>. El programa demana el nom de l’usuari/ària, i
		 * després ha de mostrar un país de forma aleatòria, guardat en el HashMap. Es
		 * tracta de què l’usuari/ària ha d’escriure el nom de la capital del país en
		 * qüestió. Si l’encerta se li suma un punt. Aquesta acció es repeteix 10
		 * vegades. Un cop demanades les capitals de 10 països de forma aleatòria,
		 * llavors s’ha de guardar en un fitxer anomenat classificacio.txt, el nom de
		 * l’usuari/ària i la seva puntuació.
		 */

		HashMap<String, String> countries = new HashMap<>();
		ArrayList<String> keys = new ArrayList<>();
		
		try {
			File archivo = new File("C:\\Users\\Usuario\\git\\TascaS103\\TascaS103\\src\\n1exercici3\\Countries.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);

			String linea;
			while ((linea = br.readLine()) != null) {
				String[] splits = linea.split("\\s+");
				countries.put(splits[0], splits[1]);
				keys.add(splits[0]);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		int puntuacio=0;
		String nom=obtenString("Dame un nombre o apodo: ");
	
		for (int i = 0; i < 10; i++) {
			int key = (int) Math.ceil((Math.random() * 51))-1;
			String respuesta = obtenString("Whats the capital of "+keys.get(key));
			if (countries.get(keys.get(key)).equalsIgnoreCase(respuesta)) {
				puntuacio++;
			}
		}
		
		
		try {

			File clasificacio = new File("C:\\Users\\Usuario\\git\\TascaS103\\TascaS103\\src\\n1exercici3\\Classificacio.txt");
			Scanner s  = new Scanner(clasificacio);
		
			ArrayList<String> lineas = new ArrayList<>();
			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				lineas.add(s.nextLine()); 	// Guardamos la linea en un array				
			}
			
			
			FileWriter fwriter = new FileWriter(clasificacio);		
			BufferedWriter bwriter = new BufferedWriter(fwriter);
		
			for (int i = 0; i < lineas.size(); i++) {
				bwriter.write(lineas.get(i));
				bwriter.newLine();
			}
			
			bwriter.write(nom + " : " + puntuacio);
			bwriter.close();
			System.out.println("Successfully wrote to the file.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	static String obtenString(String mensaje) {
		Scanner input = new Scanner(System.in);		
		System.out.println(mensaje);
		return input.nextLine();
	}

}

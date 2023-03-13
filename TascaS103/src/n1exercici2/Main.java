package n1exercici2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crea i emplena un List<Integer>. 

Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers. 

Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.
		 */

		
		List<Integer> llista1 = new ArrayList<>();
		
		llista1.add(1);
		llista1.add(2);
		llista1.add(3);
		
		ListIterator<Integer> iterador = llista1.listIterator();
		
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
		//cursor de l'iterador 'fora' de la llista
		System.out.println("----");
		List<Integer> llista2 = new ArrayList<>();
		
		while (iterador.hasPrevious()) {
			llista2.add(iterador.previous());
		}
		
		//demostracio llista2 es llista1 en ordre invers
		ListIterator<Integer> iterador2 = llista2.listIterator();
		
		while (iterador2.hasNext()) {
			System.out.println(iterador2.next());
		}
		
	}

}

package n2exercici1;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int). 
		 * Implementa els mètodes necessaris perquè no es puguin introduir objectes 
		 * Restaurant amb el mateix nom i la mateixa puntuació en un HashSet creat en el main() de l’aplicació.

 Important

Pot haver-hi restaurants amb el mateix nom amb diferent puntuació, 
però no pot haver-hi restaurants amb el mateix nom i la mateixa puntuació.
		 */

		Restaurant r1 = new Restaurant("a", 1);
		Restaurant r2 = new Restaurant("a", 1);
		System.out.println(r1.equals(r2));
		Restaurant r3 = new Restaurant("b", 5);
		Restaurant r4 = new Restaurant("c", 6);
		
		HashSet<Restaurant> restaurants = new HashSet<>();
		restaurants.add(r1);
		restaurants.add(r2);
		restaurants.add(r3);
		restaurants.add(r4);
		
		System.out.println(restaurants);
		
		
	}

}

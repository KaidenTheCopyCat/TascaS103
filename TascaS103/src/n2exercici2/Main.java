package n2exercici2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import n2exercici1.Restaurant;

public class Main {

	public static void main(String[] args) {
		/*
		 * Utilitzant la classe del programa anterior, 
		 * crea la implementació necessària perquè els objectes de la classe Restaurant estiguin ordenats
		 *  per nom i per puntuació en ordre ascendent. 

Exemple: 

nom: restaurant1, puntuació: 8

nom: restaurant1, puntuació: 7
		 */
		Restaurant r1 = new Restaurant("a", 1);
		Restaurant r2 = new Restaurant("a", 1);
		System.out.println(r1.equals(r2));
		Restaurant r3 = new Restaurant("b", 5);
		Restaurant r4 = new Restaurant("c", 6);
		Restaurant r5 = new Restaurant("a", 3);
		
		HashSet<Restaurant> restaurants = new HashSet<>();
		restaurants.add(r1);
		restaurants.add(r2);
		restaurants.add(r3);
		restaurants.add(r4);
		restaurants.add(r5);
		
		System.out.println(restaurants);
		
		
		// sorting using Java 1.8 stream
        List<Restaurant> lstOfEmployee = restaurants.stream().sorted(Comparator.comparing(Restaurant::getNom)).collect(Collectors.toList());
 
 
		
        for(Restaurant restOrder : lstOfEmployee) {
            System.out.println(restOrder);
        }
		
	}

}

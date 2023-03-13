package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crea una classe anomenada Month amb un atribut "name" (que emmagatzemarà el nom del mes de l'any). 
		 * Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un ArrayList, 
		 * a excepció de l'objecte amb atribut "Agost". Després, efectua la inserció en el 
		 * lloc que correspon a aquest mes i demostra que l’ArrayList manté l'ordre correcte.

		 */

		ArrayList<Month> months = new ArrayList<>();
		
		Month gener = new Month("Gener");
		Month febrer = new Month("Febrer");
		Month marc = new Month("Marc");
		Month abril = new Month("Abril");
		Month maig = new Month("Maig");
		Month juny = new Month("Juny");
		Month juliol = new Month("Juliol");		
		Month septembre = new Month("Septembre");
		Month octubre = new Month("Octubre");
		Month novembre = new Month("Novembre");
		Month desembre = new Month("Desembre");
		
		months.add(gener);
		months.add(febrer);
		months.add(marc);
		months.add(abril);
		months.add(maig);
		months.add(juny);
		months.add(juliol);
		months.add(septembre);
		months.add(octubre);
		months.add(novembre);
		months.add(desembre);
		
		System.out.println("arraylist sense agost");
		
		for (int i = 0; i < months.size(); i++) {
			System.out.println(months.get(i));			
		}
		
		System.out.println("arraylist amb agost");
		
		Month agost = new Month("Agost");		
		months.add(7, agost);
		
		for (int i = 0; i < months.size(); i++) {
			System.out.println(months.get(i));			
		}		
		
		
		/*Converteix l’ArrayList de l’exercici anterior en un HashSet i assegura’t que no permet duplicats.

		Recorre la llista amb un for i amb un iterador.*/
		
		HashSet<Month> monthsset = new HashSet<>();
		monthsset.add(gener);
		monthsset.add(febrer);
		monthsset.add(marc);
		monthsset.add(abril);
		monthsset.add(maig);
		monthsset.add(juny);
		monthsset.add(juliol);
		monthsset.add(agost);
		monthsset.add(septembre);
		monthsset.add(octubre);
		monthsset.add(novembre);
		monthsset.add(desembre);
		// octubre un altre cop, no es mostrara per pantalla
		monthsset.add(octubre);
		
		System.out.println("Hashset for");
		for (Month i : monthsset) {
			System.out.println(i);	
		}
		
		System.out.println("Hashset Iterador");
		
		Iterator<Month> iterador = monthsset.iterator();
		
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
			
		}
		
		
	}

}

package n2exercici1;

public class Restaurant {

	private String nom;
	private int puntuacio;
	
	public Restaurant(String nom, int puntuacio) {
	
		this.nom = nom;
		this.puntuacio = puntuacio;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getPuntuacio() {
		return puntuacio;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean same = false;
		if (((Restaurant)obj).getNom().equalsIgnoreCase(nom) && ((Restaurant)obj).getPuntuacio()==puntuacio) {
			same=true;
		}
		return same;
	}
	 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Restaurant [nom=" + nom + ", puntuacio=" + puntuacio + "]";
	}
	
}

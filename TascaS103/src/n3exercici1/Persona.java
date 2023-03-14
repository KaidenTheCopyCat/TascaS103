package n3exercici1;

public class Persona {

	
	
	private String nom, cognom;
	private final String DNI;
	
	public Persona(String nom, String cognom, String dNI) {
		this.nom = nom;
		this.cognom = cognom;
		DNI = dNI;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public String getDNI() {
		return DNI;
	}
	
	
	
	
}

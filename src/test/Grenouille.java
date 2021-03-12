package test;

public class Grenouille extends Animal{
	private String adresse;
	
	
	public Grenouille (int taille, int age, String nom, String prenom, String espece, String adresse) {
		super (taille, age, nom, prenom, espece);
		this.adresse = adresse;
	}
}

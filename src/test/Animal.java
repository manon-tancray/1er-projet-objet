package test;

public class Animal {
	protected int taille;
	protected int age;
	protected String nom;
	protected String prenom;
	protected String espece;
	
	
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public Animal(int taille, int age, String nom, String prenom, String espece) {
		super();
		this.taille = taille;
		this.age = age;
		this.nom = nom;
		this.prenom = prenom;
		this.espece = espece;
	}
	public String getEspece() {
		return espece;
	}
	public void setEspece(String espece) {
		this.espece = espece;
	}
	
	
	
}

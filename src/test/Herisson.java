package test;

public class Herisson extends Animal{
	private String couleur; 

	public Herisson(int taille, int age, String nom, String prenom, String espece, String couleur) {
		super (taille, age, nom, prenom, espece);
		this.couleur = couleur;
	}
	
}

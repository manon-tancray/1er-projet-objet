package test;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	private String nom;
	private String prenom;
	private int age;
	private String classe;
	private List<Chien> chiens;
	private List<Animal> animaux;

	public Etudiant(String nom,String prenom,int age, String classe) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.classe = classe;
		this.chiens = new ArrayList<Chien>();
		this.animaux = new ArrayList<Animal>();
	}
	
	public void sePresenter() {
		System.out.println("je suis " + nom +" "+ prenom +" et j'ai " + age +" ans je suis dans la classe de "+ classe + "et voici mes chiens: " + chiens);
		for (int i =0; i< chiens.size(); i++) {
			chiens.get(i).sePresenter();
		}
		System.out.println("Mais j'ai également : "+ animaux);
		for (int i =0; i< animaux.size(); i++) {
			animaux.get(i).sePresenter();
		}
	}
	public String toString() {
		return  prenom+" "+nom+" "+age+" ans";
	}
	
	public void ajouterChien(Chien p_chien) {
		chiens.add(p_chien);
	}
	
	public void retirerChien(int numeroChien) {
		chiens.remove(numeroChien);
	}
	public void ajouterAnimal (Animal p_animal) {
		animaux.add(p_animal);	
	}
	public void retirerAnimal(Animal p_animal) {
		animaux.remove(p_animal);
	}
}
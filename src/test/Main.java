package test;

import java.util.ArrayList;
import java.util.List;

public class Main { 
	public static void main(String[] args) {
		Chien un = new Chien (40,12,"Plouf","Fox Terrier");
		Chien deux = new Chien (70,2,"Rex","Berger Allemand");
		Chien chien = new Chien (200,2,"Rex","Berger allemand");
		Etudiant manon = new Etudiant("TANCRAY","Manon",21,"BTS SIO, je vais laisser mes chien se présenter ");
		Etudiant audrey = new Etudiant("TANCRAY","Audrey",16,"Seconde generale");
		Classe bts = new Classe("btssio");
		Animal grenouille = new Animal("une grenouille", "Gabi", 2);
		Animal herisson = new Animal(" un hérisson", "Mr hérisson", 4);
		
		List<Chien> chenil = new ArrayList<Chien>();
		
		chenil.add(un);
		chenil.add(deux);
		manon.ajouterChien(un);
		manon.ajouterChien(deux);
		manon.ajouterChien(chien);
		manon.retirerChien(1);
		manon.ajouterAnimal(grenouille);
		manon.ajouterAnimal(herisson);
		manon.sePresenter();
		audrey.ajouterChien(deux);
		bts.ajouterEtudiant(manon);
		bts.ajouterEtudiant(audrey);
		bts.presenterClasse();
		bts.retirerEtudiant(audrey);
		
	}
}

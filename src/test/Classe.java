package test;

import java.util.ArrayList;
import java.util.List;

public class Classe {
	private List<Etudiant> etudiants;
	private String libelle;

	
	public Classe(String libelle) {
	
		this.libelle = libelle;
		this.etudiants = new ArrayList<Etudiant>();
		
		}
	
	public void ajouterEtudiant (Etudiant p_etudiant) {
		etudiants.add(p_etudiant);
	}
	
	public void retirerEtudiant (Etudiant p_etudiant) {
		etudiants.remove(p_etudiant);
	}
	public void presenterClasse () {
		
		System.out.println("la classe " + libelle+ " est composée des étudiants suivant: "+etudiants);
		for (int i = 0; i< etudiants.size(); i++) {
			etudiants.get(i).sePresenter();
			}
		}
}
//creation d'un objet, geter seter comment les objet sont lier, comment créer une methode message d'erreure

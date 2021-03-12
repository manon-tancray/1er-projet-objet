package test;

public class Animal {
	private String espece;
	private String nom;
	private int age;
	
	
	public Animal (String espece, String nom, int age) {
		this.espece = espece;
		this.nom = nom;
		this.age = age;
	}
	public void sePresenter() {
		System.out.println("je suis " + espece + " je m'appelle " + nom + " et j'ai " + age + " ans.");
	}
	public String toString() {
		return espece;
	}
	
	
}

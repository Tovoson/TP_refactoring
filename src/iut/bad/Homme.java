package iut.bad;

public class Homme extends Humain{
	
	public Homme() {
		
	}
	
	public Homme(String nom, String prenom, int age) {
	
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public String toString() {
		return "Nom : " + nom + "\nPrénom : " + prenom + "\nAge : " + age;
	}
}

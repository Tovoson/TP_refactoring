package iut.bad;

public class Femme extends Humain{
	
	public Femme() {
		
	}
	
	public Femme(String nom, String prenom, int age) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public String toString() {
		return "Nom : " + nom + "\nPrénom : " + prenom + "\nAge : " + age;
	}
	
	public static void main(String[] args) {
        Femme femme = new Femme("Jeanne", "Marie", 30);
        Homme homme = new Homme("Pierre", "Paul", 35);

        femme.ami(homme, 150); 
    }
	
}

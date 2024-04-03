package iut.bad;

public class Humain implements Consommation{
	protected String nom;
	protected String prenom;
	protected int age;
	
	public String getNom() {
		return nom;
	}
	
	public void details() {
		System.out.println(toString());
	}

	@Override
	public void manger() {
		System.out.println("Je mange de la nourriture.");
	}
	
	@Override
	public void boire() {
		System.out.println("Je bois une boisson.");
	}
	
	
	public void ami(Humain Femme, int dureeAmitie) {
        System.out.println("Je suis ami avec " + Femme.getNom() + " depuis " + dureeAmitie + " jours.");
    }
}

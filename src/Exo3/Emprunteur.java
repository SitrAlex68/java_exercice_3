package Exo3;

public class Emprunteur 
{
	private String nom;
	private String adresse;
	private String numeroDeTelephone;

	public Emprunteur(String name, String adress, String phoneNumber)
	{
		nom = name;
		adresse = adress;
		numeroDeTelephone = phoneNumber;
	}

	public void afficherEmprunteur()
	{
		System.out.println("Nom : " + this.nom);
		System.out.println("Adresse : " + this.adresse);
		System.out.println("Numéro de téléphone : " + this.numeroDeTelephone);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}

	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}

	@Override
	public String toString() {
		return "Emprunteur [nom=" + nom + ", adresse=" + adresse + ", numeroDeTelephone=" + numeroDeTelephone + "]";
	}
	
	
}

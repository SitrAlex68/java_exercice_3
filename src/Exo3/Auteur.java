package Exo3;

public class Auteur 
{
	private String nom;
	private String dateDeNaissance;
	private String nationalite;
	
	public Auteur(String name, String BirthDate, String nationality)
	{
		nom = name;
		dateDeNaissance = BirthDate;
		nationalite = nationality;
	}
	
	public void afficherAuteur()
	{
		System.out.println("Nom : " + this.nom);
		System.out.println("Date de naissance : " + this.dateDeNaissance);
		System.out.println("Nationalité : " + this.nationalite);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	@Override
	public String toString() {
		return "Auteur [nom=" + nom + ", dateDeNaissance=" + dateDeNaissance + ", nationalite=" + nationalite + "]";
	}
	
	
}

package Exo3;

public class Livre 
{
	private String titre;
	private Auteur auteur;
	private String dateDePublication;
	private int numeroIdentification;
	private boolean disponibilite;

	public Livre(String title, Auteur author, String publicationDate, int idNumber, boolean available)
	{
		titre = title;
		auteur = author;
		dateDePublication = publicationDate;
		numeroIdentification = idNumber;
		disponibilite = available;
	}

	public void afficherLivre()
	{
		System.out.println("Titre : " + this.titre);
		System.out.println("Auteur : " + this.auteur);
		System.out.println("Date de publication : " + this.dateDePublication);
		System.out.println("Numero d'identification : " + this.numeroIdentification);
		System.out.println("Disponibilité : " + this.disponibilite);
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public String getDateDePublication() {
		return dateDePublication;
	}

	public void setDateDePublication(String dateDePublication) {
		this.dateDePublication = dateDePublication;
	}

	public int getNumeroIdentification() {
		return numeroIdentification;
	}

	public void setNumeroIdentification(int numeroIdentification) {
		this.numeroIdentification = numeroIdentification;
	}

	public boolean isDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}

	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", dateDePublication=" + dateDePublication
				+ ", numeroIdentification=" + numeroIdentification + ", disponibilite=" + disponibilite + "]";
	}
	
	
}

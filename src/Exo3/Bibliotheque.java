package Exo3;


import java.util.ArrayList;
public class Bibliotheque 
{
	private ArrayList<Livre> listeLivres = new ArrayList<>();
	private ArrayList<Auteur> listeAuteurs = new ArrayList<>();
	private ArrayList<Emprunteur> listeEmprunteurs = new ArrayList<>();

	public Bibliotheque(ArrayList<Livre> bookList, ArrayList<Auteur> authorList, ArrayList<Emprunteur> borrowerList)
	{
		listeLivres = bookList;
		listeAuteurs = authorList;
		listeEmprunteurs = borrowerList;
	}

	public void ajouterLivre(Livre book)
	{
		this.listeLivres.add(book);
	}

	public void ajouterAuteur(Auteur author)
	{
		this.listeAuteurs.add(author);
	}
	
	public void ajouterEmprunteur(Emprunteur borrower)
	{
		this.listeEmprunteurs.add(borrower);
	}

	public void supprimerLivre(Livre book)
	{
		this.listeLivres.remove(book);
	}

	public void supprimerAuteur(Auteur author)
	{
		this.listeAuteurs.remove(author);
	}

	public void supprimerEmprunteur(Emprunteur borrower)
	{
		this.listeEmprunteurs.remove(borrower);
	}

	public void modifierLivre(Livre book)
	{
		this.listeLivres.set(this.listeLivres.indexOf(book), book);
	}

	public void modifierAuteur(Auteur author)
	{
		this.listeAuteurs.set(this.listeAuteurs.indexOf(author), author);
	}

	public void modifierEmprunteur(Emprunteur borrower)
	{
		this.listeEmprunteurs.set(this.listeEmprunteurs.indexOf(borrower), borrower);
	}

	public void afficherListeLivres()
	{
		for(Livre book : this.listeLivres)
			book.afficherLivre();
	}

	public void afficherListeAuteurs()
	{
		for(Auteur author : this.listeAuteurs)
			author.afficherAuteur();
	}

	public void afficherListeEmprunteurs()
	{
		for(Emprunteur borrower : this.listeEmprunteurs)
			borrower.afficherEmprunteur();
	}

	public void emprunterLivre(int ISBN, String borrowerName)
	{
		for(Livre book : this.listeLivres)
			if(book.getNumeroIdentification() == ISBN)
			{
				book.setDisponibilite(false);
				this.supprimerLivre(book);
				Emprunteur borrower = null;
				borrower.setNom(borrowerName);
				this.ajouterEmprunteur(borrower);
				break;
			}
	}

	public void retournerLivre(int ISBN)
	{
		Livre returnedBook = null;
		this.ajouterLivre(returnedBook);
		returnedBook.setDisponibilite(true);
	}	
}

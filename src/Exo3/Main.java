package Exo3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	{
		Auteur author1 = new Auteur("KGS", "14/02/1990", "Française");
		author1.afficherAuteur();
		Auteur author2 = new Auteur("GSK", "15/03/1990", "Française");
		author2.afficherAuteur();
		Auteur author3 = new Auteur("SKG", "16/04/1990", "Française");
		author3.afficherAuteur();
		
		Livre book1 = new Livre("Un titre", author1, "14/02/2010", 1, true);
		book1.afficherLivre();
		Livre book2 = new Livre("2e titre", author2, "28/02/2011", 2, true);
		book2.afficherLivre();
		Livre book3 = new Livre("3e titre", author3, "14/03/2012", 3, true);
		book3.afficherLivre();

		ArrayList<Livre> listeLivres = new ArrayList<>();
		ArrayList<Auteur> listeAuteurs = new ArrayList<>();
		ArrayList<Emprunteur> listeEmprunteurs = new ArrayList<>();

		listeLivres.add(book1);
		listeLivres.add(book2);
		listeLivres.add(book3);

		listeAuteurs.add(author1);
		listeAuteurs.add(author2);
		listeAuteurs.add(author3);
		

		Bibliotheque library = new Bibliotheque(listeLivres, listeAuteurs, listeEmprunteurs);
		
		Livre book4 = new Livre("4e titre", author1, "16/04/2013", 4, true);
		library.ajouterLivre(book4);
		library.afficherListeLivres();
		
		Auteur author4 = new Auteur("SSK", "12/11/1980", "Française");
		library.ajouterAuteur(author4);
		library.afficherListeAuteurs();

		Emprunteur borrower1 = new Emprunteur("Br", "1, rue Toto", "0123456789");
		library.afficherListeEmprunteurs();
		
		library.emprunterLivre(book1.getNumeroIdentification(), borrower1.getNom());
		
		library.retournerLivre(book1.getNumeroIdentification());

	}

}

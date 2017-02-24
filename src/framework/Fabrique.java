package framework;

/*******************************************************************************
Cours : LOG121
Session : H2017
Groupe : 1
Projet : Laboratoire #3
Étudiants : Samnang Eang
			Francis Prud'Homme
			
Professeur : Francis Cardinal
Chargés de cours : Antoine Grenier
				   Mathieu Ouellet
				   
Nom du fichier : Fabrique.java
Date de création : 2017-02-24
Date de dernière modification : 2017-02-
********************************************************************************
Historique des modifications
********************************************************************************
2017-02-24 Version initiale
2017-02-
2017-02-
2017-02-
2017-02-
2017-02-
*******************************************************************************/

/**
 * Cette classe...
 */
public class Fabrique {

	/**
	 * La seule instance de Fabrique.
	 */
	private static final Fabrique INSTANCE = new Fabrique();
	
	
	
	
	/********************
	 * CONSTRUCTEURS
	 ********************/
	/**
	 * Constructeur par défaut
	 */
	private Fabrique() {}
	
	
	
	
	/********************
	 * AUTRES MÉTHODES
	 ********************/
	/**
	 * Accède à la seule instance de Fabrique
	 * @return INSTANCE la seule instance de Fabrique
	 */
	public static Fabrique getInstance() {
		return INSTANCE;
	}
	
	
	/**
	 * Crée un joueur ayant le nom spécifié
	 * @param nom le nom de ce joueur
	 */
	public Joueur creerJoueur(String nom) {
		return new Joueur(nom);
	}
	
	
	/**
	 * Crée un dé comportant le nombre de faces spécifié
	 * @param nbFaces le nombre de faces du dé
	 */
	public De creerDe(int nbFaces) {
		return new De(nbFaces);
	}
	
	
	/**
	 * Crée un jeu
	 * @param 
	 */
	public Jeu creerJeu() {
		return new Jeu();
	}
}

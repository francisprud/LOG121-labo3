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
				   
Nom du fichier : Joueur.java
Date de création : 2017-02-23
Date de dernière modification : 2017-02-
********************************************************************************
Historique des modifications
********************************************************************************
2017-02-23 Version initiale
2017-02-
2017-02-
2017-02-
2017-02-
2017-02-
*******************************************************************************/

/**
 * Cette classe...
 */
public class Joueur implements Comparable<Joueur> {

	/********************
	 * ATTRIBUTS
	 ********************/
	// Le nom du joueur
	private String nom;
	// Le score du joueur, par défaut à 0
	private int score = 0;
	
	
	
	
	/********************
	 * CONSTRUCTEURS
	 ********************/
	/**
	 * Constructeur par défaut
	 */
	public Joueur() {}
	
	
	/**
	 * Constructeur par copie d'attribut
	 */
	public Joueur(String nom) {
		this.nom = nom;
	}
	
	
	/**
	 * Constructeur par copie d'attributs
	 */
	public Joueur(String nom, int score) {
		this.nom = nom;
		this.score = score;
	}
	
	
	
	
	/********************
	 * ACCESSEURS
	 ********************/
	/**
	 * Accesseur pour nom
	 * @return nom le nom du joueur actuel
	 */
	public String getNom() {
		return nom;
	}
	
	
	/**
	 * Accesseur pour score
	 * @return score le score du joueur actuel
	 */
	public int getScore() {
		return score;
	}
	
	
	
	
	/********************
	 * MUTATEURS
	 ********************/
	/**
	 * Modifier le nom d'un joueur
	 * @param nom le nouveau nom du joueur
	 */
	public void setNom(String nom) {
		this.nom = nom;
	
	
	/**
	 * Modifier le score d'un joueur
	 * @resultat le nouveau score du joueur
	 */
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	/********************
	 * AUTRES MÉTHODES
	 ********************/
	/**
	 * Compare le score de 2 joueurs
	 * @param joueur le 2e joueur
	 * @return -1 si le score du 1er joueur est inférieur au 2e
	 * 			0 si leurs scores sont égaux
	 * 			1 si le score du 1er joueur est supérieur au 2e 
	 */
	public int compareTo(Joueur joueur) {
		if(this.score < joueur.score) {
			return -1;
		}
		else if(this.score == joueur.score) {
			return 0;
		}
		else {
			return 1;
		}
	}
}

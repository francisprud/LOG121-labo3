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
				   
Nom du fichier : CollectionJoueurs.java
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
public class CollectionJoueurs {

	/********************
	 * ATTRIBUTS
	 ********************/
	// Le tableau de joueurs
	private Joueur[] joueurs;
	// L'indice dans le tableau de joueurs
	private int indice;
	
	
	
	
	/********************
	 * CONSTRUCTEURS
	 ********************/
	/**
	 * Constructeur par défaut
	 */
	public CollectionJoueurs() {}
	
	
	/**
	 * Constructeur par copie d'attributs
	 * @param joueurs le nouveau tableau de joueurs
	 */
	public CollectionJoueurs(Joueur[] joueurs) {
		this.joueurs = joueurs;
		indice = 0;
	}
	
	
	/**
	 * Constructeur par copie d'objet
	 * @param collectionJoueurs la nouvelle collection de joueurs
	 */
	public CollectionJoueurs(CollectionJoueurs collectionJoueurs) {
		this.joueurs = collectionJoueurs.joueurs;
		indice = 0;
	}
	
	
	
	
	/********************
	 * ACCESSEURS
	 ********************/
	/**
	 * Accesseur pour joueurs
	 * @return joueurs le tableau de joueurs actuel
	 */
	public Joueur[] getJoueurs() {
		return joueurs;
	}
	
	
	/**
	 * Accesseur pour indice
	 * @return indice l'indice actuel du tableau de dés
	 */
	public int getIndice() {
		return indice;
	}
	
	
	
	
	/********************
	 * MUTATEURS
	 ********************/
	/**
	 * Modifie le tableau de joueurs
	 * @param des le nouveau tableau de joueurs
	 */
	public void setJoueurs(Joueur[] joueurs) {
		this.joueurs = joueurs;
	}
	
	
	/**
	 * Modifie l'indice
	 * @param indice le nouvel indice
	 */
	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	
	
	
	/********************
	 * AUTRES MÉTHODES
	 ********************/
	/**
	 * Ajoute un joueur à la collection de joueurs
	 */
	public void add(Joueur joueur) {
		joueurs[indice] = joueur;
		indice++;
	}
	
	
	/**
	 * Vide la collection de tous ses joueurs
	 */
	public void clear() {
		for(int i = 0; i < joueurs.length; i++) {
			joueurs[i] = null;
		}
		indice = 0;
	}
	
	
	/**
	 * Retourne le joueur d'une collection de joueurs à l'indice précisé
	 * @indice l'indice dans la collection (de 0 à n)
	 */
	public Joueur get(int indice) {
		return joueurs[indice];
	}
	
	
	/**
	 * Retire un joueur de la collection de joueurs
	 * @indice l'indice du joueur à retirer
	 */
	public void remove(int indice) {
		/**
		 * CODE EMPRUNTÉ :
		 * 
		 * Les lignes suivantes sont basées sur un exemple vu en classe LOG121
		 * lors du cours sur le patron itérateur.
		 */
		Joueur[] tempJoueurs = new Joueur[joueurs.length - 1];
		for(int i = 0, z = 0; i < joueurs.length; i++) {
			if(i != indice) {
				tempJoueurs[z++] = joueurs[i];
			}
		}
		joueurs = tempJoueurs;
		/**
		 * FIN DU CODE EMPRUNTÉ
		 */
	}
	
	
	/**
	 * Retourne la taille de cette collection de joueurs
	 * @return la taille de cette collection de joueurs
	 */
	public int size() {
		return joueurs.length;
	}
	
	
	/**
	 * Crée un itérateur pour la collection de joueurs actuelle
	 * @return l'itérateur pour la collection de joueurs actuelle
	 */
	public IterateurCollectionJoueurs iterator() {
		return new IterateurCollectionJoueurs(this);
	}
}

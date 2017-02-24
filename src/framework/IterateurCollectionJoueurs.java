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
				   
Nom du fichier : IterateurCollectionJoueurs.java
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
public class IterateurCollectionJoueurs implements Iterator<Joueur> {
	
	/********************
	 * ATTRIBUTS
	 ********************/
	// La collection de joueurs
	private CollectionJoueurs collectionJoueurs;
	// La position actuelle d'itération
	private int position;
	
	
	
	
	/********************
	 * CONSTRUCTEURS
	 ********************/
	/**
	 * Constructeur par copie d'attributs
	 * Remarque : position est à 0 parce qu'on itère toujours à partir du début
	 * 			  de la collection.
	 * @param collectionJoueurs la collection de joueurs actuelle
	 */
	public IterateurCollectionJoueurs(CollectionJoueurs collectionJoueurs) {
		this.collectionJoueurs = collectionJoueurs;
		position = 0;
	}
	
	
	
	
	/********************
	 * AUTRES MÉTHODES
	 ********************/
	/**
	 * Retourne vrai s'i y a un joueur suivant, faux sinon
	 * @return true s'il y a un joueur suivant
	 * @return false s'il n'y a pas de joueur suivant
	 */
	public boolean hasNext() {
		if(position < collectionJoueurs.size() &&
				collectionJoueurs.get(position) != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/**
	 * Retourne le prochain joueur
	 * @return le prochain joueur
	 */
	public Joueur next() {
		return collectionJoueurs.get(position++);
	}
	
	
	/**
	 * Retire le joueur actuel
	 */
	public void remove() {
		// À cause du next() qui incrémente position de 1
		--position;
		collectionJoueurs.remove(position);
	}
}

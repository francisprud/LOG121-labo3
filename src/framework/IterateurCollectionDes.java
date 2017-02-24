package framework;

import java.util.Iterator;

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
				   
Nom du fichier : IterateurCollectionDes.java
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
public class IterateurCollectionDes implements Iterator<De> {

	/********************
	 * ATTRIBUTS
	 ********************/
	// La collection de dés
	private CollectionDes collectionDes;
	// La position actuelle d'itération
	private int position;
	
	
	
	
	/********************
	 * CONSTRUCTEURS
	 ********************/
	/**
	 * Constructeur par copie d'attributs
	 * Remarque : position est à 0 parce qu'on itère toujours à partir du début
	 * 			  de la collection.
	 * @param collectionDes la collection de dés actuelle
	 */
	public IterateurCollectionDes(CollectionDes collectionDes) {
		this.collectionDes = collectionDes;
		position = 0;
	}
	
	
	
	
	/********************
	 * AUTRES MÉTHODES
	 ********************/
	/**
	 * Retourne vrai s'i y a un dé suivant, faux sinon
	 * @return true s'il y a un dé suivant
	 * @return false s'il n'y a pas de dé suivant
	 */
	public boolean hasNext() {
		if(position < collectionDes.size() &&
				collectionDes.get(position) != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/**
	 * Retourne le prochain dé
	 * @return le prochain dé
	 */
	public De next() {
		return collectionDes.get(position++);
	}
	
	
	/**
	 * Retire le dé actuel
	 */
	public void remove() {
		// À cause du next() qui incrémente position de 1
		--position;
		collectionDes.remove(position);
	}
}
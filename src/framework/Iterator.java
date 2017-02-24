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
				   
Nom du fichier : Iterator.java
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
public interface Iterator<E> {

	/**
	 * Retourne vrai s'il y a un élément suivant, faux sinon
	 * @return vrai s'il y a un élément suivant
	 * @return faux s'il n'y a pas d'élément suivant
	 */
	public boolean hasNext();
	
	
	/**
	 * Retour l'élément suivant
	 * @return l'élément suivant
	 */
	public E next();
	
	
	/**
	 * Retire l'élément courant
	 */
	public void remove();
}

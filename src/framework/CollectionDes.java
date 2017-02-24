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
				   
Nom du fichier : CollectionDes.java
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
public class CollectionDes {

	/********************
	 * ATTRIBUTS
	 ********************/
	// Le tableau de dés
	private De[] des;
	// L'indice dans le tableau de dés
	private int indice;
	
	
	
	
	/********************
	 * CONSTRUCTEURS
	 ********************/
	/**
	 * Constructeur par défaut
	 */
	public CollectionDes() {}
	
	
	/**
	 * Constructeur par copie d'attributs
	 * @param des le nouveau tableau de dés
	 */
	public CollectionDes(De[] des) {
		this.des = des;
		indice = 0;
	}
	
	
	/**
	 * Constructeur par copie d'objet
	 * @param collectionDes la nouvelle collection de dés
	 */
	public CollectionDes(CollectionDes collectionDes) {
		this.des = collectionDes.des;
		indice = 0;
	}
	
	
	
	
	/********************
	 * ACCESSEURS
	 ********************/
	/**
	 * Accesseur pour des
	 * @return des le tableau de dés actuel
	 */
	public De[] getTableauDes() {
		return des;
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
	 * Modifie le tableau de dés
	 * @param des le nouveau tableau de dés
	 */
	public void setDes(De[] des) {
		this.des = des;
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
	 * Ajoute un dé à la collection de dés
	 */
	public void add(De de) {
		des[indice] = de;
		indice++;
	}
	
	
	/**
	 * Vide la collection de tous ses dés
	 */
	public void clear() {
		for(int i = 0; i < des.length; i++) {
			des[i] = null;
		}
		indice = 0;
	}
	
	
	/**
	 * Retourne le dé d'une collection de dés à l'indice précisé
	 * @indice l'indice dans la collection (de 0 à n)
	 */
	public De get(int indice) {
		return des[indice];
	}
	
	
	/**
	 * Retire un dé de la collection de dés
	 * @indice l'indice du dé à retirer
	 */
	public void remove(int indice) {
		/**
		 * CODE EMPRUNTÉ :
		 * 
		 * Les lignes suivantes sont basées sur un exemple vu en classe LOG121
		 * lors du cours sur le patron itérateur.
		 */
		De[] tempDes = new De[des.length - 1];
		for(int i = 0, z = 0; i < des.length; i++) {
			if(i != indice) {
				tempDes[z++] = des[i];
			}
		}
		des = tempDes;
		/**
		 * FIN DU CODE EMPRUNTÉ
		 */
	}
	
	
	/**
	 * Retourne le nombre de cases de cette collection de dés
	 * @return le nombre de cases de cette collection de dés
	 */
	public int size() {
		return des.length;
	}
	
	
	/**
	 * Crée un itérateur pour la collection de dés actuelle
	 * @return l'itérateur pour la collection de dés actuelle
	 */
	public IterateurCollectionDes iterator() {
		return new IterateurCollectionDes(this);
	}
}
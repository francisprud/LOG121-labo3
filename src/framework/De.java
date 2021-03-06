package framework;

import java.util.Random;

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
				   
Nom du fichier : De.java
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
public class De implements Comparable<De> {

	/********************
	 * ATTRIBUTS
	 ********************/
	// Le nombre de faces d'un dé
	private int nbFaces;
	// Ne sert qu'à générer aléatoirement un entier suite à un lancer de dé
	private Random random = new Random();
	// Le résultat d'un lancer de dé
	private int resultat;
	
	
	
	
	/********************
	 * CONSTRUCTEURS
	 ********************/
	/**
	 * Constructeur par défaut
	 */
	public De() {}
	
	
	/**
	 * Constructeur par copie d'attribut
	 */
	public De(int nbFaces) {
		this.nbFaces = nbFaces;
		resultat = lancerDe();
	}
	
	
	/**
	 * Constructeur par copie d'attributs
	 */
	public De(int nbFaces, int resultat) {
		this.nbFaces = nbFaces;
		this.resultat = resultat;
	}
	
	
	
	
	/********************
	 * ACCESSEURS
	 ********************/
	/**
	 * Accesseur pour nbFaces
	 * @return nbFaces nombre de faces du dé actuel
	 */
	public int getNbFaces() {
		return nbFaces;
	}
	
	
	/**
	 * Accesseur pour resultat
	 * @return resultat le résultat du lancer de dé actuel
	 */
	public int getResultat() {
		return resultat;
	}
	
	
	
	
	/********************
	 * MUTATEURS
	 ********************/
	/**
	 * Modifier le nombre de faces d'un dé
	 * @param nbFaces le nouveau nombre de faces du dé
	 */
	public void setNbFaces(int nbFaces) {
		this.nbFaces = nbFaces;
	}
	
	
	/**
	 * Modifier le résultat d'un lancer
	 * @resultat le nouveau résultat du lancer de dé
	 */
	public void setResultat(int resultat) {
		this.resultat = resultat;
	}
	
	
	
	
	/********************
	 * AUTRES MÉTHODES
	 ********************/
	/**
	 * Compare le résultat de 2 dés
	 * @param de le 2e dé
	 * @return -1 si le résultat du 1er dé est inférieur au 2e
	 * 			0 si les résultats sont égaux
	 * 			1 si le résultat du 1er dé est supérieur au 2e 
	 */
	public int compareTo(De de) {
		if(this.resultat < de.resultat) {
			return -1;
		}
		else if(this.resultat == de.resultat) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	
	/**
	 * Retourne le résultat d'un lancer de dé
	 * Remarque : il est assumé que n'importe quel dé comporte des valeurs entières
	 * 			  allant de 1 à nbFaces
	 */
	public int lancerDe() {
		return random.ints(1, this.nbFaces+1).findFirst().getAsInt();
	}
}

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
				   
Nom du fichier : Comparable.java
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
public interface Comparable<T> {
	
	/**
	 * 
	 * @param t le 2e élément à comparer au 1er
	 * @return -1 si le 1e 1er élément est plus petit que le 2e
	 * @return	0 si les 2 éléments sont égaux
	 * @return	1 si le 1er élément est plus grand que le 2e
	 */
	public int compareTo(T t);
}

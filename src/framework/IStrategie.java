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
				   
Nom du fichier : IStrategie.java
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
public interface IStrategie {

	/**
	 * La méthode de calcul du score après chaque tour à être implémentée 
	 */
	public int calculerScoreTour(Jeu jeu);
	
	
	/**
	 * La méthode de calcul du vainqueur d'une partie à être implémentée
	 */
	public int calculerLeVainqueur(Jeu jeu);
}

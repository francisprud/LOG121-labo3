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
				   
Nom du fichier : Strategie.java
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
public class Strategie {

	/********************
	 * ATTRIBUTS
	 ********************/
	/**
	 * L'interface de toutes les stratégies de calculs du score par tour et du
	 * vainqueur d'une partie
	 */
	private IStrategie iStrategie;
	
	
	
	
	/********************
	 * CONSTRUCTEURS
	 ********************/
	/**
	 * Constructeur par défaut
	 */
	public Strategie() {}
	
	
	/**
	 * Constructeur par copie d'attribut
	 */
	public Strategie(IStrategie iStrategie) {
		this.iStrategie = iStrategie;
	}
	
	
	
	
	/********************
	 * AUTRES MÉTHODES
	 ********************/
	/**
	 * Modifie la stratégie de calculs
	 */
	public void setStrategie(IStrategie iStrategie) {
		this.iStrategie = iStrategie;
	}
	
	
	/**
	 * Exécute la stratégie de calculs spécifiée
	 */
	public void executerStrategie(Jeu jeu) {
		System.out.println(iStrategie.calculerScoreTour(jeu));
		System.out.println(iStrategie.calculerLeVainqueur(jeu));
	}
}
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
public class StrategieC {

	/**
	 * La seule instance de StrategieC. Cela évite que quelqu'un implémente
	 * plusieurs stratégies de calculs contradictoires durant la même partie
	 * et ne vienne jouer dans cette classe.
	 */
	private static final StrategieC INSTANCE = new StrategieC();
	
	
	
	
	/********************
	 * ATTRIBUTS
	 ********************/
	/**
	 * L'interface de toutes les stratégies de calculs du score par tour et du
	 * vainqueur d'une partie
	 */
	private StrategieI strategieI;
	
	
	
	
	/********************
	 * CONSTRUCTEURS
	 ********************/
	/**
	 * Constructeur par défaut
	 */
	private StrategieC() {}
	
	
	
	
	/********************
	 * AUTRES MÉTHODES
	 ********************/
	/**
	 * Accède à la seule instance de StrategieC
	 * @return INSTANCE la seule instance de StrategieC
	 */
	public static StrategieC getInstance() {
		return INSTANCE;
	}
	
	
	/**
	 * Modifie la stratégie de calculs
	 */
	public void setStrategie(StrategieI strategieI) {
		this.strategieI = strategieI;
	}
	
	
	/**
	 * 
	 */
	public int calculerScoreTour(Jeu jeu) {
		return strategieI.calculerScoreTour(jeu);
	}
	
	
	/**
	 * 
	 */
	public int calculerLeVainqueur(Jeu jeu) {
		return strategieI.calculerLeVainqueur(jeu);
	}
}
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
				   
Nom du fichier : Jeu.java
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
public class Jeu {

	/********************
	 * ATTRIBUTS 
	 ********************/
	// Le nombre de joueurs pour une partie
	private int nbJoueurs;
	// Le nombre de dés par joueur
	private int nbDes;
	// Le nombre de faces par dé
	private int nbFaces;
	// Le total d'un lancer de dés par un joueur
	private int scoreDes;
	// Le tour actuel, débute par défaut au 1er tour
	private int tourActuel = 1;
	// Le nombre de tours maximal durant la partie en cours, par défaut à 1
	private int nbToursMax = 1;
	// La stratégie de calculs du score par tour et du vainqueur
	private StrategieC strategieC = StrategieC.getInstance();
	
	
	
	
	/********************
	 * CONSTRUCTEURS
	 ********************/
	/**
	 * Constructeur par défaut
	 */
	public Jeu() {}
	
	
	/**
	 * Constructeur par copie d'attributs
	 * @param nbJoueurs
	 * @param nbDes
	 * @param nbFaces
	 */
	public Jeu(int nbJoueurs, int nbDes, int nbFaces) {
		this.nbJoueurs = nbJoueurs;
		this.nbDes = nbDes;
		this.nbFaces = nbFaces;
	}
	
	
	
	
	/********************
	 * ACCESSEURS
	 ********************/
	/**
	 * 
	 * @return nbJoueurs 
	 */
	public int getNbJoueurs() {
		return nbJoueurs;
	}
	
	
	/**
	 * 
	 * @return nbDes 
	 */
	public int getNbDes() {
		return nbDes;
	}
	
	
	/**
	 * 
	 * @return nbFaces 
	 */
	public int getNbFaces() {
		return nbFaces;
	}
	
	
	/**
	 * 
	 * @return scoreDes 
	 */
	public int getScoreDes() {
		return scoreDes;
	}
	
	
	/**
	 * 
	 * @return tourActuel
	 */
	public int getTourActuel() {
		return tourActuel;
	}
	
	
	/**
	 * 
	 * @return nbToursMax 
	 */
	public int getNbToursMax() {
		return nbToursMax;
	}
	
	
	/**
	 * 
	 * @return strategieC 
	 */
	public StrategieC getStrategieC() {
		return strategieC;
	}
	
	
	
	
	/********************
	 * MUTATEURS
	 ********************/
	/**
	 * 
	 * @param nbJoueurs 
	 */
	public void setNbJoueurs(int nbJoueurs) {
		this.nbJoueurs = nbJoueurs;
	}
	
	
	/**
	 * 
	 * @param nbDes 
	 */
	public void setNbDes(int nbDes) {
		this.nbDes = nbDes;
	}
	
	
	/**
	 * 
	 * @param nbFaces 
	 */
	public void setNbFaces(int nbFaces) {
		this.nbFaces = nbFaces;
	}
	
	
	/**
	 * 
	 * @param scoreDes 
	 */
	public void setScoreDes(int scoreDes) {
		this.scoreDes = scoreDes;
	}
	
	
	/**
	 * 
	 * @param tourActuel
	 */
	public void setTourActuel(int tourActuel) {
		this.tourActuel = tourActuel;
	}
	
	
	/**
	 * 
	 * @param nbToursMax  
	 */
	public void setNbToursMax(int nbToursMax) {
		this.nbToursMax = nbToursMax;
	}
	
	
	/**
	 * 
	 * @param strategieC
	 */
	public void setStrategieC(StrategieC strategieC) {
		this.strategieC = strategieC;
	}
	
	
	
	
	/********************
	 * AUTRES MÉTHODES
	 ********************/
	/**
	 * 
	 */
	
	
	
	/**
	 * 
	 */
	public int calculerScoreTour() {
		return strategieC.calculerScoreTour(this);
	}
	
	
	/**
	 * 
	 */
	public int calculerLeVainqueur() {
		return strategieC.calculerLeVainqueur(this);
	}
}

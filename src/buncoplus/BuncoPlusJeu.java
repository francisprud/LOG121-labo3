package buncoplus;

import framework.*;

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
				   
Nom du fichier : BuncoPlusJeu.java
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
public class BuncoPlusJeu extends Jeu {
	 
	public BuncoPlusJeu() {
		getStrategieC().setStrategie(new BuncoPlusStrategie());
		System.out.println(this.calculerScoreTour());
		System.out.println(this.calculerLeVainqueur());
	}
	
}

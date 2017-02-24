package buncoplus;

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
				   
Nom du fichier : BuncoPlusDemarrer.java
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
public class BuncoPlusDemarrer {

	public static void main(String[] args) {
		
		BuncoPlusJeu buncoPlusJeu = new BuncoPlusJeu();
		System.out.println(buncoPlusJeu.calculerScoreTour());
		System.out.println(buncoPlusJeu.calculerLeVainqueur());
	}

}

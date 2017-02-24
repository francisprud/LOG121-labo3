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
				   
Nom du fichier : Tests.java
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
 * Cette classe ne sert qu'à des fins de tests
 */
public class Tests {

	public static void main(String[] args){
		
		/**
		 * Tests CONCLUANTS pour CollectionJoueurs
		 */
		/*Joueur Adele = new Joueur("Adele", 40);
		Joueur Brandon = new Joueur("Brandon", 10);
		Joueur Chris = new Joueur("Chris", 50);
		Joueur Daniel = new Joueur("Daniel", 30);
		Joueur Ezekiel = new Joueur("Ezekiel", 40);
		Joueur[] joueursABCDE = {Adele, Brandon, Chris, Daniel, Ezekiel};
		CollectionJoueurs collectionJoueursABCDE = new CollectionJoueurs(joueursABCDE);
		IterateurCollectionJoueurs itJoueur = collectionJoueursABCDE.iterator();
		System.out.println("Contenu de collectionJoueursABCDE, nom :");
		while(itJoueur.hasNext()) {
			System.out.println(itJoueur.next().getNom());
		}
		itJoueur = collectionJoueursABCDE.iterator();
		System.out.println("Taille de collectionJoueursABCDE : " +
				collectionJoueursABCDE.size());
		itJoueur = collectionJoueursABCDE.iterator();
		System.out.println("Adele.compareTo(Ezekiel) : " +
				collectionJoueursABCDE.get(0).compareTo(collectionJoueursABCDE.get(4)));
		System.out.println("Adele.compareTo(Brandon) : " +
				collectionJoueursABCDE.get(0).compareTo(collectionJoueursABCDE.get(1)));
		System.out.println("Adele.compareTo(Chris) : " +
				collectionJoueursABCDE.get(0).compareTo(collectionJoueursABCDE.get(2)));
		itJoueur = collectionJoueursABCDE.iterator();
		System.out.println("Contenu de collectionJoueursABCDE, score :");
		while(itJoueur.hasNext()) {
			System.out.println(itJoueur.next().getScore());
		}
		itJoueur = collectionJoueursABCDE.iterator();
		System.out.println("Remove Brandon & Daniel");
		while(itJoueur.hasNext()) {
			if(itJoueur.next().getNom().compareTo("Brandon") == 0) {
				itJoueur.remove();
			}
		}
		itJoueur = collectionJoueursABCDE.iterator();
		System.out.println("Contenu de collectionJoueursABCDE MODIFIÉ, nom :");
		while(itJoueur.hasNext()) {
			System.out.println(itJoueur.next().getNom());
		}
		itJoueur = collectionJoueursABCDE.iterator();
		System.out.println("Taille de collectionJoueursABCDE : " +
				collectionJoueursABCDE.size());
		System.out.println("----------------------------------------");*/
		
		
		
		
		/**
		 * Tests CONCLUANTS pour CollectionDes
		 */
		/*De de1 = new De(20, 11);
		De de2 = new De(20, 6);
		De de3 = new De(20, 19);
		De[] des123 = {de1, de2, de3};
		CollectionDes collectionDes123 = new CollectionDes(des123);
		IterateurCollectionDes itDe = collectionDes123.iterator();
		System.out.println("Contenu de collectionDes123, nbFaces :");
		while(itDe.hasNext()) {
			System.out.println(itDe.next().getNbFaces());
		}
		itDe = collectionDes123.iterator();
		System.out.println("Taille de collectionDes123 : " +
				collectionDes123.size());
		itDe = collectionDes123.iterator();
		System.out.println("De1.compareTo(De2) : " +
				collectionDes123.get(0).compareTo(collectionDes123.get(1)));
		System.out.println("De1.compareTo(De3) : " +
				collectionDes123.get(0).compareTo(collectionDes123.get(2)));
		itDe = collectionDes123.iterator();
		System.out.println("Contenu de collectionDes123, score :");
		while(itDe.hasNext()) {
			System.out.println(itDe.next().getResultat());
		}
		itDe = collectionDes123.iterator();
		System.out.println("Remove 6");
		while(itDe.hasNext()) {
			if(itDe.next().getResultat() == 6) {
				itDe.remove();
			}
		}
		itDe = collectionDes123.iterator();
		System.out.println("Contenu de collectionDes123 MODIFIÉ, resultat :");
		while(itDe.hasNext()) {
			System.out.println(itDe.next().getResultat());
		}
		itDe = collectionDes123.iterator();
		System.out.println("Taille de collectionDes123 : " +
				collectionDes123.size());
		System.out.println("----------------------------------------");*/
		
		
		
		
		/**
		 * Tests CONCLUANTS pour Jeu, Strategie, IStrategie
		 */
		/*Jeu jeu = new Jeu();
		// Supposé afficher 12345 et 67890
		System.out.println("jeu.calculerScoreTour() : " +
				jeu.calculerScoreTour());
		System.out.println("jeu.calculerLeVainqueur() : " +
				jeu.calculerLeVainqueur());
		Strategie strategie = new Strategie();
		strategie.setStrategie(new StrategieTest1());
		// Supposé afficher 1 et 111
		strategie.executerStrategie(jeu);
		strategie.setStrategie(new StrategieTest2());
		// Supposé afficher 2 et 222
		strategie.executerStrategie(jeu);
		System.out.println("----------------------------------------");*/
		
		
		
		
		/**
		 * Tests CONCLUANTS pour Random
		 */
		/*Random random = new Random();
		// Affiche un entier de 1 à 6
		System.out.println("random.ints(1,6+1) : " +
				random.ints(1, 6+1).findFirst().getAsInt());
		De de10Faces = new De(10);
		System.out.println("de10Faces.getResultat() : " +
				de10Faces.getResultat());*/
		
		
		
		
		/**
		 * Tests pour...
		 */
		
	}
}

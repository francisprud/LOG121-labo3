package framework;

public class Tests {

	public static void main(String[] args){
		
		/**
		 * Tests CONCLUANTS pour CollectionJoueurs
		 */
		Joueur Adele = new Joueur("Adele", 40);
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
		System.out.println("----------------------------------------");
		
		
		
		
		/**
		 * Tests CONCLUANTS pour CollectionDes
		 */
		De de1 = new De(20, 11);
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
		System.out.println("----------------------------------------");
		
		
		
		
		/**
		 * Tests CONCLUANTS pour Jeu, Strategie, IStrategie
		 */
		Jeu jeu = new Jeu();
		// Supposé afficher 12345 et 67890
		System.out.println("jeu.calculerScoreTour() : " +
				jeu.calculerScoreTour());
		System.out.println("jeu.calculerLeVainqueur() : " +
				jeu.calculerLeVainqueur());
		Strategie strategie = new Strategie();
		strategie.setStrategie(new StrategieBuncoPlus());
		// Supposé afficher 1 et 111
		strategie.executerStrategie(jeu);
		strategie.setStrategie(new StrategieTest());
		// Supposé afficher 9 et 999
		strategie.executerStrategie(jeu);
		System.out.println("----------------------------------------");
		
		
		
		
		/**
		 * Tests pour...
		 */
	}
}

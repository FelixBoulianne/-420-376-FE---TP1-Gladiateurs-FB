package jeugladiateurs;

import combat.CompteurDeTour;
import combat.AffichageEcran;
import personnages.Mirmillon;
import personnages.Retiaire;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    
    Mirmillon personnage1 = new Mirmillon("Bob le malchanceux", 70, 15, 15, 15);
    Retiaire personnage2 = new Retiaire("Igor l'empaleur", 100, 25, 5, 30);
    
    
            
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
    // TODO : Afficher les infos de chaque personnage
    personnage1.afficherInfosPersonnage();
    personnage2.afficherInfosPersonnage();
    // TODO : Afficher le message du début du combat
    affichage.afficherDebutCombat();
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
    // TODO : La boucle contenant les étapes du combat
    
        do {
             tour.afficheTour();
    
        for (int i = 0; i <= 100; i++) {
            
            if (personnage1.getInitiative() == i && personnage1.getPointsDeVie() > 0) {
                personnage1.frapperPersonnage(personnage2);
                }
           
            
            if (personnage2.getInitiative() == i && personnage2.getPointsDeVie() > 0) {
                personnage2.frapperPersonnage(personnage1);
            }
            
        }
        
            affichage.afficherSeparateurInfosPerso();

            personnage1.afficherInfosPersonnage();

            personnage2.afficherInfosPersonnage();
            
            personnage1.setNewInitiativeRandom();
            
            personnage2.setNewInitiativeRandom();

            tour.augmenteTour();

            affichage.afficherSeparateurDeTour();
      
        } while (personnage1.getPointsDeVie() != 0 && personnage2.getPointsDeVie() != 0);
      
        
    // TODO : Après la boucle, afficher le résultat du combat
    affichage.afficheVictoire(personnage1, personnage2);
    
    // </editor-fold>
    }

}

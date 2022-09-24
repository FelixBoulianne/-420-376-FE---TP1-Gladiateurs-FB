package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Personnage personnage1 = new Personnage();
    Personnage personnage2 = new Personnage();
    
    personnage1.Personnage("Bob le malchanceux", 70, 15, 15, 15);
    personnage2.Personnage("Igor l'empaleur", 100, 25, 5, 30);
            
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
            
            if (personnage1.getInitiative()== i) {
                personnage1.frapperPersonnage(personnage2);
            }
            
            if (personnage2.getInitiative()== i) {
                personnage2.frapperPersonnage(personnage1);
            }
            
        }
        
            affichage.afficherSeparateurInfosPerso();

            personnage1.afficherInfosPersonnage();

            personnage2.afficherInfosPersonnage();

            tour.augmenteTour();

            affichage.afficherSeparateurDeTour();
      
        } while (personnage1.getPointsDeVie() != 0 && personnage2.getPointsDeVie() != 0);
    
      
    // TODO : Après la boucle, afficher le résultat du combat
    // </editor-fold>
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Random;

/**
 *
 * @author ETI
 */
public class Mirmillon extends Personnage {
    
    public String classe;

    
    public Mirmillon(String newName, int pvs, int attaqueMax, int defense, int ini){
    this.nom = newName;
    this.pointsDeVie = pvs;
    this.valeurMaxAttaque = attaqueMax;
    this.valeurDefense = defense;
    this.initiative = ini;
    this.classe = "Mirmillon";
 }
    
    
    @Override
    public void afficherInfosPersonnage(){
        super.afficherInfosPersonnage();
        System.out.println("Classe ? : " + classe);
    }
    
    @Override
        public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
        
        Random rand = new Random();
        int minValue = 0;
        int maxValue = 30;
        int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
        
        setInitiative(nombreAleatoire);
        
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible){
        super.frapperPersonnage(personnageCible);
        
        if (personnageCible.getPointsDeVie() <= 0) {
            System.out.println(nom + " decapite son adversaire.");
        }
        
        else{
                    System.out.println();
                    System.out.println(getNom() + " attaque une deuxieme fois " + personnageCible.getNom());
                    System.out.println();
                    super.frapperPersonnage(personnageCible);
                
    }
}
}         
    


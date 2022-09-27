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
public class Retiaire extends Personnage {
    
    public String classe;
    private Boolean filet;

    public Retiaire(String newName, int pvs, int attaqueMax, int defense, int ini){
    this.nom = newName;
    this.pointsDeVie = pvs;
    this.valeurMaxAttaque = attaqueMax;
    this.valeurDefense = defense;
    this.initiative = ini;
    this.classe = "Retiaire";
    this.filet = false;
 }
    
    
    @Override
    public void afficherInfosPersonnage(){
        super.afficherInfosPersonnage();
        System.out.println("Classe : " + classe);
    }
    
    
    @Override
    public void frapperPersonnage(Personnage personnageCible){
        if (filet) {
            filet = false;
            System.out.println(this.getNom() + " recupere son filet et en profite pour attaquer");
            super.frapperPersonnage(personnageCible);
        }
        
        else{
            filet = true;
            
            System.out.println();
            System.out.println(nom + " lance son filet");
            
            Random rand = new Random();
            int minValue = 0;
            int maxValue = 100;
            int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
            
            if (nombreAleatoire <= 10) {
                System.out.println();
                System.out.println("Son filet attrape " + personnageCible.getNom() + " et il l'empale sauvagement avec sa lance");
                personnageCible.setPointsDeVie(0);
             }
        
            else{
               System.out.println();
               System.out.println("Le filet n'atteint pas sa cible");
            }
        }
    }
}

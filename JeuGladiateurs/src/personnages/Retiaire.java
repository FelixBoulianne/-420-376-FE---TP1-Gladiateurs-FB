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
    
    public void Retiaire(){
    classe = "Retiaire";
    maxIni = 100;
    filet = true;
    success = false;
    
 }
    
    public void success(){
        
        Random rand = new Random();
        int minValue = 0;
        int maxValue = 100 + 1;
        int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
        
        if (nombreAleatoire <= 10) {
            success = true;
        }
        
        else{
            success = false;
        }

    }
    
    public void afficheLancerFilet(){
       System.out.println();
       System.out.println(nom + " lance son filet."); 
}
    
    public void afficheLancerReussi(Personnage personnageCible){
       System.out.println();
       System.out.println("Son filet attrape " + personnageCible.getNom() + " et il l'empale sauvagement avec sa lance.");
       personnageCible.setPointsDeVie(0);
}
    
    public void afficheLancerRate(){
       System.out.println();
       System.out.println("Le filet n'atteint pas sa cible.");
       filet = false;
}
   
}

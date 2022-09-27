package personnages;

import java.util.Random;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // TODO : Mettre vos attributs ici
    protected String nom;
    protected int pointsDeVie;
    protected int valeurMaxAttaque;
    protected int valeurDefense;
    protected int initiative;
    protected int attaque;
    protected int dommages;

    
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">

    public void Personnage(String newName, int pvs, int attaqueMax, int defense, int ini) {
        // TODO : Constructeur AVEC paramètres
        nom = newName;
        pointsDeVie = pvs;
        valeurMaxAttaque = attaqueMax;
        valeurDefense = defense;
        initiative = ini;
    }

    public void Personnage() {
        // TODO : Constructeur SANS paramètres qui initialise à ZÉRO ou à ""
        nom = "";
        pointsDeVie = 0;
        valeurMaxAttaque = 0;
        valeurDefense = 0;
        initiative = 0;
        attaque = 0;
        dommages = 0;
    }
    
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Les getters

    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getAttaque() {
        return attaque;
    }

    public int getDommages() {
        return dommages;
    }
    
    // TODO : Les setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public void setDommages(int dommages) {
        this.dommages = dommages;
    }

    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
        String statut;
        
        if (pointsDeVie <= 0) {
   
    statut = "Mort";
    
}
        else{
    
    statut = "Vivant";
}
        System.out.println();
        System.out.println("Nom : " + nom);
        System.out.println("Attaque : " + valeurMaxAttaque);
        System.out.println("Defense : " + valeurDefense);
        System.out.println("Points de vie : " + pointsDeVie);
        System.out.println("Initiative ? : " + initiative);
        System.out.println("Statut ? : " + statut);
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        
        Random rand = new Random();
        int minValue = 0;
        int maxValue = valeurMaxAttaque + 1;
        int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
       
        return nombreAleatoire;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
        
        attaque = attaqueCalcul();
        
        dommages = attaque - personnageCible.getValeurDefense();
        
        dommages = dommages >= 0 ? dommages : 0;
        
        personnageCible.setPointsDeVie(personnageCible.getPointsDeVie() - this.dommages);
        
        if (personnageCible.getPointsDeVie() <= 0) {
            
            personnageCible.setPointsDeVie(0);
            
        }
        
            System.out.println();
            System.out.println(nom + " attaque avec une puissance de: " + attaque);
            System.out.println(personnageCible.getNom() + " a une defense de: " + personnageCible.getValeurDefense());
            System.out.println("Les dommages sont donc de: " + dommages);
            System.out.println();
            

            
        
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
        
        Random rand = new Random();
        int minValue = 0;
        int maxValue = 100;
        int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
        
        setInitiative(nombreAleatoire);
        
    }
    
}
    // </editor-fold>
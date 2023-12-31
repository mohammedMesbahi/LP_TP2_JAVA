package Exercice2A_Z;

public class Vendeur extends Employe {
    private double chiffreAffaire;
    public static final double POURCENT_VENDEUR = 0.2;
    public static final double BONUS_VENDEUR = 670;

    public Vendeur(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree);
        this.chiffreAffaire = chiffreAffaire;
    }

    /*- Vendeur : 20% du chiffre d'affaires qu'ils réalisent mensuellement, plus 670 DH. Utiliser les
    constantes de classe suivantes : POURCENT_VENDEUR = 0.2 et BONUS_VENDEUR = 670.*/
    @Override
    public double calculerSalaireEmploye() {
        setSalaire(chiffreAffaire * POURCENT_VENDEUR + BONUS_VENDEUR);
        return getSalaire();
    }

    @Override
    public String getTitre() {
        return "Le vendeur ";
    }
}


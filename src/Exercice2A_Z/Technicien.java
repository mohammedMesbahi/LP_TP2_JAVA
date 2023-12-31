package Exercice2A_Z;

public class Technicien extends Employe {
    private int unitesProduites;
    public static final double FACTEUR_UNITE = 5.0;
    public Technicien(String nom, String prenom, int age, String dateEntree, int unitesProduites) {
        super(nom, prenom, age, dateEntree);
        this.unitesProduites = unitesProduites;
    }

    /*- Technicien : nombre d’unités produites mensuellement multiplié par 5.
     Utiliser la constante
de classe FACTEUR_UNITE = 5.0.
*/
    @Override
    public double calculerSalaireEmploye() {
        setSalaire(unitesProduites * FACTEUR_UNITE);
        return getSalaire();
    }
    @Override
    public String getTitre() {
        return "Le technicien ";
    }
}

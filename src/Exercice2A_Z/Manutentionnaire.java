package Exercice2A_Z;

public class Manutentionnaire extends Employe {
    private int heuresTravail;
    public static final double SALAIRE_HORAIRE = 100.00;

    public Manutentionnaire(String nom, String prenom, int age, String dateEntree, int heuresTravail) {
        super(nom, prenom, age, dateEntree);
        this.heuresTravail = heuresTravail;

    }
/*- Manutentionnaire : nombre d’heures de travail mensuel multiplié par 100 DH. Utiliser la constante de classe SALAIRE_HORAIRE = 100.00*/
    @Override
    public double calculerSalaireEmploye() {
        setSalaire(heuresTravail * SALAIRE_HORAIRE);
        return getSalaire();
    }

    @Override
    public String getTitre() {
        return "Le manutentionnaire ";
    }
}

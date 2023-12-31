package Exercice2A_Z;

public abstract class Employe {
    private String nom;
    private String prenom;
    private int age;
    private String dateEntree;
    private double salaire;

    public Employe(String nom, String prenom, int age, String dateEntree) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEntree = dateEntree;
    }

    public String getTitre(){
        return "L'employe ";
    };

    @Override
    public String toString() {
        return getTitre() + " " + prenom + " " + nom;
    }

    public void afficher() {
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Age: " + age);
        System.out.println("Date d'entree: " + dateEntree);
        System.out.println("Salaire: " + salaire);
    }

    public void augmenterSalaire(double pourcentage) {
        salaire += salaire * pourcentage / 100;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    public abstract double calculerSalaireEmploye();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(String dateEntree) {
        this.dateEntree = dateEntree;
    }




}

package exercice2;

public class Utilisateur extends Personne {
    private String login;
    private String password;
    private String service;
    private Profile profile;
    public Utilisateur(String nom, String prenom, String email,String
            telephone, double salaire, String login, String password,String
                               service, Profile profile) {
        super(nom, prenom, email, telephone, salaire);
        this.login = login;
        this.password = password;
        this.service = service;
        this.profile = profile;
    }
    public Profile getProfile() { return profile;}
    public void setProfile(Profile profile) { this.profile = profile;}
    @Override
    public double calculerSalaire(){
        if (this.profile.getCode().equals("MN"))
            this.salaire = this.salaire + (this.salaire * 0.1);
        else if (this.profile.getCode().equals("DG"))
            this.salaire = this.salaire + (this.salaire * 0.4);
        return this.salaire;
    }
    @Override
    public void afficher(){
       super.afficher();
        System.out.println("Salaire: "+this.salaire);
        System.out.println("Login: "+this.login);
        System.out.println("Password: "+this.password);
        System.out.println("Service: "+this.service);
        System.out.println("Profile: "+this.profile.getCode());
    }
}

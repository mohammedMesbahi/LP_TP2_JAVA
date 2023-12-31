package exercice2;

public class Test {
    public static void main(String[] args) {
        Profile profile[] = new Profile[5];
        profile[0] = new Profile("CP", "Chef de projet");
        profile[1] = new Profile("DP", "Directeur de projet");
        profile[2] = new Profile("MN", "Manager");
        profile[3] = new Profile("DRH", "Directeur de ressources humaine");
        profile[4] = new Profile("DG", "Directeur general");
        Utilisateur user[] = new Utilisateur[5];
        user[0] = new Utilisateur("SMI", "Mohamed", "md@gmail.cm", "1234",
                1200.00, "alaoui", "12354", "Sevice des ressources humaines", profile[3]);
        user[1] = new Utilisateur("IGE", "Maoun", "do@gmail.cm", "1234",
                1200.00, "dourid", "12354", "Sevice des ressources humaines", profile[2]);
        user[2] = new Utilisateur("GL", "Youri", "y@gmail.cm", "1234",
                1200.00, "lachgar", "12354", "Manager", profile[1]);
        user[3] = new Utilisateur("LAOUD", "Karima", "l@gmail.cm", "1234",
                1300.00, "laoud", "12354", "manager", profile[2]);
        user[4] = new Utilisateur("SMI", "Emad", "md@gmail.cm", "1234",
                1200.00, "alaoui", "12354", "Sevice des ressources humaines", profile[3]);
        for (Utilisateur p : user) {
            if (p.getProfile().getCode().equals("MN")) p.afficher();
            if (p.getProfile().getCode().equals("DP")) p.afficher();
            if (p.getProfile().getCode().equals("DRH")) p.afficher();
        }
    }
}


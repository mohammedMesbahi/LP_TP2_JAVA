package Exercice2A_Z;

public class Test {
    public static void main(String[] args) {
        Employe[] employes = new Employe[5];
        employes[0] = new Vendeur("SMI", "Mohamed", 25, "12/12/2012", 10000);
        employes[1] = new Manutentionnaire("ALI", "Ahmed", 30, "12/12/2012", 100);
        employes[2] = new Technicien("KARIM", "Karim", 35, "12/12/2012", 1000);
        employes[3] = new Manutentionnaire("KHALID", "Khalid", 40, "12/12/2012", 200);
        employes[4] = new Technicien("HASSAN", "Hassan", 45, "12/12/2012", 2000);
        for (Employe employe : employes) {
            System.out.println(employe);
            System.out.println("Salaire: " + employe.calculerSalaireEmploye());
        }
    }
}

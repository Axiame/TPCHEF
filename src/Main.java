import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Etudiant Paul = new Etudiant(1, "Paul", "Dupont");
        Paul.ajouterNote("Maths", 10);
        Paul.ajouterNote("Français", 12);
        System.out.println(Paul);
        System.out.println(Paul.getMoyenne());
        System.out.println(Paul.getNote("Maths"));
        System.out.println(Paul.toString());
        System.out.println(Paul.afficheBulletin());
        ArrayList

         */
        Etudiant2 Paul = new Etudiant2(1, "Paul", "Dupont");
        Paul.ajouterNote("Maths", 10);
        Paul.ajouterNote("Français", 12);
        Paul.ajouterNote("Français", 15);
        System.out.println(Paul);
        System.out.println((Paul.getNotes("Français")));
        System.out.println(Paul.getMoyenneGeneral());
        System.out.println(Paul.getMoyenne("Français"));
        System.out.println(Paul.afficheBulletin());
    }
}

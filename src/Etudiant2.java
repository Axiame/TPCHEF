import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class Etudiant2 {
    private final int id;
    private String nom;
    private String prenom;
    private HashMap<String, ArrayList<Integer>> notes= new HashMap <>();

    public Etudiant2(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    public ArrayList<Integer> getNotes(String matiere) {
        return notes.get(matiere);
    }
    public void ajouterNote(String matiere, int note) {
        if (notes.containsKey(matiere)) {
            notes.get(matiere).add(note);
        } else {
            ArrayList<Integer> notesMatiere = new ArrayList<>();
            notesMatiere.add(note);
            notes.put(matiere, notesMatiere);
        }

    }
    public String afficheBulletin(){
        return notes.toString();
    }
    public float getMoyenneGeneral() {
        float moyenne = 0;
        float compteur = 0;
        for (ArrayList<Integer> notesMatiere : notes.values()) {
            for (int note : notesMatiere) {
                moyenne += note;
                compteur++;
            }
        }
        return moyenne / compteur;
    }
    public float getMoyenne(String matiere) {
        float moyenne = 0;
        float compteur = 0;
        for (int note : notes.get(matiere)) {
            moyenne += note;
            compteur++;
        }
        return moyenne / compteur;
    }
    public ArrayList<Integer> getNote(String matiere) {
        return notes.get(matiere);
    }


    public int getId() {
        return id;
    }



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
}

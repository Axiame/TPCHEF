import java.util.HashMap;

public class Etudiant {
    private final int id;
    private String nom;
    private String prenom;
    HashMap <String, Integer> notes= new HashMap <String, Integer>();

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    public void ajouterNote(String matiere, int note) {

        notes.put(matiere, note);
    }
    public int getNote(String matiere) {
        return notes.get(matiere);
    }
    public int getMoyenne() {
        int moyenne = 0;
        for (int note : notes.values()) {
            moyenne += note;
        }
        return moyenne / notes.size();
    }
    public String toString() {
        return "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", notes=" + notes +
                '}';
    }
    public String afficheBulletin(){
        return notes.toString();
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

    public HashMap<String, Integer> getNotes() {
        return notes;
    }

    public void setNotes(HashMap<String, Integer> notes) {
        this.notes = notes;
    }
}

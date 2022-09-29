package aliment;

public class Ingredient{
    private int id;
    private String nom;
    private enum categorie{Viande,Epice,Legume,Autre}; //liste défini parmis les 4?
    private boolean bio;
    private int calorie;

    public Ingredient(int id, String nom, boolean bio, int calorie) {
        this.id = id;
        this.nom = nom;
        this.bio = bio;
        this.calorie = calorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isBio() {
        return bio;
    }

    public void setBio(boolean bio) {
        this.bio = bio;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", bio=" + bio +
                ", calorie=" + calorie +
                '}';
    }
}
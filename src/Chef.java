import java.util.ArrayList;
public class Chef extends Personne{
    private ArrayList<String> plat;
    private int etoile;
    private ArrayList<Padawan> padawan;
    private String specialite;

    public Chef(int id, String nom, String prenom, boolean garcon, int age, int telephone, ArrayList<String> plat, int etoile, String specialite) {
        super(id, nom, prenom, garcon, age, telephone);
        this.plat = plat;
        this.etoile = etoile;
        this.specialite = specialite;
    }

    public ArrayList<String> getPlat() {
        return plat;
    }

    public void setPlat(ArrayList<String> plat) {
        this.plat = plat;
    }

    public int getEtoile() {
        return etoile;
    }

    public void setEtoile(int etoile) {
        this.etoile = etoile;
    }

    public ArrayList<Padawan> getPadawan() {
        return padawan;
    }

    public void setPadawan(ArrayList<Padawan> padawan) {
        this.padawan = padawan;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "Chef{" +
                super.toString() +
                "plat=" + plat +
                ", etoile=" + etoile +
                ", specialite='" + specialite + '\'' +
                '}';
    }
}

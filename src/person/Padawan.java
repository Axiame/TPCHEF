package person;

public class Padawan extends Personne {
    private Chef chef;

    public Padawan(int id, String nom, String prenom, boolean garcon, int age, int telephone) {
        super(id, nom, prenom, garcon, age, telephone);
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }


    public String toString() {
        return "Padawan="+ super.toString()+" chef="+chef;
    }
}

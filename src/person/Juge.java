package person;

public class Juge extends Personne{
    private int nombreParticipation;

    public int getNombreParticipation() {
        return nombreParticipation;
    }

    public void setNombreParticipation(int nombreParticipation) {
        this.nombreParticipation = nombreParticipation;
    }

    public Juge(int id, String nom, String prenom, boolean garcon, int age, int telephone) {
        super(id, nom, prenom, garcon, age, telephone);

    }

    @Override
    public String toString() {
        return "Juge{" +
                "nombreParticipation=" + nombreParticipation +
                '}';
    }
}

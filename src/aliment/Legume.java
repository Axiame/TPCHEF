package aliment;

public class Legume extends Ingredient{
    private int fibre;

    public Legume(int id, String nom, boolean bio, int calorie, int fibre) {
        super(id, nom, bio, calorie);
        this.fibre = fibre;
    }

    public int getFibre() {
        return fibre;
    }

    public void setFibre(int fibre) {
        this.fibre = fibre;
    }

    @Override
    public String toString() {
        return "Legume" + super.toString() +
                "fibre=" + fibre +
                '}';
    }
}
package aliment;

public class Epice extends Ingredient{
    public Epice(int id, String nom, boolean bio, int calorie) {
        super(id, nom, bio, calorie);
    }

    @Override
    public String toString() {
        return "Epice =" + super.toString();
    }
}
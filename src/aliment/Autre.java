public class Autre extends Ingredient{
    public Autre(int id, String nom, boolean bio, int calorie) {
        super(id, nom, bio, calorie);
    }

    @Override
    public String toString() {
        return "Autre ="+ super.toString();
    }
}
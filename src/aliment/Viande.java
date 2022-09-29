package aliment;

public class Viande extends Ingredient{
    private int gras;

    public Viande(int id, String nom, boolean bio, int calorie, int gras) {
        super(id, nom, bio, calorie);
        this.gras = gras;
    }

    public int getGras() {
        return gras;
    }

    public void setGras(int gras) {
        this.gras = gras;
    }

    @Override
    public String toString() {
        return "Viande =" + super.toString() +
                "gras=" + gras +
                '}';
    }
}
package aliment;

import java.util.ArrayList;

public class Plat{
    private String nom;
    private ArrayList<Ingredient> ingredient;

    public Plat(String nom, ArrayList<Ingredient> ingredient) {
        this.nom = nom;
        this.ingredient = ingredient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Ingredient> getIngredient() {
        return ingredient;
    }

    public void setIngredient(ArrayList<Ingredient> ingredient) {
        this.ingredient = ingredient;
    }
}

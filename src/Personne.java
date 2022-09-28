public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private boolean garcon;
    private int age;
    private int telephone;

    public Personne(int id, String nom, String prenom, boolean garcon, int age, int telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.garcon = garcon;
        this.age = age;
        this.telephone = telephone;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public boolean isGarcon() {
        return garcon;
    }

    public void setGarcon(boolean garcon) {
        this.garcon = garcon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", garcon=" + garcon +
                ", age=" + age +
                ", telephone=" + telephone +
                '}';
    }
}
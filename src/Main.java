import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Chef c1 = new Chef(1,"Dupont", "Jules",true,23,0707070707, new ArrayList<>(), 4, "patissier");

        Padawan p1 = new Padawan(2,"Clement","Garnier",true,20,601193165);
        Juge j1 = new Juge(3,"Rahoui","Walid",true,19,336090909);
        p1.setChef(c1);
        ArrayList<Padawan> padawansList = new ArrayList<>();
        padawansList.add(p1);
        c1.setPadawan(padawansList);
        Epice e1 = new Epice(4,"Safran",true,15);
        Viande v1 = new Viande(5,"steak",false,150,30);
        System.out.println(v1.toString());
    }
}
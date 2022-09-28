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

        System.out.println(p1.toString());
    }
}
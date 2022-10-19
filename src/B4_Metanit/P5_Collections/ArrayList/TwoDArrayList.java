package B4_Metanit.P5_Collections.ArrayList;

import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> products = new ArrayList<>();

        ArrayList<String> termofillings = new ArrayList<>();
        termofillings.add("capsuna");
        termofillings.add("visina");
        termofillings.add("coacaza neagra");

        ArrayList<String> termogels = new ArrayList<>();
        termogels.add("banana");
        termogels.add("lamiie");
        termogels.add("kiwi");

        ArrayList<String> colato = new ArrayList<>();
        colato.add("alune de padure");
        colato.add("almonds");
        colato.add("orange");

        products.add(termofillings);
        products.add(termogels);
        products.add(colato);

        System.out.println(products.get(0).get(0));
    }
}
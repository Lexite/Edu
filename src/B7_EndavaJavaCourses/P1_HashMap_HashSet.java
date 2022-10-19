package B7_EndavaJavaCourses;

import java.util.*;

public class P1_HashMap_HashSet {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Russia", "Moscow");
        capitalCities.put("China", "Beijing");
        capitalCities.put("USA", "Washington");
        System.out.println(capitalCities);
        capitalCities.get("England");

        HashSet<String> cars = new HashSet<String>();

        ArrayList<String> vehicles = new ArrayList<String>();
        vehicles.add("AUDI");
        vehicles.add("TOYOTA");
        vehicles.add("HONDA");
        vehicles.add("BMW");
        Iterator<String> it = vehicles.iterator();
        System.out.println(it.next());
    }
}

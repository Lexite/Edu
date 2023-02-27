package A1_Programs.V1_DataStructuresAndAlgorithms.P5_Pluralsight_Collections.P0_PluralSight;

public class Product {
    private final String name;
    private final int weight;


    public Product(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public String toString(){
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

}

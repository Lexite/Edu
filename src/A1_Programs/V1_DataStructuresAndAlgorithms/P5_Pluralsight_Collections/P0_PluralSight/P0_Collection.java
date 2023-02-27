package A1_Programs.V1_DataStructuresAndAlgorithms.P5_Pluralsight_Collections.P0_PluralSight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class P0_Collection {

    public static void main(String[] args){
      Product door = new Product("Wooden door", 35);
      Product floorPanel = new Product("Floor panel", 25);
      Product window = new Product("Glass Window",10);
      Product table = new Product("table",15);
      Product flashLight = new Product("flashLight",1);
      Product bookShelve = new Product("bookShelve",5);



        Collection<Product> products = new ArrayList<>();


        products.add(door);
        products.add(floorPanel);
        products.add(window);
        products.add(table);
        products.add(flashLight);
        products.add(bookShelve);


        System.out.println(products);

        System.out.println();

        final Iterator<Product> productIterator = products.iterator();
        while(productIterator.hasNext()) {
            Product product = productIterator.next();
            if (product.getWeight() < 20) {
                System.out.println(product);
            }
            else{
                productIterator.remove();
            }
        }
        System.out.println(products);

        System.out.println();

        for (Product product : products){
            System.out.println(product);
        }


        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(window));
        System.out.println(products.contains(door));

        Collection<Product> otherProducts = new ArrayList<>();
        otherProducts.add(window);
        otherProducts.add(door);

        products.removeAll(otherProducts);

        System.out.println(products );


        Collection<Product> products1 = new ArrayList<>();
        products1.add(bookShelve);
        products1.add(flashLight);

        products.removeAll(products1);



        System.out.println(products);


        for (Product a: products){
            products.remove(a);
        }







    }
}

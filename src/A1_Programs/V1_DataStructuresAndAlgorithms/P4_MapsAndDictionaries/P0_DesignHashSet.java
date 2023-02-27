package A1_Programs.V1_DataStructuresAndAlgorithms.P4_MapsAndDictionaries;

import java.util.*;

public class P0_DesignHashSet {


    public static void main(String[] args) {


        MyHashSet myHashSet = new MyHashSet();

        myHashSet.add(1); 
        myHashSet.contains(1);
        myHashSet.remove(1);







    }




}


class MyHashSet{

    private int numBuckets = 15000;
    List<Integer>[] buckets;

    private int hash_function(int key){
        return key % numBuckets;
    }

    public MyHashSet(){
        buckets = new LinkedList[numBuckets];
    }

    public void add(int key){
        int i = hash_function(key);
        if(buckets[i] == null)
            buckets[i] = new LinkedList<>();
        if(buckets[i].indexOf(key) == -1)
            buckets[i].add(key);


    }

    public void remove(int key){
        int i = hash_function(key);
        if(buckets[i] == null) return;
        if(buckets[i].indexOf(key) != -1) buckets[i].remove(buckets[i].indexOf(key));

    }

    public boolean contains(int key) {
        int i = hash_function(key);
        if(buckets[i] == null || buckets[i].indexOf(key) == -1) return false;
        return true;
    }

}

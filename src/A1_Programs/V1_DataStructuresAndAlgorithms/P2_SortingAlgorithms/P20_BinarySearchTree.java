package A1_Programs.V1_DataStructuresAndAlgorithms.P2_SortingAlgorithms;

import java.util.Random;

public class P20_BinarySearchTree {
    static final int LENGTH = 100;
    public static void main(String[] args) {
        BST tree = new BST();
        Random random = new Random();

        int[] array = new int[LENGTH];

        for (int i = 0; i < array.length; i ++){
            int randomValue = random.nextInt(LENGTH);
            array[i] = randomValue;
            tree.insert(new Node(randomValue));
        }
        printArray(array);
        tree.display();



    }
    static void printArray(int[] array){
        System.out.println("The array is: ");
        for (int i : array){
            System.out.print(i + " ");
        }
    }
}
class BST{
    Node root;
    void insert(Node node){
        root = insertHelper(root, node);
    }
    Node insertHelper(Node root, Node node){
        if (root == null){
            root = node;
            return root;
        }
        else if (root.data > node.data){
            root.left = insertHelper(root.left, node);
        }
        else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }
    void display(){
        System.out.println();
        System.out.println("Sorted array: ");
        displayHelper(root);
    }
    void displayHelper(Node root){
        if (root != null) {
            displayHelper(root.left);
            System.out.print(root.data + " ");
            displayHelper(root.right);
        }
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){this.data = data;}
}
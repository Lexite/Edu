package B3_BroCode.DataStructures;

public class P24_TreeTraversal {
    public static void main(String[] args) {

    }

}

class TreeSearch{
    Node root;


    // In-order left - root - right
    public void inOrderTraverseTree(Node root){
        inOrderTraverseTree(root.left);
        System.out.println(root.data);
        inOrderTraverseTree(root.right);
    }

    // Post-order left - right - root
    public void postOrderTraverseTree(Node root){
        postOrderTraverseTree(root.left);
        postOrderTraverseTree(root.right);
        System.out.println(root.data);
    }

    // Pre-order root - left - right
    public void preOrderTraverseTree(Node root){
        System.out.println(root.data);
        preOrderTraverseTree(root.left);
        preOrderTraverseTree(root.right);
    }

}

class Node{
    int data;
    Node left;
    Node right;
}

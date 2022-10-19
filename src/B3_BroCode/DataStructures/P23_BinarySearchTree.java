package B3_BroCode.DataStructures;

public class P23_BinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new P23Node(5));
        tree.insert(new P23Node(1));
        tree.insert(new P23Node(9));
        tree.insert(new P23Node(2));
        tree.insert(new P23Node(7));
        tree.insert(new P23Node(3));
        tree.insert(new P23Node(6));
        tree.insert(new P23Node(4));
        tree.insert(new P23Node(8));

        tree.display();
    }

}

class P23Node {
    int data;
    P23Node left;
    P23Node right;

    public P23Node(int data){
        this.data = data;
    }
}

class BinarySearchTree{
    P23Node root;
    public void insert (P23Node node){
        root = insertHelper(root, node);
    }
    private P23Node insertHelper(P23Node root, P23Node node){
        int data = node.data;
        if(root == null){
            root = node;
            return root;
        }
        else if(data < root.data){
            root.left = insertHelper(root.left, node);
        }
        else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }
    public void display(){
        displayHelper(root);
    }
    public void displayHelper(P23Node root){
        if(root != null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }

    }
    public boolean search(int data){
        return false;
    }
    private boolean searchHelper(P23Node root, int data){
        return false;
    }
    public void remove(int data){

    }
    public P23Node removeHelper(P23Node root, int data){
        return null;
    }
    private int successor(P23Node root){
        return 0;
    }
    private int predecessor(P23Node root){
        return 0;
    }




}

package B3_BroCode.DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class P20_AdjacencyList {
    public static void main(String[] args) {

        // Adjacency List = An array/arraylist of linkedlists.
        //			          Each LinkedList has a unique node at the head.
        //			          All adjacent neighbors to that node are added to that node's linkedlist

        //				  runtime complexity to check an Edge: O(v)
        //				  space complexity: O(v + e)


        P20Graph graph = new P20Graph();
        graph.addNode(new P20Node('A'));
        graph.addNode(new P20Node('B'));
        graph.addNode(new P20Node('C'));
        graph.addNode(new P20Node('D'));
        graph.addNode(new P20Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();

    }
}

class P20Graph {
    ArrayList<LinkedList<P20Node>> alist;
    P20Graph(){
        alist = new ArrayList<>();
    }
    public void addNode(P20Node node){
        LinkedList<P20Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);

    }
    public void addEdge(int src, int dst){
        LinkedList<P20Node> currentList = alist.get(src);
        P20Node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
    }
    public boolean checkEdge(int src, int dst){
        LinkedList<P20Node> currentList = alist.get(src);
        P20Node dstNode = alist.get(dst).get(0);

        for(P20Node node : currentList){
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }
    public void print(){
        for (LinkedList<P20Node> currentList : alist){
            for (P20Node node : currentList){
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}

class P20Node {
    char data;
    P20Node(char data){
        this.data = data;
    }
}
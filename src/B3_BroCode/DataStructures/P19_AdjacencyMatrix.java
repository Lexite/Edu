package B3_BroCode.DataStructures;

import java.util.ArrayList;

public class P19_AdjacencyMatrix {

    public static void main(String[] args) {

        // Adjacency Matrix = An array to store 1's/0's to represent edges
        //				       # of rows =    # of unique nodes
        //				       # of columns = # of unique nodes

        //					  runtime complexity to check an Edge: O(1)
        //					  space complexity: O(v^2)

        P19Graph graph = new P19Graph(5);

        graph.addNode(new P19Node('A'));
        graph.addNode(new P19Node('B'));
        graph.addNode(new P19Node('C'));
        graph.addNode(new P19Node('D'));
        graph.addNode(new P19Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4); // I forgot this line in the video
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        //System.out.println(graph.checkEdge(0, 1));
    }
}
class P19Graph {

    ArrayList<P19Node> nodes;
    int[][] matrix;

    P19Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(P19Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        if(matrix[src][dst] == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void print() {
        System.out.print("  ");
        for(P19Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class P19Node {

    char data;

    P19Node(char data){
        this.data = data;
    }
}
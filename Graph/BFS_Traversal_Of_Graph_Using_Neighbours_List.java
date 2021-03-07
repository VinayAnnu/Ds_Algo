import java.io.*;
import java.util.*;

class Node{
    int data;
    boolean visited;
    ArrayList<Node> neighbours;
    Node(int data){
        this.data=data;
        neighbours=new ArrayList<Node>();
    }

    public void addNeighbours(Node n){
        this.neighbours.add(n);
    }

    public ArrayList<Node> getNeighbours(){
        return neighbours;
    }
}

class Solution{
    static Queue<Node> queue=new LinkedList<Node>();

    static void bfs(Node node){
        queue.add(node);
        node.visited=true;
        while(!queue.isEmpty()){
            Node element=queue.remove();
            System.out.print(element.data+" ");
            ArrayList<Node> neighbours=element.getNeighbours();
            for(int i=0;i<neighbours.size();i++){
                Node n=neighbours.get(i);
                if(!n.visited){
                    queue.add(n);
                    n.visited=true;
                }
            }
        }

    }

	public static void main(String args[]){
        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

        node40.addNeighbours(node10);
        node40.addNeighbours(node20);
        node10.addNeighbours(node30);
        node20.addNeighbours(node10);
        node20.addNeighbours(node30);
        node20.addNeighbours(node60);
        node20.addNeighbours(node50);
        node30.addNeighbours(node60);
        node60.addNeighbours(node70);
        node50.addNeighbours(node70);
        System.out.println("The BFS traversal of the graph is ");
        bfs(node40);
        System.out.println();

    }
}

//T(c)=O(V+E)


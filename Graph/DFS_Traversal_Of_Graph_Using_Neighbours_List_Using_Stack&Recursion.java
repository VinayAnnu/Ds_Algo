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
    static Stack<Node> stack=new  Stack<Node>();

    // Iterative DFS using stack
    public static void dfsUsingStack(Node node)
    {
        stack.push(node);
        node.visited=true;
        while (!stack.isEmpty())
        {
            Node element=stack.pop();
            System.out.print(element.data + " ");
               
            ArrayList<Node> neighbours=element.getNeighbours();
            for (int i = 0; i < neighbours.size(); i++) {
                Node n=neighbours.get(i);
                if(!n.visited)
                {
                    stack.push(n);
                    n.visited=true;
                }
            }
        }
    }

    // Recursive DFS
    public static void dfsUsingRecursion(Node node){
        System.out.print(node.data+" ");
        node.visited=true;
        ArrayList<Node> neighbours=node.getNeighbours();
        for (int i = 0; i < neighbours.size(); i++) {
                Node n=neighbours.get(i);
                if(!n.visited)
                {
                    dfsUsingRecursion(n);
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
        System.out.println("The DFS traversal of the graph using stack ");
        dfsUsingStack(node40);
        System.out.println();

        // Resetting the visited flag for nodes
        node40.visited=false;
        node10.visited=false;
        node20.visited=false;
        node30.visited=false;
        node60.visited=false;
        node50.visited=false;
        node70.visited=false;
 
 
        System.out.println("The DFS traversal of the graph using recursion ");
        dfsUsingRecursion(node40);
        System.out.println();

    }
}

//T(c)=O(V+E)


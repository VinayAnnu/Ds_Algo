import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class Solution{
    Node root;
    
    void printLeftBoundary(Node x){
        if(x==null){
            return;
        }
        if(x.left!=null){
            System.out.print(x.data+" ");
            printLeftBoundary(x.left);
        }
        else if(x.right!=null){
            System.out.print(x.data+" ");
            printLeftBoundary(x.right);
        }
        
    }
    void printLeaf(Node y){
        if(y==null){
            return;
        }
        if(y.left==null&&y.right==null){
            System.out.print(y.data+" ");
            return;
        }
        printLeaf(y.left);
        printLeaf(y.right);
    }
    void printRightBoundary(Node z){
        if(z==null){
            return;
        }
        if(z.right!=null){
            printRightBoundary(z.right);
            System.out.print(z.data+" ");  
        }
        else if(z.left!=null){
            printLeftBoundary(z.left);
            System.out.print(z.data+" ");
        }
    }

    void printBoundary(Node temp){
        if(temp==null){
            return;
        }
        System.out.print(temp.data+" ");
        printLeftBoundary(temp.left);
        printLeaf(temp);
        printRightBoundary(temp.right);
        System.out.println();
    }
    public static void main(String args[]){
        Solution s=new Solution();
        s.root = new Node(20); 
        s.root.left = new Node(8); 
        s.root.left.left = new Node(4); 
        s.root.left.right = new Node(12); 
        s.root.left.right.left = new Node(10); 
        s.root.left.right.right = new Node(14); 
        s.root.right = new Node(22); 
        s.root.right.right = new Node(25); 
        s.printBoundary(s.root); 

    }
}


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
    void mirror(Node temp){
       if(temp==null){
        return;
       }
       mirror(temp.left);
       mirror(temp.right);
       Node x=temp.left;
       temp.left=temp.right;
       temp.right=x;

    }
    void inorder(Node node)  
    {  
        if (node == null)  
            return;  
        inorder(node.left);  
        System.out.print(node.data + " ");  
        inorder(node.right);  
    }  
    public static void main(String args[]){
        Solution s=new Solution();
        s.root = new Node(1); 
        s.root.left = new Node(2); 
        s.root.right = new Node(3); 
        s.root.left.left = new Node(4); 
        s.root.left.right = new Node(5);
        s.inorder(s.root);
        System.out.println();
        s.mirror(s.root);
        s.inorder(s.root);
        System.out.println();


    }
}


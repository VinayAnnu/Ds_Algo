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

    void inorder(Node temp){
        if(temp!=null){
            inorder(temp.left);
            System.out.print(temp.data+" ");
            inorder(temp.right);
        }
    }
    void preorder(Node temp){
        if(temp!=null){
            System.out.print(temp.data+" ");
            preorder(temp.left);
            preorder(temp.right);
        }
    }
    void postorder(Node temp){
        if(temp!=null){
            postorder(temp.left);
            postorder(temp.right);
            System.out.print(temp.data+" "); 
        }
    }
    public static void main(String args[]){
        Solution s=new Solution();
        s.root=new Node(1);
        s.root.left=new Node(2);
        s.root.right=new Node(3);
        s.root.left.left=new Node(4);
        s.root.left.right=new Node(5);
        System.out.print("Inorder Traversal: ");
        s.inorder(s.root);
        System.out.println();
        System.out.print("Preorder Traversal: ");
        s.preorder(s.root);
        System.out.println();
        System.out.print("Postorder Traversal: ");
        s.postorder(s.root);
        System.out.println();

    }
}


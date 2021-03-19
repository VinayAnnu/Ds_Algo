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
    int updateTree(Node temp){
        if(temp==null){
            return 0;
        }
        if(temp.left==null&&temp.right==null){
            return temp.data;
        }
        int x=temp.data;
        int res1=updateTree(temp.left);
        temp.data=res1+x;
        int res2=updateTree(temp.right);
        return x+res1+res2;

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
        s.root.right=new Node(3);
        s.root.right.right=new Node(6);
        s.root.left.left = new Node(4); 
        s.root.left.right = new Node(5); 
        s.updateTree(s.root);
        s.inorder(s.root);
        System.out.println();


    }
}


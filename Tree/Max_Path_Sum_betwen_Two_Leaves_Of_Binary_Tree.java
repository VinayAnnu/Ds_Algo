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
    static int res=Integer.MIN_VALUE;

        static int solve(Node root){
            if(root==null)
                return 0;
            if(root.left==null&&root.right==null)
                return root.data;

            int l=solve(root.left);
            int r=solve(root.right);

            if(root.left!=null&&root.right!=null){
                res=Math.max(res,l+r+root.data);
                return Math.max(l,r)+root.data;
            }
           
            return root.left==null?r+root.data:l+root.data;
            
        }
        
    	public static void main(String args[]){
            Node root=new Node(-15);
            root.left = new Node(5); 
            root.right = new Node(6); 
            root.left.left = new Node(-8); 
            root.left.right = new Node(1); 
            root.left.left.left = new Node(2); 
            root.left.left.right = new Node(6); 
            root.right.left = new Node(3); 
            root.right.right = new Node(9); 
            root.right.right.right = new Node(0); 
            root.right.right.right.left = new Node(4); 
            root.right.right.right.right = new Node(-1); 
            root.right.right.right.right.left = new Node(10); 
            solve(root);
            System.out.println("Max pathSum b/w two leaves of binary tree is "
                    + res); 
        }
}

//T(c)=o(n)
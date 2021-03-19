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
    int max=Integer.MIN_VALUE;
    int lheight(Node y){
        if(y==null){
            return 0;
        }
        int q=lheight(y.left);
        int w=lheight(y.right);
        if(q>w){
            return q+1;
        }
        return w+1;

    }
    int rheight(Node z){
        if(z==null){
            return 0;
        }
        int q=rheight(z.left);
        int w=rheight(z.right);
        if(q>w){
            return q+1;
        }
        return w+1;

    }
    void diameter(Node temp){
        if(temp==null){
            return;
        }
        int x=lheight(temp.left)+rheight(temp.right)+1;
        if(max<x){
            max=x;
        }
        diameter(temp.left);
        diameter(temp.right);
    }
    public static void main(String args[]){
        Solution s=new Solution();
        s.root = new Node(1);
        s.root.left = new Node(2);
        s.root.right = new Node(3);
        s.root.left.left = new Node(4);
        s.root.left.right = new Node(5);
        //s.root.left.right.left = new Node(6);
        s.diameter(s.root);
        System.out.println(s.max);
    }
}


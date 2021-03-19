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
    
    HashSet<Integer> hs=new HashSet<>();
    void check(Node temp,int i){
       if(temp==null){
        return;
       }
       i++;
       if(temp.left==null&&temp.right==null){
            hs.add(i);
            System.out.println("leaf node:"+temp.data);
       }
       check(temp.left,i);
       check(temp.right,i);

    }

    public static void main(String args[]){
        Solution s=new Solution();
        s.root = new Node(12);
        s.root.left = new Node(5);
        s.root.left.left = new Node(3);
        s.root.left.right = new Node(9);
        s.root.left.left.left = new Node(1);
        s.root.left.right.left = new Node(2);
        //s.root.left.right.left.right = new Node(100);
        s.check(s.root,0);
        //System.out.println(s.hs);
        if (s.hs.size()==1)
            System.out.println("Leaves are at same level");
        else
            System.out.println("Leaves are not at same level");


    }
}


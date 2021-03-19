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
    int res=0;
    boolean isLeaf(Node node) 
    {
        if (node == null)
            return false;
        if (node.left == null && node.right == null)
            return true;
        return false;
    }
    void sum_of_left_leaf(Node temp){
        //int res = 0;
  
        // Update result if root is not NULL
        if (temp != null) 
        {
            // If left of root is NULL, then add key of
            // left child
            if (isLeaf(temp.left))
                res += temp.left.data;
            else // Else recur for left child of root
                res += sum_of_left_leaf(temp.left);
  
            // Recur for right child of root and update res
            res += sum_of_left_leaf(temp.right);
        }
  
        // return result
        return res;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        s.root = new Node(1);
        s.root.left = new Node(2);
        s.root.right = new Node(3);
        s.root.left.left = new Node(4);
        s.root.left.right = new Node(5);
        s.sum_of_left_leaf(s.root);
        System.out.println(s.res);
    }
}


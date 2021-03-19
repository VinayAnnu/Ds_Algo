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
        Deque<Node> dq=new ArrayDeque<>();//using as stack
        while(dq.size()>0||temp!=null){
            while(temp!=null){
                dq.push(temp);
                temp=temp.left;
            }
            temp=dq.pop();
            System.out.print(temp.data+" ");
            temp=temp.right;
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

    }
}


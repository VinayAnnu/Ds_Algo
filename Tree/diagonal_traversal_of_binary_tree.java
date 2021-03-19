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
    
    void diagonal_print(Node temp){
        Deque<Node> dq=new ArrayDeque<>();//using as queue
        if(temp==null){
            return;
        }
        dq.add(temp);
        while(!dq.isEmpty()){
            Node x=dq.poll();
            while(x!=null){
               System.out.print(x.data+" ");
                if(x.left!=null){
                    dq.add(x.left);
                }
                x=x.right; 
            }
            //System.out.println();
            
        }
        
        
        
    }
    
    public static void main(String args[]){
        Solution s=new Solution();
        s.root=new Node(8);
        s.root.left=new Node(3);
        s.root.right=new Node(10);
        s.root.left.left=new Node(1);
        s.root.left.right=new Node(6);
        s.root.right.right=new Node(14);
        s.root.right.right.left = new Node(13);
        s.root.left.right.left = new Node(4);
        s.root.left.right.right = new Node(7);
        System.out.print("Diagonal print: ");
        s.diagonal_print(s.root);
        System.out.println();

    }
}


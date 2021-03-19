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
    
    void levelorder(Node temp){
        Deque<Node> dq=new ArrayDeque<>();//using as queue
        dq.add(temp);
        while(dq.size()>0){
            Node x=dq.poll();
            System.out.print(x.data+" ");
            if(x.left!=null){
                dq.add(x.left);
            }
            if(x.right!=null){
                dq.add(x.right);
            }
        }
    }
    
    public static void main(String args[]){
        Solution s=new Solution();
        s.root=new Node(1);
        s.root.left=new Node(2);
        s.root.right=new Node(3);
        s.root.left.left=new Node(4);
        s.root.left.right=new Node(5);
        System.out.print("Level order Traversal: ");
        s.levelorder(s.root);
        System.out.println();

    }
}


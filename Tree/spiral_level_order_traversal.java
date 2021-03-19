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
    
    void levelorder_spiral_form(Node temp){
        Deque<Node> st1=new ArrayDeque<>();//using as stack
        Deque<Node> st2=new ArrayDeque<>();//using as stack
        st1.push(temp);
        //System.out.println(st1.size());
        while(!st1.isEmpty()||!st2.isEmpty()){
                while(st1.size()>0){
                Node x=st1.pop();
                System.out.print(x.data+" ");
                if(x.right!=null){
                    st2.push(x.right);
                }
                if(x.left!=null){
                    st2.push(x.left);
                }
              }
              while(st2.size()>0){
                Node y=st2.pop();
                System.out.print(y.data+" ");
                if(y.left!=null){
                    st1.push(y.left);
                }
                if(y.right!=null){
                    st1.push(y.right);
                }
                
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
        s.levelorder_spiral_form(s.root);
        System.out.println();

    }
}


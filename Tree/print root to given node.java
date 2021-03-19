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
    int[] arr=new int[1000];
    boolean check=false;
    void print_path(Node temp,int x,int index){
        if(temp==null){
            return;
        }
        arr[index]=temp.data;
        index++;
        if(temp.data==x){
            check=true;
            for(int i=0;i<index;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        print_path(temp.left,x,index);
        print_path(temp.right,x,index);
    }
    public static void main(String args[]){
        Solution s=new Solution();
        s.root = new Node(1);
        s.root.left = new Node(2);
        s.root.right = new Node(3);
        s.root.left.left = new Node(4);
        s.root.left.right = new Node(5);
        s.root.right.left = new Node(6);
        s.root.right.right = new Node(7);
        s.print_path(s.root,6,0);
        if(!s.check){
            System.out.println("Not found");
        }
        
    }
}


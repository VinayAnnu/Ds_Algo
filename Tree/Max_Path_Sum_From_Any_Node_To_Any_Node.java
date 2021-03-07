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

class ABC{
    public int res=Integer.MIN_VALUE;
}
class Solution{
        static int solve(Node root,ABC a){
            if(root==null)
                return 0;
            int l=solve(root.left,a);
            int r=solve(root.right,a);

            int temp=Math.max(Math.max(l,r)+root.data,root.data);
            int ans=Math.max(temp,l+r+root.data);

            a.res=Math.max(a.res,ans);

            return temp;
        }
        
    	public static void main(String args[]){
            Node root=new Node(10);
            root.left=new Node(2);
            root.right=new Node(10);
            root.left.left=new Node(20);
            root.left.right=new Node(1);
            root.right.right=new Node(-25);
            root.right.right.left=new Node(3);
            root.right.right.right=new Node(4);
            ABC a=new ABC();
            solve(root,a);
    		System.out.println("Max Path sum from any node to any node "+a.res);
    	}
}
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

            int temp=Math.max(l,r)+1;

            a.res=Math.max(a.res,1+l+r);

            return temp;
        }
        
    	public static void main(String args[]){
            Node root=new Node(1);
            root.left=new Node(2);
            root.right=new Node(3);
            root.left.left=new Node(4);
            root.left.right=new Node(5);
            ABC a=new ABC();
            solve(root,a);
    		System.out.println("Dimeter of a tree "+a.res);
    	}
}

//T(c)=o(n)
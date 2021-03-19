import java.io.*;
import java.util.*;

class Solution{
    static Deque<Integer> dq=new ArrayDeque<>();//using as queue
    static void push(int data){
        int size=dq.size();
        dq.add(data);
        for(int i=0;i<size;i++){
            int x=dq.remove();
            dq.add(x);
        }
    }
    static int pop(){
        if(dq.isEmpty()){
            return -1;
        }
        int result=dq.remove();
        return result;
    }

    static int top(){
        if(dq.isEmpty()){
            return -1;
        }
        int result=dq.peek();
        return result;
    }
    public static void main(String args[]){
         push(20);
         push(10);
         push(12);
         push(112);
         push(345);
         push(8);
         System.out.println(dq); 
         System.out.println("current size: " + dq.size()); 
         System.out.println("top element: "+top());
         System.out.println("pop: "+pop());
         System.out.println("top element: "+top());
         System.out.println("current size: " + dq.size()); 
    }
}


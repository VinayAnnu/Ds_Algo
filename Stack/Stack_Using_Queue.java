import java.io.*;
import java.util.*;

class Solution{
    static Deque<Integer> dq1=new ArrayDeque<>();//using as queue
    static Deque<Integer> dq2=new ArrayDeque<>();//using as queue
    static void push(int data){
        dq1.add(data);
    }
    static int pop(){
        if(dq1.isEmpty()){
            return -1;
        }
        while(dq1.size()!=1){
            int x=dq1.poll();
            dq2.add(x);
        }
        int result=dq1.poll();
        Deque<Integer> temp=dq1;
        dq1=dq2;
        dq2=temp;
        return result;
    }

    static int top(){
        if(dq1.isEmpty()){
            return -1;
        }
        while(dq1.size()!=1){
            int x=dq1.poll();
            dq2.add(x);
        }
        int result=dq1.poll();
        dq2.add(result);
        Deque<Integer> temp=dq1;
        dq1=dq2;
        dq2=temp;
        return result;
    }
    public static void main(String args[]){
         push(20);
         push(10);
         push(12);
         push(112);
         push(345);
         push(8);
         System.out.println("current size: " + dq1.size()); 
         System.out.println("top element: "+top());
         System.out.println("pop: "+pop());
         System.out.println("top element: "+top());
         System.out.println("current size: " + dq1.size()); 
    }
}


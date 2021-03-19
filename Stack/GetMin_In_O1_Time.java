import java.io.*;
import java.util.*;

class Solution{
    static Deque<Integer> dqMain=new ArrayDeque<>();
    static Deque<Integer> dqAux=new ArrayDeque<>();
    static void push(int data){
        if(dqMain.size()==0){
            dqMain.push(data);
            dqAux.push(data);
        }
        else{
            int x=dqAux.peek();
            if(data<x){
                dqAux.push(data);
            }
            else{
                dqAux.push(x);
            }
            dqMain.push(data);
        }
    }
    static void pop(){
        if(!dqMain.isEmpty()){
            dqMain.pop();
            dqAux.pop();
        }
    }
    static void getMin(){
        System.out.println(dqAux.peek());
    }
    public static void main(String args[]){
         push(20);
         push(10);
         push(12);
         push(112);
         push(345);
         push(8);
         //System.out.println(dqMain.peek());
         System.out.println(dqMain);
         System.out.println(dqAux);
         getMin();
         pop();
         getMin();
         System.out.println(dqMain);
         System.out.println(dqAux);
    }
}


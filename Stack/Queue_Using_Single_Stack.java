import java.io.*;
import java.util.*;

class Solution{
    static Deque<Integer> dq=new ArrayDeque<>();//using as a stack
    static void enque(int data){
        dq.push(data);
    }
    static int deque(){
        int x,result;
        if(dq.isEmpty()){
            return -1;
        }
        else if(dq.size()==1){
            return dq.pop();
        }
        else{
            x=dq.pop();
            result=deque();
            dq.push(x);
        }
        return result;
    }
    public static void main(String args[]){
         enque(12);
         enque(18);
         enque(20);
         System.out.println(dq);
         System.out.println(deque());
         System.out.println(deque());
         enque(112);
         enque(345);
         System.out.println(dq);
    }
}


import java.io.*;
import java.util.*;

class Solution{
    static void deleteMiddleElement(Deque<Integer> dq,int size,int current){
        if(dq.isEmpty()){
            return;
        }
        int x=dq.pop();
        deleteMiddleElement(dq,size,current+1);
        if(current!=size/2){
            dq.push(x);
        }

    }
    
    public static void main(String args[]){
        Deque<Integer> dq=new ArrayDeque<>();
        dq.push(45);dq.push(23);dq.push(56);dq.push(10);dq.push(100);
        //dq.push(78);
        System.out.println(dq);
        deleteMiddleElement(dq,dq.size(),0);
        System.out.println(dq);
    }
}


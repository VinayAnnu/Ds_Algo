import java.io.*;
import java.util.*;

class Solution{
    static Deque<Integer> dq=new ArrayDeque<>();//using as stack
    static void insert_at_bottom(int x){
        if(dq.isEmpty()){
            dq.push(x);
        }
        else{
            int temp=dq.pop();
            insert_at_bottom(x);
            dq.push(temp);
        }
    }
    static void reverse(){ 
        if(dq.size()>0){
            int x=dq.pop();
            reverse();
            insert_at_bottom(x);
        }
    }
    public static void main(String args[]){
        dq.push(45);dq.push(23);dq.push(56);dq.push(10);
        System.out.println(dq);
        reverse();
        System.out.println(dq);
    }
}


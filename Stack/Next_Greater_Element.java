import java.io.*;
import java.util.*;

class Solution{
    static void printNGE(int[] arr,int n){
        Deque<Integer> dq=new ArrayDeque<>();//using as stack
        for(int i=0;i<arr.length;i++){
            if(dq.isEmpty()){
                dq.push(arr[i]);
            }
            else{
                int t=dq.pop();
                while(t<arr[i]){
                    System.out.println("Next greater element of "+t+": "+arr[i]);
                    if(dq.isEmpty()){
                        break;
                    }
                    t=dq.pop();
                }
                if(t>arr[i]){
                    dq.push(t);
                }
                dq.push(arr[i]);
            }
        }
        while(!dq.isEmpty()){
            int x=dq.pop();
            System.out.println("Next greater element of "+x+": -1");
        }
    }
    public static void main(String args[]){
        int arr[] = { 11, 13, 21, 3 };
        int n = arr.length;
        printNGE(arr, n);
    }
}


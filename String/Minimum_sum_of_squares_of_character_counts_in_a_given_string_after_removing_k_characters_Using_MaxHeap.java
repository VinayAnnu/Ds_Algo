import java.io.*;
import java.util.*;

class Solution{
    static int minStringValue(String str,int k){
        if(k>str.length())
            return 0;
       HashMap<Character,Integer> hm=new HashMap<>();
       for(int i=0;i<str.length();i++){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
       }
       PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->b-a);
       //PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
       maxHeap.addAll(hm.values());
       while(k>0){
            int val=maxHeap.remove();
            val--;
            maxHeap.add(val);
            k--;
            //System.out.println(val+" "+k);
       }
       int result=0;
       while(maxHeap.size()>0){
            int x=maxHeap.remove();
            result+=x*x;
       }
       return result;
    }
    
    public static void main(String args[]){
       String str = "abbccc"; // Input 1
        int k = 2;
        System.out.println(minStringValue(str, k));
 
        str = "aaab"; // Input 2
        k = 2;
        System.out.println(minStringValue(str, k));
       
    }
}


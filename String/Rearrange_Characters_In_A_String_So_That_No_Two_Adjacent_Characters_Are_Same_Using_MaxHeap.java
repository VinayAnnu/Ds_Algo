import java.io.*;
import java.util.*;

class Solution{
    static String rearrange_character_no_two_adjacent_same(String str){
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }
        // for(Map.Entry m:hm.entrySet()){
        //     System.out.println(m.getKey()+" "+m.getValue());
        // }
        PriorityQueue<Character> maxHeap=new PriorityQueue<>((c1,c2)->hm.get(c2)-
            hm.get(c1));
        maxHeap.addAll(hm.keySet());
        StringBuilder sb=new StringBuilder();
        while(maxHeap.size()>1){
            char firstLargest=maxHeap.remove();
            char secondLargest=maxHeap.remove();
            sb.append(firstLargest);
            sb.append(secondLargest);
            hm.put(firstLargest,hm.get(firstLargest)-1);
            hm.put(secondLargest,hm.get(secondLargest)-1);
            //System.out.println(hm.get(firstLargest));
            if(hm.get(firstLargest)>0){
                maxHeap.add(firstLargest);
            }
            if(hm.get(secondLargest)>0){
                maxHeap.add(secondLargest);
            }
        }
        if(maxHeap.size()==1){
            char last=maxHeap.remove();
            if(hm.get(last)>1){
                return "Not Possible";
            }
            sb.append(last);
        }
        return sb.toString();
    }
    public static void main(String args[]){
       String str = "bbbaa" ;
       //String str = "aaabc" ;
       // String str = "aaabb" ;
        // String str = "aa" ;
        // String str = "aaaabc" ;
       String result=rearrange_character_no_two_adjacent_same(str);
       System.out.println(result);
    }
}


import java.io.*;
import java.util.*;

class Solution{
    static void k_numbers_with_most_occurence(int[] arr,int n,int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        //create a list from elements of hashmap 
        ArrayList<Map.Entry<Integer,Integer>> al=new ArrayList<>(hm.entrySet());
        //sort the list
        Collections.sort(al,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
                if(o1.getValue()==o2.getValue()){
                    return o2.getKey()-o1.getKey();
                }
                else if(o1.getValue()<o2.getValue()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });
        //printing result
        for(int i=0;i<k;i++){
            System.out.println(al.get(i).getKey());
        }
    }
    public static void main(String args[]){
        int[] arr={3, 1, 4, 4, 5, 2, 6, 1,5,6,3,3,3};
        int n=arr.length;
        int k=2;
        k_numbers_with_most_occurence(arr,n,k);
    }
}


import java.io.*;
import java.util.*;

class Solution{
    static void leader(int[] arr,int n){
        ArrayList<Integer> al=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                al.add(arr[i]);
                max=arr[i];
            }
        }
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
    public static void main(String args[]){
        //Scanner scan=new Scanner(System.in);
        int[] arr={16, 17, 4, 3, 5, 2};
        int n=arr.length;
        leader(arr,n);
    }
}


import java.io.*;
import java.util.*;

class Solution{
    static boolean check_triplet_with_given_sum(int[] arr,int n,int sum){
        for(int i=0;i<n;i++){
            int start=i+1;
            int end=n-1;
            while(start<end){
                if(arr[i]+arr[start]+arr[end]==sum){
                    return true;
                }
                else if(arr[i]+arr[start]+arr[end]<sum){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        //int[] arr={1,2,6,0,7};
        int[] arr={1,4,45,6,10,8};
        int sum=13;
        int n=arr.length;
        boolean res=check_triplet_with_given_sum(arr,n,sum);
        System.out.println(res);
    }
}


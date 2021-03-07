import java.io.*;
import java.util.*;

class Solution{
    static void longest_increasing_subarray(int[] arr,int n){
        int count=1,sum=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                sum++;
            }
            else{
                sum=1;
            }
            if(count<sum){
                count=sum;
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        //int[] arr={1,2,6,0,7};
        int[] arr={1,9,3,4,7,2,6,8};
        int n=arr.length;
        longest_increasing_subarray(arr,n);
    }
}


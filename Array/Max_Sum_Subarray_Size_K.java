import java.io.*;
import java.util.*;

class Solution{
    static void max_sum_subarray_size_k(int[] arr,int n,int k){
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(i>=k-1){
                if(max<sum){
                    max=sum;
                }
                sum=sum-arr[i-k+1];
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        int[] arr={2,1,5,1,3,2};
        int n=arr.length;
        int k=3;
        //int[] arr={2,2,2,2,2,2};
        max_sum_subarray_size_k(arr,n,k);
    }
}


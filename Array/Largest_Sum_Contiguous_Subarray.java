import java.io.*;
import java.util.*;

class Solution{
    static void largest_sum_contiguous_subarray(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            if(sum<0){
                sum=0;
            }
            else{
                sum+=arr[i];
            }
            if(max<sum){
                max=sum;
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        //Scanner scan=new Scanner(System.in);
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;
        largest_sum_contiguous_subarray(arr,n);
    }
}


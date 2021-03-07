import java.io.*;
import java.util.*;

class Solution{
    static int equillibrium_index(int[] arr,int n){
        int sum=0,left_sum,right_sum,index=-1;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        left_sum=0;
        for(int i=1;i<n;i++){
            left_sum=left_sum+arr[i-1];
            right_sum=sum-(left_sum+arr[i]);
            //System.out.println(left_sum+" "+right_sum);
            if(left_sum==right_sum){
                index=i;
                break;
            }
        }
        if(index!=-1){
            return index;
        }
        return -1;
    }
    public static void main(String args[]){
        //Scanner scan=new Scanner(System.in);
        int[] arr={-7, 1, 5, 2, -4, 3, 0};
        int n=arr.length;
        System.out.println("Equilibrium index found:"+equillibrium_index(arr,n));
    }
}


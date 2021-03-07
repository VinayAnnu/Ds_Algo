import java.io.*;
import java.util.*;

class Solution{
    static void sort_zero_one_two(int[] arr,int n){
        int start=0,end=n-1,mid=0;
        while(mid<=end){
            if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==0){
                int temp=arr[start];
                arr[start]=arr[mid];
                arr[mid]=temp;
                start++;mid++;
            }
            else if(arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[end];
                arr[end]=temp;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[]){
        int[] arr={1,2,0,0,0,1,0,1,2,2,1,0};
        int n=arr.length;
        sort_zero_one_two(arr,n);
    }
}



import java.io.*;
import java.util.*;

class Solution{
    static void selection_sort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));   
    }
    public static void main(String args[]){
        int[] arr={2,4,3,5,2,8,9,4,5,1,6};
        int n=arr.length;
        //int[] arr={2,2,2,2,2,2};
        selection_sort(arr,n);
    }
}


import java.io.*;
import java.util.*;

class Solution{
    static void bubble_sort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));   
    }
    public static void main(String args[]){
        int[] arr={2,4,3,5,2,8,9,4,5,1,6};
        int n=arr.length;
        //int[] arr={2,2,2,2,2,2};
        bubble_sort(arr,n);
    }
}


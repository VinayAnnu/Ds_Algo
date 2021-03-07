import java.io.*;
import java.util.*;

class Solution{
    static void insertion_sort(int[] arr){
        int j;
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            j=i-1;
            while(j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));

        
    }
    public static void main(String args[]){
        int[] arr={2,4,3,5,2,8,9,4,5,1,6};
        //int[] arr={2,2,2,2,2,2};
        insertion_sort(arr);
    }
}


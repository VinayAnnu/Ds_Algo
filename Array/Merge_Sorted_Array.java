import java.io.*;
import java.util.*;

class Solution{
    static void merge_sorted_array(int[] arr1,int[] arr2){
        int i=0,j=0,k=0;
        int[] arr3=new int[arr1.length+arr2.length];
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                k++;
                i++;
            }
            else{
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            k++;
            j++;
        }
        
            System.out.println(Arrays.toString(arr3));
        
    }
    public static void main(String args[]){
        int[] arr1={1,5,6,7};
        int[] arr2={2,5,8,9,11};
        merge_sorted_array(arr1,arr2);
    }
}


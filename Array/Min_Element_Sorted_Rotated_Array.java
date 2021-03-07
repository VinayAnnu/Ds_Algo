import java.io.*;
import java.util.*;

class Solution{
    static void min_ele_sorted_rotated_array(int[] arr,int n){
        int low=0,high=n-1; 
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==arr[high]){
                high--;
            }
            else if(arr[mid]<arr[high]){
                high=mid;
            }
            else{
                low=mid+1;
            }
            //System.out.println("print");
        }
        System.out.println(arr[high+1]);
    }
    public static void main(String args[]){
        int[] arr={5,6,7,8,9,1,2,3,4};
        int n=arr.length;
        //int[] arr={2,2,2,2,2,2};
        min_ele_sorted_rotated_array(arr,n);
    }
}


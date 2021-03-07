import java.io.*;
import java.util.*;

class Solution{
    static int search_element(int[] arr,int n,int k){
        int start=0,end=n-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>=arr[start]){//means this part sorted
                if(k>=arr[start]&&k<=arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(k>=arr[mid]&&k<=arr[end]){//this part sorted
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        //Scanner scan=new Scanner(System.in);
        int[] arr={ 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int key=1;
        int n=arr.length;
        System.out.println("Index of the element is : "
                           + search_element(arr, n, key)); 
    }
}


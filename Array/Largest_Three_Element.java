import java.io.*;
import java.util.*;

class Solution{
    static void largest_three_element(int[] arr,int n){
        int i,j,k;
        i=j=k=Integer.MIN_VALUE;
        for(int q=0;q<n;q++){
            if(arr[q]>k){
                i=j;
                j=k;
                k=arr[q];
                
            }
            else if(arr[q]>j){
                i=j;
                j=arr[q];
                
            }
            else if(arr[q]>i){
                i=arr[q];
            }
        }
        System.out.println("three largest element "+i+" "+j+" "+k);
    }
    public static void main(String args[]){
        //Scanner scan=new Scanner(System.in);
        int[] arr={10, 4, 3, 50, 23, 90};
        int n=arr.length;
        largest_three_element(arr,n);
    }
}


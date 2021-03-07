import java.io.*;
import java.util.*;

class Solution{
    static void second_largest_element(int[] arr,int n){
        int i,j;
        i=j=Integer.MIN_VALUE;
        for(int q=0;q<n;q++){
            if(arr[q]>j){
                i=j;
                j=arr[q];         
            }
            else if(arr[q]>i&&arr[q]<j){
                i=arr[q];
            }
        }
        System.out.println("second largest element "+i);
    }
    public static void main(String args[]){
        //Scanner scan=new Scanner(System.in);
        int[] arr={10, 4, 3, 50, 23, 90,90};
        int n=arr.length;
        second_largest_element(arr,n);
    }
}


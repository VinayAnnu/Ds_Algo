import java.io.*;
import java.util.*;

class Solution{
    static void segregate_odd_even(int[] arr,int n){
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                j++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }

    static void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[]){
        //Scanner scan=new Scanner(System.in);
        int[] arr={1,3,2,4,7,6,9,10};
        int n=arr.length;
        segregate_odd_even(arr,n);
        print(arr); 
    }
}


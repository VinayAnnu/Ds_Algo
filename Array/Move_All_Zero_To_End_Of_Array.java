import java.io.*;
import java.util.*;

class Solution{
    static void moveZero(int[] arr,int n){
        int CountPositive=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                CountPositive++;
            }
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0&&j<=CountPositive){
                arr[j]=arr[i];
                j++;
            }
        }
        while(CountPositive<n){
            arr[CountPositive]=0;
            CountPositive++;
        }
    }
    static void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String args[]){
        //Scanner scan=new Scanner(System.in);
        int[] arr={ 0,5, 0, 7, 0, 9, 10, 0, 2, 3,0 };
        int n=arr.length;
        moveZero(arr,n);
        print(arr); 
    }
}


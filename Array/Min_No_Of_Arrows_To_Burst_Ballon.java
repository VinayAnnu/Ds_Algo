import java.io.*;
import java.util.*;

class Solution{
    static void min_no_of_arrows_to_burst_ballon(int[][] arr,int n){
       Arrays.sort(arr,(a,b)->{
            return Integer.compare(a[0],b[1]);
       });
       int count=1;
       int pos=arr[0][1];
       for(int i=1;i<n;i++){
            if(arr[i][0]<=pos){
                continue;
            }
            count++;
            pos=arr[i][1];
       }
       System.out.println(count);
    }
    public static void main(String args[]){
       int[][] arr={{10,16},{2,8},{1,6},{7,12}};
       int n=arr.length; 
       min_no_of_arrows_to_burst_ballon(arr,n);
    }
}


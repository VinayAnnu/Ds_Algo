import java.io.*;
import java.util.*;

class Solution{
    public static void main(String args[]){
       int[][] arr={{3,4},{2,1},{5,6}};
       Arrays.sort(arr,(a,b)->{
        return Integer.compare(a[1],b[1]);
       });
       for (int i = 0; i < arr.length; i++) 
                System.out.println(arr[i][0]+" "+arr[i][1]);

        System.out.println("----------------------");
       int[][] arr2={{3,4},{2,1},{5,6}};
       Arrays.sort(arr2,(a,b)->a[1]-b[1]);
       for (int i = 0; i < arr2.length; i++) 
                System.out.println(arr2[i][0]+" "+arr2[i][1]);

        System.out.println("----------------------");
       int[][] arr3={{3,4},{2,1},{5,6}};
       Arrays.sort(arr3,new Comparator<int[]>(){
        public int compare(int[] a,int[] b){
            return a[1]-b[1];
        }
       });
       for (int i = 0; i < arr3.length; i++) 
                System.out.println(arr3[i][0]+" "+arr3[i][1]); 
    }
}


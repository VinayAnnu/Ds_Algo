import java.io.*;
import java.util.*;

class Solution{

    static void leftRotate(int[] arr,int n){
        int count=0;
        while(count<n){
            leftRotateByOne(arr);
            count++;
        }
    }
    static void leftRotateByOne(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }

    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        //Scanner scan=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        int rotateBy=2;
        leftRotate(arr,rotateBy%arr.length);
        print(arr);
    }
}

//t(c)=O(n*d)
//s(c)=O(1)



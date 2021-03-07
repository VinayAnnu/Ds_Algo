import java.io.*;
import java.util.*;

class Solution{
   static void print(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        print(n-1);  
   }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("Print N to 1 ");
        print(n);
        System.out.println();
    }
}



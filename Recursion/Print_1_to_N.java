import java.io.*;
import java.util.*;

class Solution{
   static void print(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        print(n-1);
        System.out.print(n+" ");
   }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("Print 1 to N ");
        print(n);
        System.out.println();
    }
}



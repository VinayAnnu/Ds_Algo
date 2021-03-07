import java.io.*;
import java.util.*;

class Egg_Dropping_Memoized{
    static int[][] t;
	static int solve(int n,int k){
        if(k==0||k==1)
            return k;
        if(n==1)
            return k;
        int min=Integer.MAX_VALUE;
        if(t[n][k]!=-1)
            return t[n][k];
        for(int x=1;x<=k;x++){
            int temp=1+Math.max(solve(n-1,x-1),solve(n,k-x));
            if(min>temp)
                min=temp;
        }
        t[n][k]=min;
        return min;
    }
	public static void main(String args[]){
		int n=2,k=10;
        t=new int[n+1][k+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<k+1;j++){
                t[i][j]=-1;
            }
        }
        System.out.print("Minimum number of "
                         + "trials in worst case with "
                         + n + " eggs and " + k 
                         + " floors is " + solve(n, k)); 
	
	}
}
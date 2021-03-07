import java.io.*;
import java.util.*;

class Solution{
static int max(int a,int b){
		return a>b?a:b ;
	}

	static int knapsack(int[] value,int[] weight,int W,int n,int[][] t){
		for(int i=1;i<n+1;i++){
			for(int j=1;j<W+1;j++){
				if(weight[i-1]<=j){
					t[i][j]=max(value[i-1]+t[i][j-weight[i-1]],t[i-1][j]);
				}
				else{
					t[i][j]=t[i-1][j];
				}
			}
		}
		return t[n][W];
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int value[]=new int[]{1,5,8,9,10,17,17,20};
		int weight[]=new int[]{1,2,3,4,5,6,7,8};
		int W=8;
		int n=value.length;
		int t[][]=new int[n+1][W+1];
		for(int i=0;i<n+1;i++){
			for(int j=0;j<W+1;j++){
				if(i==0||j==0)
					t[i][j]=0;
			}
		}
		System.out.println(knapsack(value,weight,W,n,t));
	}
}
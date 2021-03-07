import java.io.*;
import java.util.*;

class knapsack_Recursive_Memoized{
	static int max(int a,int b){
		return a>b?a:b ;
	}

	static int knapsack(int[] value,int[] weight,int W,int n,int[][] t){
		if(n==0||W==0){  //base condition
			return 0;
		}

		if(t[n][W]!=-1){
			return t[n][W];
		}

		if(weight[n-1]<=W){
			t[n][W]=max(value[n-1]+knapsack(value,weight,W-weight[n-1],n-1,t),
			 knapsack(value,weight,W,n-1,t));
			return t[n][W];
		}
		else{
			t[n][W]=knapsack(value,weight,W,n-1,t);
			return t[n][W];
		}
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int value[]=new int[]{60,100,120};
		int weight[]=new int[]{10,20,30};
		int W=50;
		int n=value.length;
		int t[][]=new int[n+1][W+1];
		for(int i=0;i<n+1;i++){
			for(int j=0;j<W+1;j++){
				t[i][j]=-1;
			}
		}
		System.out.println(knapsack(value,weight,W,n,t));
	}
}

//T(c)=O(n*W)
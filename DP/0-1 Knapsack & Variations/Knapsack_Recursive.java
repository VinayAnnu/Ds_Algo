import java.io.*;
import java.util.*;

class Knapsack_Recursive{
	static int max(int a,int b){
		return a>b?a:b ;
	}

	static int knapsack(int[] value,int[] weight,int W,int n ){
		if(n==0||W==0){  //base condition
			return 0;
		}

		if(weight[n-1]<=W){
			return max(value[n-1]+knapsack(value,weight,W-weight[n-1],n-1),
			 knapsack(value,weight,W,n-1));
		}
		else{
			return knapsack(value,weight,W,n-1);
		}
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int value[]=new int[]{60,100,120};
		int weight[]=new int[]{10,20,30};
		int W=50;
		int n=value.length;
		System.out.println(knapsack(value,weight,W,n));
	}
}

//T(c)=O(2^n)
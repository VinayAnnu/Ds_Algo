import java.io.*;
import java.util.*;

class Subset_Sum_Recursive_Memoized{

	static boolean subset_sum(int[] array,int sum,int n,int[][] t){
		if(sum==0){  //base condition
			return true;
		}
		if(n==0){   //base condition
			return false;
		}

		if(t[n][sum]==1){
			return true;
		}
		else if(t[n][sum]==0){
			return false;
		}

		if(array[n-1]<=sum){
			boolean x= subset_sum(array,sum-array[n-1],n-1,t) || 
				subset_sum(array,sum,n-1,t);
			if(x){
				t[n][sum]=1;
			}
			else{
				t[n][sum]=0;
			}
			return x;
		}
		else{
			boolean y= subset_sum(array,sum,n-1,t);
			if(y){
				t[n][sum]=1;
			}
			else{
				t[n][sum]=0;
			}
			return y;
		}

	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int array[]={3,34,4,12,5,2};
		int sum=9;
		int n=array.length;
		int[][] t=new int[n+1][sum+1];
		for(int i=0;i<n+1;i++){
			for(int j=0;j<sum+1;j++){
				t[i][j]=-1;
			}
		}
		System.out.println(subset_sum(array,sum,n,t));
	}
}
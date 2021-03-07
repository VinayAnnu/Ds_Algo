import java.io.*;
import java.util.*;

class Coin_Change_Min_No_Of_Coins_Dp{
	static int subset_sum(int[] array,int sum,int n){
		int t[][]=new int[n+1][sum+1];
		for(int i=0;i<sum+1;i++){
			t[0][i]=Integer.MAX_VALUE-1;
		}
		for(int i=1;i<n+1;i++){
			t[i][0]=0;
		}
		for(int j=1;j<sum+1;j++){
			if(j%array[0]==0)
				t[1][j]=j/array[0];
			else
				t[1][j]=Integer.MAX_VALUE-1;
		}
		for(int i=2;i<n+1;i++){
			for(int j=1;j<sum+1;j++){
				if(array[i-1]<=j){
					t[i][j]=Math.min(1+t[i][j-array[i-1]], t[i-1][j]);
				}
				else{
					t[i][j]=t[i-1][j];
				}
			}
		}
		return t[n][sum];
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int array[]={1,2,3};
		int sum=5;
		int n=array.length;
		System.out.println(subset_sum(array,sum,n));
	}
}
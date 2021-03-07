import java.io.*;
import java.util.*;

class Coin_Change_Max_No_of_ways_Dp{
static int subset_sum(int[] array,int sum,int n){
		int t[][]=new int[n+1][sum+1];
		for(int i=1;i<sum+1;i++){
			t[0][i]=0;
		}
		for(int i=0;i<n+1;i++){
			t[i][0]=1;
		}
		for(int i=1;i<n+1;i++){
			for(int j=1;j<sum+1;j++){
				if(array[i-1]<=j){
					t[i][j]=t[i][j-array[i-1]] + t[i-1][j];
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
		int sum=4;
		int n=array.length;
		System.out.println(subset_sum(array,sum,n));
	}
}
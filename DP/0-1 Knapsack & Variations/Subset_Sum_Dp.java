import java.io.*;
import java.util.*;

class Subset_Sum_Dp{

	static boolean subset_sum(int[] array,int sum,int n){
		boolean t[][]=new boolean[n+1][sum+1];
		for(int i=1;i<sum+1;i++){
			t[0][i]=false;
		}
		for(int i=0;i<n+1;i++){
			t[i][0]=true;
		}
		for(int i=1;i<n+1;i++){
			for(int j=1;j<sum+1;j++){
				if(array[i-1]<=j){
					t[i][j]=t[i-1][j-array[i-1]] || t[i-1][j];
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
		int array[]={3,34,4,12,5,2};
		int sum=9;
		int n=array.length;
		System.out.println(subset_sum(array,sum,n));
	}
}
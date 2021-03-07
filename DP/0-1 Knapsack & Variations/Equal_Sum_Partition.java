//question-Given an array of integer number and a positive integer k, find wether it's
//possible to divide this array into knon-empty subsets whose sums are all equal

import java.io.*;
import java.util.*;

class Equal_Sum_Partition{

	static boolean Is_Partitioned_Into_Two_Equal_set(int[] array,int sum,int n){
		if(sum%2!=0){
			return false;
		}
		else{
			boolean[][] t=new boolean[n+1][sum/2+1];
			for(int i=0;i<sum/2+1;i++)
				t[0][i]=false;
			for(int i=0;i<n+1;i++)
				t[i][0]=true;
			for(int i=1;i<n+1;i++){
				for(int j=1;j<sum/2+1;j++){
					if(array[i-1]<=j){
						t[i][j]=t[i-1][j-array[i-1]] || t[i-1][j];
					}
					else{
						t[i][j]=t[i-1][j];
					}
				}
			}
			return t[n][sum/2];
		}
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int array[]={ 3, 1, 5, 9, 12 };
		int n=array.length;
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=array[i];
		}

		System.out.println(Is_Partitioned_Into_Two_Equal_set(
			array,sum,n));
	}
}
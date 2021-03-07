import java.io.*;
import java.util.*;

class Coin_Change_Max_No_of_ways_recursive_memoized{
	
	static int subset(int[] array,int sum,int n,int[][] t){
		if(sum==0){  //base condition
			
			return 1;
		}
		if(sum<0){   //base condition
			return 0;
		}
		if(sum>=1&&n<=0){
			return 0;
		}
		if(t[n][sum]!=-1){
			return t[n][sum];
		}

	// We consider two cases for every element.  
    // a)  We include last element in current subset. 
    // b)We do not include last element. 
		return subset(array,sum-array[n-1],n,t)+subset(array,sum,n-1,t);  
		//exclude last element 
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int array[]={1,2,3};
		int sum=5;
		int n=array.length;
		int t[][]=new int[n+1][sum+1];
		for(int i=0;i<n+1;i++){
			for(int j=0;j<sum+1;j++){
				t[i][j]=-1;
			}
		}
		System.out.println(subset(array,sum,n,t));
	}
}
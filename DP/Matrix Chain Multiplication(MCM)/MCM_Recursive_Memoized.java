import java.io.*;
import java.util.*;

class MCM_Recursive_Memoized{
	static int[][] t;

	static int solve(int[] arr,int i,int j){
		if(i>=j)
			return 0;
		if(t[i][j]!=-1)
			return t[i][j];
		int min=Integer.MAX_VALUE;
		for(int k=i;k<=j-1;k++){
			int temp=solve(arr,i,k)+solve(arr,k+1,j)+
			arr[i-1]*arr[k]*arr[j];
			if(temp<min)
				min=temp;
		}
		t[i][j]=min;
		return min;
	}
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[]{1,2,3,4,3};
		int n=arr.length;
		t=new int[n+1][n+1];
		for(int i=0;i<n+1;i++){
			for(int j=0;j<n+1;j++){
				t[i][j]=-1;
			}
		}
		System.out.println("Minimum cost multiplication "+solve(arr,1,n-1));
	
	}
}
import java.io.*;
import java.util.*;

class Burst_Baloon_To_Maximize_Coins{
	static int[][] t;
	
	static int solve(int[] arr,int i,int j){
		
		int max=0;
		if(t[i][j]!=-1){
			return t[i][j];
		}
		for(int k=i+1;k<=j-1;k++){
			int temp=arr[i]*arr[k]*arr[j]+solve(arr,i,k)+solve(arr,k,j);

	
			if(temp>max){
				max=temp;
			}

		}
		t[i][j]=max;
		
		return max;
	}
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		
		int[] arr1=new int[]{1,2,3,4,5};
		int[] arr=new int[arr1.length+2];//initaialize 1st and last to 1 for boundary
		arr[0]=1;
		arr[arr1.length+1]=1;
		int r=1;
		for(int i=0;i<arr1.length;i++){
			arr[r]=arr1[i];
			r++;
		}
		int n=arr.length;
		t=new int[n+1][n+1];
		for(int i=0;i<n+1;i++){
			for(int j=0;j<n+1;j++){
				t[i][j]=-1;
			}
		}
		System.out.println("Max possible profit after bursting all baloon: "+solve(arr,0,n-1));
	
	}
}
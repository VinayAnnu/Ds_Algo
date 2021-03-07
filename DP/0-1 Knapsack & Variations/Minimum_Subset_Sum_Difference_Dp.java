import java.io.*;
import java.util.*;

class Minimum_Subset_Sum_Difference_Dp{
	
	
	static int subset_sum(int[] array,int n){
		int range=0;
		for(int i=0;i<n;i++){
			range+=array[i];
		}

		boolean t[][]=new boolean[n+1][range+1];
		for(int i=1;i<range+1;i++){
			t[0][i]=false;
		}
		for(int i=0;i<n+1;i++){
			t[i][0]=true;
		}
		for(int i=1;i<n+1;i++){
			for(int j=1;j<range+1;j++){
				if(array[i-1]<=j){
					t[i][j]=t[i-1][j-array[i-1]] || t[i-1][j];
				}
				else{
					t[i][j]=t[i-1][j];
				}
			}
		}
		int min=0;
		for(int i=range/2;i>=0;i--){
			if(t[n][i]){
				min=range-2*i;
				break;
			}
		}
		return min;
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int array[]={1,6,11,5};
		int n=array.length;
		System.out.println(subset_sum(array,n));
	}
}
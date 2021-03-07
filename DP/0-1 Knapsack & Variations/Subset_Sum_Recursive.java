import java.io.*;
import java.util.*;

class Subset_Sum_Recursive{

	static boolean subset_sum(int[] array,int sum,int n){
		if(sum==0){  //base condition
			return true;
		}
		if(n==0){   //base condition
			return false;
		}
		if(array[n-1]<=sum){
			return subset_sum(array,sum-array[n-1],n-1) || 
				subset_sum(array,sum,n-1);
		}
		else{
			return subset_sum(array,sum,n-1);
		}

	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int array[]={3,34,4,12,5,2};
		int sum=9;
		int n=array.length;
		System.out.println(subset_sum(array,sum,n));
	}
}

//T(c)=2^n
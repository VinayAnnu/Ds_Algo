import java.io.*;
import java.util.*;

class Solution{
	
	static int subset_sum(int[] array,int sum,int total,int n){
		if(n==0){
			return Math.abs((total-sum)-sum);
		}
		return Math.min(subset_sum(array,sum+array[n-1],total,n-1),
			subset_sum(array,sum,total,n-1));
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int array[]={1,6,11,5};
		int n=array.length;
		int total=0;
		for(int i=0;i<n;i++){
			total+=array[i];
		}
		int sum=0;
		System.out.println(subset_sum(array,sum,total,n));
	}
}

//T(c)=2^n
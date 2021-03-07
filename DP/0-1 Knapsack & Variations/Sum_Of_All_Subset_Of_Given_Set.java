import java.io.*;
import java.util.*;

class Sum_Of_All_Subset_Of_Given_Set{

	static void sum_of_all_subset(int[] array,int sum,int n){
		if(n==0){
			System.out.print(sum+" ");
			return;
		}

		sum_of_all_subset(array,sum+array[n-1],n-1);
		sum_of_all_subset(array,sum,n-1);
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int array[]={5,4,3};
		int n=array.length;
		int sum=0;
		sum_of_all_subset(array,sum,n);
		System.out.println();
	}
}

//T(c)=2^n
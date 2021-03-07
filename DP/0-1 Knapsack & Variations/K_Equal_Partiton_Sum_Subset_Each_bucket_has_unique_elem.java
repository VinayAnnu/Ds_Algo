import java.io.*;
import java.util.*;

class Solution{
	static boolean k_partition_sum(int[] array,int sum,int n,int no_of_bucket){
		if(sum%no_of_bucket!=0){
			return false;
		}
		boolean[] visited=new boolean[n];
		return is_partition(0,array,sum/no_of_bucket,0,no_of_bucket,visited);
	}

	static boolean is_partition(int start,int[] array,int total,int calculated_sum,
		int no_of_bucket,boolean[] visited){
			
			if(no_of_bucket==0){
				return true;
			}
			if(calculated_sum>total){
				return false;
			}
			if(calculated_sum==total){
				return is_partition(0,array,total,0,no_of_bucket-1,visited);
			}

			for(int i=start;i<array.length;i++){
				if(!visited[i]){
					visited[i]=true;
					if(is_partition(i+1,array,total,calculated_sum+array[i],no_of_bucket,visited)){
						return true;
					}
					visited[i]=false;
				}
				
			}
			return false;

	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int array[]={4,3,2,3,5,2,1};
		int sum=0;
		for(int i=0;i<array.length;i++)
			sum+=array[i];
		int no_of_bucket=4;
		int n=array.length;
		System.out.println(k_partition_sum(array,sum,n,no_of_bucket));
	}
}
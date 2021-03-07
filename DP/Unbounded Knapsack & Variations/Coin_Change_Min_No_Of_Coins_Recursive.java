import java.io.*;
import java.util.*;

class Coin_Change_Min_No_Of_Coins_Recursive{
	static int min=Integer.MAX_VALUE;
	static void min_no_of_coin(int[] array,int sum,int n,Vector<Integer> vec){
		if(sum==0){
			min=Math.min(min,vec.size());
			return;
			
		}
		if(sum<0){
			return;
		}

		// if(sum>0&&n<=0){
		// 	return;
		// }
		if(n==0){
			return;
		}

		Vector<Integer> v=new Vector<>(vec);
		v.add(array[n-1]);
		min_no_of_coin(array,sum-array[n-1],n,v);
		min_no_of_coin(array,sum,n-1,vec);
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int array[]={1,2,3};
		int sum=5;
		int n=array.length;
		Vector<Integer> vec=new Vector<>();
		min_no_of_coin(array,sum,n,vec);
		System.out.println(min);
	}
}
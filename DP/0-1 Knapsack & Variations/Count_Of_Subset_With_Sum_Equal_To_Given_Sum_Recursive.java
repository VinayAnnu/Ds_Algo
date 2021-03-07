import java.io.*;
import java.util.*;

class Count_Of_Subset_With_Sum_Equal_To_Given_Sum_Recursive{
	static int count=0;
	
	static void subset(int[] array,int sum,int n){
		if(sum==0){  //base condition
			count++;
			return;
		}
		if(n==0){   //base condition
			return;
		}
	// We consider two cases for every element.  
    // a)  We include last element in current subset. 
    // b)We do not include last element. 
		subset(array,sum-array[n-1],n-1); //include last element
		subset(array,sum,n-1); //exclude last element 
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int array[]={3,3,3,3};
		int sum=6;
		int n=array.length;
		subset(array,sum,n);
		System.out.println(count);
	}
}
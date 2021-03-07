import java.io.*;
import java.util.*;

class PrintAllSubsetWithGivenSum{

	static void subset(int[] array,int sum,int n,Vector<Integer> vec){
		if(sum==0){  //base condition
			System.out.print("SUBSET:");
			for(int i=0;i<vec.size();i++){
				System.out.print(vec.get(i)+" ");
			}
			System.out.println();
			return;
		}
		if(n==0){   //base condition
			return;
		}

		// We consider two cases for every element.  
    // a)  We include last element in current subset. 

    // b)We do not include last element. 

		Vector<Integer> v=new Vector<>(vec);
		v.add(array[n-1]);
		System.out.println(v+ " ");
		subset(array,sum-array[n-1],n-1,v); //include last element

		subset(array,sum,n-1,vec); //exclude last element 

		// subset(array,sum,n-1,vec);
		// Vector<Integer> v=new Vector<>(vec);
		// v.add(array[n-1]);
		// //System.out.println(v+ " ");
		// subset(array,sum-array[n-1],n-1,v);


	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int array[]={3,34,4,12,5,2};
		int sum=9;
		int n=array.length;
		Vector<Integer> vec=new Vector<>();
		subset(array,sum,n,vec);
	}
}

//T(c)=2^n
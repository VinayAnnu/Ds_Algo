import java.io.*;
import java.util.*;

class Palindrome_Partitioning{
	static int[][] t;
	static boolean isPalindrome(char[] arr,int i,int j){
		if(i>=j)
			return true;
		while(i<j){
			if(arr[i]!=arr[j])
				return false;
			i++;
			j--;
		}
		return true;
	}
	static int solve(char[] arr,int i,int j){
		if(i>=j)
			return 0;
		if(isPalindrome(arr,i,j))
			return 0;
		if(t[i][j]!=-1)
			return t[i][j];
		int min=Integer.MAX_VALUE;
		for(int k=i;k<=j-1;k++){
			int temp=1+solve(arr,i,k)+solve(arr,k+1,j);
			if(temp<min)
				min=temp;
		}
		t[i][j]=min;
		return min;
	}
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str="ababbbabbababa";
		//String str="abcde";
		int n=str.length();
		char[] arr=str.toCharArray();
		t=new int[n+1][n+1];
		for(int i=0;i<n+1;i++){
			for(int j=0;j<n+1;j++){
				t[i][j]=-1;
			}
		}
		System.out.println("Min cut: "+solve(arr,0,n-1));
	
	}
}
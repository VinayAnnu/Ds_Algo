import java.io.*;
import java.util.*;

class Longest_Palindromic_Subsequence{
static int LCS(char[] X,char[] Y,int n,int m){
		int[][] t=new int[n+1][m+1];

		for(int i=0;i<n+1;i++){
			for(int j=0;j<m+1;j++){
				if(i==0||j==0){
					t[i][j]=0;
				}
			}
		}

		for(int i=1;i<n+1;i++){
			for(int j=1;j<m+1;j++){
				if(X[i-1]==Y[j-1]){
					t[i][j]=1+t[i-1][j-1];
				}
				else{
					t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
				}
			}
		}


		return t[n][m];

		
	}

	static void longest_palindromic_subsequence(char[] X,char[] Y,int n,int m){
		int length_of_lcs=LCS(X,Y,n,m);
		System.out.println("Length of LPS: "+length_of_lcs);
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String s1="GEEKSFORGEEKS"; 

		StringBuilder s2=new StringBuilder(s1);
		s2=s2.reverse(); 

		char[] X=s1.toCharArray();
		char[] Y=new char[X.length];
		for(int i=0;i<Y.length;i++){
			Y[i]=s2.charAt(i);
		}

		int n=X.length;
		int m=Y.length;
		
		longest_palindromic_subsequence(X,Y,n,m);
	}
}
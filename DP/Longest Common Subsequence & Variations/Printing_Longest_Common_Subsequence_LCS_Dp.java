import java.io.*;
import java.util.*;

class Printing_Longest_Common_Subsequence_LCS_Dp{
static void LCS(char[] X,char[] Y,int n,int m){
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

		String subsequence="";
		int i=n,j=m;
		while(i>0&&j>0){
			if(X[i-1]==Y[j-1]){
				subsequence=X[i-1]+subsequence;
				i--;
				j--;
			}
			else{
				if(t[i-1][j]>t[i][j-1]){
					i--;
				}
				else{
					j--;
				}
			}
		}

		if(t[n][m]==0){
			System.out.println("No subsequence found");
		}
		else{
			System.out.println(subsequence);
		}

		
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String s1="AGGTAB"; 
		String s2="GXTXAYB"; 
		char[] X=s1.toCharArray();
		char[] Y=s2.toCharArray();
		int n=X.length;
		int m=Y.length;
		LCS(X,Y,n,m);
	
	}
}
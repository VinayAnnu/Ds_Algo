import java.io.*;
import java.util.*;

class Shortest_Common_Supersequence{
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

	static void shortest_common_supersequence(char[] X,char[] Y,int n,int m){
		int length_of_x=X.length, length_of_y=Y.length;
		int length_of_lcs=LCS(X,Y,n,m);
		int result=length_of_x+length_of_y-length_of_lcs;
		System.out.println(result);
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String s1="AGGTAB"; 
		String s2="GXTXAYB"; 
		char[] X=s1.toCharArray();
		char[] Y=s2.toCharArray();
		int n=X.length;
		int m=Y.length;
		
		shortest_common_supersequence(X,Y,n,m);
	}
}
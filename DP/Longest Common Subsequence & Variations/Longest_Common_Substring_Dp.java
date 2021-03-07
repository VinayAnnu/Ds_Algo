import java.io.*;
import java.util.*;

class Longest_Common_Substring_Dp{
	static int LCS(char[] X,char[] Y,int n,int m){
		int[][] t=new int[n+1][m+1];

		for(int i=0;i<n+1;i++){
			for(int j=0;j<m+1;j++){
				if(i==0||j==0){
					t[i][j]=0;
				}
			}
		}

		int result=0;

		for(int i=1;i<n+1;i++){
			for(int j=1;j<m+1;j++){
				if(X[i-1]==Y[j-1]){
					t[i][j]=1+t[i-1][j-1];
					result=Math.max(result,t[i][j]);
				}
				else{
					t[i][j]=0;
				}
			}
		}
		return result;

		
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String s1="AGGTAB"; 
		String s2="GXTXAGYB"; 
		char[] X=s1.toCharArray();
		char[] Y=s2.toCharArray();
		int n=X.length;
		int m=Y.length;
		
		System.out.println(LCS(X,Y,n,m));
	}
}
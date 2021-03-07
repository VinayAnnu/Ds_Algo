import java.io.*;
import java.util.*;

class LCS_Recursive_Memoized{
	static int LCS(char[] X,char[] Y,int n,int m,int[][] t){
		//base condition
		if(n==0||m==0){
			return 0;
		}

		if(t[n][m]!=-1){
			return t[n][m];
		}

		if(X[n-1]==Y[m-1]){
			t[n][m]=1+LCS(X,Y,n-1,m-1,t);
			return t[n][m];
		}
		else{
			t[n][m]=Math.max(LCS(X,Y,n-1,m,t),LCS(X,Y,n,m-1,t));
			return t[n][m];
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
		int[][] t=new int[n+1][m+1];
		for(int i=0;i<n+1;i++){
			for(int j=0;j<m+1;j++){
				t[i][j]=-1;
			}
		}
		System.out.println(LCS(X,Y,n,m,t));
	}
}
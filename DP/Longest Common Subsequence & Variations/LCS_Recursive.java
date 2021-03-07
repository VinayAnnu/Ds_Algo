
import java.io.*;
import java.util.*;

class LCS_Recursive{
	static int LCS(char[] X,char[] Y,int n,int m){
		//base condition
		if(n==0||m==0){
			return 0;
		}

		if(X[n-1]==Y[m-1]){
			return 1+LCS(X,Y,n-1,m-1);
		}
		else{
			return Math.max(LCS(X,Y,n-1,m),LCS(X,Y,n,m-1));
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
		System.out.println(LCS(X,Y,n,m));
	}
}

//T(c)=2^n
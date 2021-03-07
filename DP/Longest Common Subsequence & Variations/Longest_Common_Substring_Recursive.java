import java.io.*;
import java.util.*;

class Longest_Common_Substring_Recursive{
	
	static int LCS(char[] X,char[] Y,int n,int m,int result){
		//base condition
		if(n==0||m==0){
			return result;
		}

		if(X[n-1]==Y[m-1]){
			return LCS(X,Y,n-1,m-1,result+1);
		}
		else{
			return Math.max(result,Math.max(LCS(X,Y,n-1,m,0),LCS(X,Y,n,m-1,0)));
		}
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String s1="AGGTAB"; 
		String s2="GXTXAGTAYB"; 
		char[] X=s1.toCharArray();
		char[] Y=s2.toCharArray();
		int n=X.length;
		int m=Y.length;

		System.out.println(LCS(X,Y,n,m,0));
	}
}
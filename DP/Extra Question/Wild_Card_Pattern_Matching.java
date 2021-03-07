import java.io.*;
import java.util.*;

class Solution{
	static boolean isMatched(char[] str,char[] pattern,int n,int m){
		boolean[][] t=new boolean[n+1][m+1];
		for(int i=1;i<n+1;i++){
			t[i][0]=false;
		}
		t[0][0]=true;
		for(int j=1;j<m+1;j++){
			if(pattern[j-1]=='*'){
				t[0][j]=t[0][j-1];
			}
			else{
				t[0][j]=false;
			}
		}

		for(int i=1;i<n+1;i++){
			for(int j=1;j<m+1;j++){
				if(pattern[j-1]=='?'||pattern[j-1]==str[i-1]){
					t[i][j]=t[i-1][j-1];
				}
				else if(pattern[j-1]=='*'){
					t[i][j]=t[i][j-1]||t[i-1][j];
				}
				else{
					t[i][j]=false;
				}
			}
		}

		return t[n][m];
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str= "baaabab";
		String pattern= "*****ba*****ab";
		char[] X=str.toCharArray();
		char[] Y=pattern.toCharArray();
		int n=X.length;
		int m=Y.length;
		
		System.out.println(isMatched(X,Y,n,m));
	
	}
}
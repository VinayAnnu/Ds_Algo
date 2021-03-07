import java.io.*;
import java.util.*;

class Solution{
static int LCS(char[] X,char[] Y,int n,int m){
		int[][] t=new int[2][m+1];//creating matrix of 2 rows only

		for(int i=0;i<2;i++){
			for(int j=0;j<m+1;j++){
				if(i==0||j==0){
					t[i][j]=0;
				}
			}
		}

		int result=0;
		int currentRow=1;
		for(int i=1;i<n+1;i++){
			for(int j=1;j<m+1;j++){
				if(X[i-1]==Y[j-1]){
					t[currentRow][j]=1+t[1-currentRow][j-1];
					result=Math.max(result,t[currentRow][j]);
				}
				else{
					t[currentRow][j]=0;
				}
			}
			currentRow=1-currentRow;
		}
		return result;

		
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String s1="AGGTAB"; 
		String s2="GXTXAGGYB"; 
		char[] X=s1.toCharArray();
		char[] Y=s2.toCharArray();
		int n=X.length;
		int m=Y.length;
		
		System.out.println(LCS(X,Y,n,m));
	}
}
//T(c)=O(m*n)
//space complexity= O(m)
import java.io.*;
import java.util.*;

class Solution{
    static int findSum(String str){
        int i=0,sum=0;
        String s1="";
        while(i<str.length()){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                s1=s1+str.charAt(i);
                i++;
            }
            else{
                if(s1.length()!=0)
                    sum+=Integer.parseInt(s1);
                s1="";
                i++;
            }
        }
        if(s1.length()>0){
            sum+=Integer.parseInt(s1);
        }
        return sum;
    }
    
    public static void main(String args[]){
       // input alphanumeric string 
        String str = "12abc20yz68"; 
  
        // Function call 
        System.out.println(findSum(str));
    }
}


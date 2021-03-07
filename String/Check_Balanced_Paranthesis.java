import java.io.*;
import java.util.*;

class Solution{
    static boolean matching(Character c1,Character c2){
        if(c2=='(' && c1==')'){
                return true;
        }
        if(c2=='{' && c1=='}'){
                return true;
        }
        if(c2=='[' && c1==']'){
            return true;
        }
        return false;
    }
    
    static boolean areBracketsBalanced(String expr) 
    { 
        Deque<Character> dq=new ArrayDeque<>();
        for(int i=0;i<expr.length();i++){
            char c1=expr.charAt(i);
            if(c1=='('||c1=='['||c1=='{'){
                dq.push(c1);
            }
            else{
                if(dq.size()==0){
                    return false;
                }
                char c2=dq.pop();
                //System.out.println(c2);
                boolean check=matching(c1,c2);
                if(!check){
                    return false;
                }
            }
        }
        if(dq.size()>0){
            return false;
        }
        return true;
    }
    
    public static void main(String args[]){
        String expr = "([{}])"; 
        if (areBracketsBalanced(expr)) 
            System.out.println("Balanced "); 
        else
            System.out.println("Not Balanced "); 
    }
}


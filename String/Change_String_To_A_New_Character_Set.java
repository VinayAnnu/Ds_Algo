import java.io.*;
import java.util.*;

class Solution{
    static void translate(String str,String convert){
       HashMap<Character,Integer> hm=new HashMap<>();
       for(int i=0;i<str.length();i++){
        hm.put(str.charAt(i),i);
       }
       for(int i=0;i<convert.length();i++){
        int pos=hm.get(convert.charAt(i));
        int res='a'+pos;
        System.out.print((char)res);
       }
       System.out.println();
    }
    public static void main(String args[]){
       String str = "qwertyuiopasdfghjklzxcvbnm" ;
       String convert="utta";
       translate(str,convert);
       
    }
}


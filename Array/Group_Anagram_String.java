import java.io.*;
import java.util.*;

class Solution{
    static List<List<String>> group_anagram(String[] str){
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s1:str){
            char[] c1=s1.toCharArray();
            Arrays.sort(c1);
            String s2=new String(c1);
            if(hm.containsKey(s2)){
                hm.get(s2).add(s1);
            }
            else{
                ArrayList<String> al=new ArrayList<>();
                al.add(s1);
                hm.put(s2,al);
            }
        }
        res.addAll(hm.values());
        //System.out.println(hm.values());
        //System.out.println(res);
        return res;
    }
    public static void main(String args[]){
        String[] str={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result=group_anagram(str);
        result.forEach(t->System.out.println(t+" "));
    }
}


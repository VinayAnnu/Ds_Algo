import java.io.*;
import java.util.*;

class Interval{
    int start,end;
    public Interval(int start,int end){
        this.start=start;
        this.end=end;
    }
}
class Solution{
    static void sort(List<Interval> al){
        Collections.sort(al,new Comparator<Interval>(){
            public int compare(Interval o1,Interval o2){
                if(o1.start==o2.start){
                    return 0;
                }
                else if(o1.start<o2.start){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });
        for(Interval res:al){
            System.out.println(res.start+" "+res.end);
        }
    }
    public static void main(String args[]){
        List<Interval> al=new ArrayList<>();
        al.add(new Interval(6,9));
        al.add(new Interval(2,5));
        al.add(new Interval(1,4));
        al.add(new Interval(3,8));
        sort(al);
    }
}


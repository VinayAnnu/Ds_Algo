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
    static List<Interval> mergeInterval(List<Interval> al){
       if(al.size()<2){
        return al;
       }
       List<Interval> output=new ArrayList<>();
       //sorting based on first element
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
        Interval temp=al.get(0);
        int start=temp.start;
        int end=temp.end;
        for(int i=1;i<al.size();i++){
            temp=al.get(i);
            if(temp.start<=end){
                end=Math.max(end,temp.end);
            }
            else{
                output.add(new Interval(start,end));
                start=temp.start;
                end=temp.end;
            }
        }
        output.add(new Interval(start,end));
        return output;
    }
    public static void main(String args[]){
        List<Interval> al=new ArrayList<>();
        al.add(new Interval(6,9));
        al.add(new Interval(2,5));
        al.add(new Interval(1,4));
        List<Interval> output=mergeInterval(al);
        for(Interval res:output){
            System.out.println(res.start+" "+res.end);
        }
    }
}


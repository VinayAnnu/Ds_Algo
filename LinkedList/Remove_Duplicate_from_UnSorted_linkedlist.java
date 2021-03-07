import java.io.*;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class Solution{
    Node head;
    void appendAtTheEnd(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
    }

    void delete(int data){
        Node temp=head,prev=null;
        if(temp!=null&&temp.data==data){//if head has data
            head=temp.next;
            return;
        }
        while(temp!=null&&temp.data!=data){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null){
           System.out.println("Node to be delated not found");
            return; 
        }
        prev.next=temp.next;
    }

    void reverse(){
        Node prev=null,temp;
        while(head!=null){
            temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        head=prev;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void remove_duplicate(){
        Node outer=head,prev=null;
        while(outer!=null){
           prev=outer;
           Node inner=outer.next;
           while(inner!=null){
                if(outer.data==inner.data){
                    prev.next=inner.next;
                    inner=prev;
                    continue;
                }
                prev=inner;
                inner=inner.next;
           }
           outer=outer.next;
        }
    }
    //removing using HashSet
    // void remove_duplicate(){
    //     HashSet<Integer> hs=new HashSet<>();
    //     Node current=head,prev=head;
    //     while(current!=null){
    //         int cur_val=current.data;
    //         if(hs.contains(cur_val)){
    //             prev.next=current.next;
    //         }
    //         else{
    //             prev=current;
    //             hs.add(cur_val);
    //         }
    //         current=current.next;
    //     }
    // }

    public static void main(String args[]){
        Solution ls=new Solution();
        // System.out.println(ls.head);
        ls.appendAtTheEnd(12);
        ls.appendAtTheEnd(11);
        ls.appendAtTheEnd(12);
        ls.appendAtTheEnd(21);
        ls.appendAtTheEnd(41);
        ls.appendAtTheEnd(43);
        ls.appendAtTheEnd(21);
        ls.appendAtTheEnd(21);
        ls.print();
        ls.remove_duplicate();
        ls.print();
        
    }
}


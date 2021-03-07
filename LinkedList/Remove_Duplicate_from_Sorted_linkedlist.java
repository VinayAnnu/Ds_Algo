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
        Node prev=head,temp=head;
        while(temp!=null){
            prev=temp;
            temp=temp.next;
            if(temp!=null&&temp.data==prev.data){
                prev.next=temp.next;
                temp=prev;
            }
        }
    }
    public static void main(String args[]){
        Solution ls=new Solution();
        // System.out.println(ls.head);
        ls.appendAtTheEnd(1);
        ls.appendAtTheEnd(4);
        ls.appendAtTheEnd(4);
        ls.appendAtTheEnd(4);
        ls.appendAtTheEnd(8);
        ls.appendAtTheEnd(10);
        ls.print();
        ls.remove_duplicate();
        ls.print();
        
    }
}


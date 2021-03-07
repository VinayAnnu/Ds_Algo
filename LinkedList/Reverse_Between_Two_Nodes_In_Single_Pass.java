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

    void reverse_between(int m,int n){
        Node prev=null;
        Node temp=head;
        while(m>1){
            prev=temp;
            temp=temp.next;
            m--;
            n--;
        }
        Node connection=prev;
        Node tail=temp;

        Node prev_q1=null,q2=temp;
        while(n>0){//reversing linkedlist
            q2=temp.next;
            temp.next=prev_q1;
            prev_q1=temp;
            temp=q2;
            n--;
        }
        if(connection!=null){
            connection.next=prev_q1;
        }
        else{
            head=prev_q1;
        }
        tail.next=temp;
    }
    public static void main(String args[]){
        Solution ls=new Solution();
        // System.out.println(ls.head);
        ls.appendAtTheEnd(6);
        ls.appendAtTheEnd(4);
        ls.appendAtTheEnd(9);
        ls.appendAtTheEnd(1);
        ls.appendAtTheEnd(8);
        ls.appendAtTheEnd(10);
        ls.print();
        ls.reverse_between(2,5);// reverse 2 to 5 inclusive// 6 8 1 9 4 10
        ls.print();
    }
}


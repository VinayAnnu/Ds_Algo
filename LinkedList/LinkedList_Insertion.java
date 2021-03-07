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

    void appendInTheBeginning(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
    }

    void insertAfter(int prev_data,int data){
        Node temp=head;
        while(temp!=null&&temp.data!=prev_data){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Node not found");
            return;
        }
        Node node=new Node(data);
        node.next=temp.next;
        temp.next=node;
    }

    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        Solution ls=new Solution();
        // System.out.println(ls.head);
        ls.appendAtTheEnd(6);
        ls.appendInTheBeginning(7);
        ls.appendInTheBeginning(1);
        ls.appendAtTheEnd(4);
        ls.insertAfter(7,8);
        ls.print();
    }
}


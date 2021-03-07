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
    int count=0;
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

    void length_of_linkedlist_iterative(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        System.out.println("Length using iterative "+count);
    }

    int length_of_linkedlist_recursive(Node temp){
        if(temp==null){
            return 0;
        }
        return 1+length_of_linkedlist_recursive(temp.next);
    }

    void nth_node_from_last(Node temp,int k){
        if(temp==null){
            return;
        }
        nth_node_from_last(temp.next,k);
        count++;
        //System.out.println(count);
        if(count==k){
            System.out.println(k+"th node from last "+temp.data);
        }

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

    void mid_link(){
        int count=0;
        Node temp=head,mid=head;
        while(temp!=null){
            if(count%2==1){
                mid=mid.next;
            }
            count++;
            temp=temp.next;
        }
        System.out.println("Middle Element "+mid.data);

    }

    boolean check_palindrome(Node temp){
        if(temp==null){
            return true;
        }
        boolean isp=check_palindrome(temp.next);
        if(isp==false){
            return false;
        }
        if(temp.data==head.data){
            head=head.next;
            return true;
        }
        return false;
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
        ls.delete(8);
        ls.appendAtTheEnd(9);
        ls.print();
        ls.length_of_linkedlist_iterative();
        System.out.println("length using recurive "+
            ls.length_of_linkedlist_recursive(ls.head));
        ls.print();
        ls.nth_node_from_last(ls.head,4);
        ls.reverse();
        System.out.println("After Reversing Linkedlist");
        ls.print();
        ls.mid_link();
        ls.delete(7);
        ls.delete(1);
        ls.appendAtTheEnd(4);
        ls.appendAtTheEnd(9);
        Node storeHead=ls.head;
        System.out.println("is Palindrome? "+ls.check_palindrome(ls.head));
        ls.head=storeHead;
        ls.print();

    }
}


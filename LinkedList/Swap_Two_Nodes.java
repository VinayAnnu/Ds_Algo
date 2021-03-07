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

    void swpaNodes(int x,int y){
        Node prev_x=null,prev_y=null,tempx=head,tempy=head;
        while(tempx!=null){
            if(tempx.data!=x){
                prev_x=tempx;
                tempx=tempx.next;
            }
            else{
                break;
            }
        }
        while(tempy!=null){
            if(tempy.data!=y){
                prev_y=tempy;
                tempy=tempy.next;
            }
            else{
                break;
            }
        }

        if(tempx==null||tempy==null){
            return;
        }

        if(prev_x!=null){
            prev_x.next=tempy;
        }
        else{
            head=tempy;
        }

        if(prev_y!=null){
            prev_y.next=tempx;
        }
        else{
            head=tempx;
        }
        Node q1=tempy.next;
        tempy.next=tempx.next;
        tempx.next=q1;
    }
    public static void main(String args[]){
        Solution ls=new Solution();
        // System.out.println(ls.head);
        ls.appendAtTheEnd(12);
        ls.appendAtTheEnd(11);
        ls.appendAtTheEnd(18);
        ls.appendAtTheEnd(21);
        ls.appendAtTheEnd(41);
        ls.appendAtTheEnd(43);
        ls.print();
        ls.swpaNodes(11,41);
        ls.print();
        
    }
}


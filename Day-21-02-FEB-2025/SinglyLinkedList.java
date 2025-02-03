import java.util.Scanner;

public class SinglyLinkedList {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }


    public static class linkedList
    {
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val)
        {
            Node temp=new Node(val);
            if(head==null)
            {
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void display()
        {
            Node temp=head;
            while (temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        void insertAtBeginning(int data)
        {
            Node temp=new Node(data);
            if(head==null)
            {
                tail=temp;
            }else{
                temp.next=head;
            }
            head=temp;
        }
        void insertAtTheAnyPosition(int pos,int val)
        {
            Node newNode=new Node(val);
            Node temp=head;
            int i=0;
            if(size()==pos)
            {
                insertAtEnd(val);
            }
            else if(pos==0)
            {
                insertAtBeginning(val);
                return;
            }
            else{
                for (int j = 0; j <pos-1 ; j++) {
                    temp=temp.next;
                }
                newNode.next=temp.next;
                temp.next=newNode;
            }
        }
        int getAnElement(int pos){
            Node temp=head;
            if(pos>size())
            {
                return -1;
            }
            else if(pos<0)
            {
                return -1;
            }
            else{
                for (int i = 1; i < pos; i++) {
                    temp=temp.next;
                }
            }
            return temp.data;
        }
        int size()
        {
            Node temp=head;
            int count=0;
            while (temp!=null)
            {
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.display();
        System.out.println("\nSize : "+ll.size());
        ll.insertAtEnd(30);
        ll.insertAtEnd(58);
        ll.display();
        System.out.println("\nSize : "+ll.size());
        ll.insertAtBeginning(8);
        ll.display();
        System.out.println();
        ll.insertAtTheAnyPosition(3,25);
        ll.display();
        System.out.println();
        ll.insertAtTheAnyPosition(6,65);
        ll.display();
        ll.insertAtTheAnyPosition(0,5);
        System.out.println();
        ll.display();
        System.out.println();
        System.out.println(ll.getAnElement(5));
    }
}

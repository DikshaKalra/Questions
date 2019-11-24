package dailyquestions;

import java.util.Scanner;

public class ReverseDLL {
     static Node head;
    static class Node
    {
        int data;
        Node prev,next;
        Node(int d)
        {
            data=d;
            prev=null;
        }
    }
        public static ReverseDLL insert(ReverseDLL li,int data)
        {
            Node newNode=new Node(data);
            if(li.head==null)
            {
                li.head=newNode;
                newNode.prev=null;
                newNode.next=null;
            }
            else
            {
                Node temp=li.head;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                  temp.next=newNode;
                    newNode.prev=temp;
                    newNode.next=null;
            }
            return li;
        }

        public static void display(ReverseDLL li)
        {
            Node current=li.head;
           Node end=li.head;
        if(li.head==null)
        {
            System.out.println("Doubly LinkedList not formed");
        }
        else
        {
            while(current.next!=null)
            {
                 current=current.next;
            }

            System.out.println("Doubly LinkedList in Backward direction is as follows: ");
            while(end.next!=null)
            {
                end=end.next;

            }
            while(end!=li.head)
            {
                 System.out.print(end.data +"->");
                 end=end.prev;
            }
            System.out.print(end.data +"\n");

        }
        }

    public static void main(String[] args) {
        ReverseDLL l1=new ReverseDLL();
        Scanner sc=new Scanner(System.in);
                    if(l1.head==null)
                    {
                        System.out.println("Make a Doubly LinkedList");
                    }
                    System.out.println("Enter number of elements: ");
                    int num=sc.nextInt();
                    System.out.println("Enter elements: ");
                    for(int i=0;i<num;i++)
                    {
                        int ele=sc.nextInt();
                     l1.insert(l1,ele);
                    }

                l1.display(l1);
    }
}

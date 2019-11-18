package dailyquestions;

import java.util.Scanner;

public class duplicatesLL {
   static node head;
     static class node
     {
        int data;
        node next;
        node(int d)
        {
            data=d;
            next=null;
        }
     }

     public static duplicatesLL insert(duplicatesLL li,int data)
     {
         node newnode=new node(data);
         newnode.next=null;
         if(li.head==null)
         {
             li.head=newnode;
         }
         else
         {
             node last=li.head;
             while(last.next!=null)
             {
                 last=last.next;
             }
             last.next=newnode;
         } return li;
     }
     public static void display(duplicatesLL li)
     {  int sum=0;
         node current=li.head;
         while(current.next!=null)
         {
             System.out.print(current.data+" ");
             sum=sum+current.data;
             current=current.next;
         } System.out.print(current.data);
     }

     public static duplicatesLL removedup(duplicatesLL li)
     {
         node n=head;
         while(n!=null)
         {
             boolean x=true;
             node m=head;
             while(m!=n)
             {
                 if(m.data==n.data)
                 {
                     x=false;
                     break;
                 }
                 m=m.next;
             }
             if(x==false)
                {
                    node temp=head;
                    while(temp.next!=n)
                    {
                        temp=temp.next;
                    }
                    temp.next=temp.next.next;
                }
            n=n.next;
         } return li;
     }
    public static void main(String[] args) {
     duplicatesLL li=new duplicatesLL();
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            int ele=sc.nextInt();
            li.insert(li,ele);
        }
        System.out.println("After removal: ");
     li.removedup(li);
     li.display(li);
    }
}

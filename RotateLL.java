package dailyquestions;

import java.util.Scanner;

public class RotateLL
{
    static Node head;


    static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}

	public static void insert(int data)
	{
		Node current=head;
		Node new_Node=new Node(data);
		if(head==null)
		{
			head=new_Node;
			return;
		}
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=new_Node;

	}

	 public static void rotate(RotateLL li,int n)
    {
        int k=0;
        Node current=li.head;
        Node previous=null;
        while(k<n && current!=null)
        {
            previous=current;
            current=current.next;
            k++;
        }

        Node temp=current;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

        Node demo=li.head;
        while(demo!=current)
        {
            System.out.println(demo.data);
            demo=demo.next;
        }

    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		RotateLL rl=new RotateLL();
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			rl.insert(sc.nextInt());
		}
		System.out.println("Enter a number:");
                int e=sc.nextInt();
                System.out.println("After rotation: ");
		rl.rotate(rl,e);
	}

}

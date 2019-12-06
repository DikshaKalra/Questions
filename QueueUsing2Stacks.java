package dailyquestions;

import java.util.Scanner;

public class QueueUsing2Stacks {
    Node top;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    QueueUsing2Stacks() {
        top = null;
    }

    public void push(int data) {
        Node temp = new Node(data);
        if (temp == null) {
            System.out.println("overflow");
            return;
        } else {
            temp.data = data;
            temp.next = top;
            top = temp;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("empty");
            return;
        }
        top = top.next;
    }

    public void display() {
        Node current = top;
        while (current.next != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print(current.data);
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek(QueueUsing2Stacks q1) {
        if (!isEmpty()) {
            return top.data;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsing2Stacks s1 = new QueueUsing2Stacks();
        QueueUsing2Stacks s2 = new QueueUsing2Stacks();
        System.out.println("enter number of elements");
        int n = sc.nextInt();
        System.out.println("enter elements: ");
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            s1.push(d);
        }
        System.out.println("\npeek of s1: "+s1.peek(s1));
        System.out.print("s1 is: ");
        s1.display();
        for (int i = 0; i < n; i++) {
            int z = s1.peek(s1);
            s1.pop();
            s2.push(z);
        }
        System.out.print("\ns2 is: ");
        s2.display();
         System.out.println("\npeek of s2: "+s2.peek(s2));
        System.out.print("\nafter pop(): ");
        s2.pop();
        s2.display();

    }

}

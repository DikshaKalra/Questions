package dailyquestions;

import java.util.Scanner;

public class sum_of_list {

    static class node {

        int data;
        node next;

        node(int d) {
            this.data = d;
            node next = null;
        }
    }
    node head = null;

    public static sum_of_list insert(sum_of_list li, int data) {
        node n1 = new node(data);
        n1.next = null;
        if (li.head == null) {
            li.head = n1;
        } else {
            node last = li.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = n1;
        }
        return li;
    }

    public static void display(sum_of_list l) {
        if (l.head == null) {
            return;
        } else {
            node p = l.head;
            while (p != null) {
                System.out.print(p.data + "->");
                p = p.next;
            }
            System.out.println("");
        }
    }

    public static void add(sum_of_list l1, sum_of_list l2) {
        node p = l1.head;
        node q = l2.head;
        int sum = 0;
        int carr = 0;
        while (p != null) {
            sum = p.data + q.data + carr;
            carr = 0;
            int t = sum % 10;
            System.out.print(t + "->");
            carr = sum / 10;
            p = p.next;
            q = q.next;
        }
        if (carr != 0) {
            System.out.print(carr);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sum_of_list l1 = new sum_of_list();
        sum_of_list l2 = new sum_of_list();
        System.out.println("enter number of elements of list 1");
        int m = sc.nextInt();
        System.out.println("enter elements of list 1");
        for (int i = 0; i < m; i++) {
            l1.insert(l1, sc.nextInt());
        }
        display(l1);
        System.out.println("enter elements of list 2");
        for (int i = 0; i < m; i++) {
            l2.insert(l2, sc.nextInt());
        }
        display(l2);
        add(l1, l2);
    }
}

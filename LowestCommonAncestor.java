package dailyquestions;

import java.util.*;

public class LowestCommonAncestor {

    static class Node {

        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static Node root;

    Node lowest(Node root, int a, int b) {
        if (root == null) {
            return root;
        }
        if (root.data == a || root.data == b) {
            return root;
        }
        Node l = lowest(root.left, a, b);
        Node r = lowest(root.right, a, b);
        if (l != null && r != null) {
            return root;
        }
        return (l != null) ? l : r;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LowestCommonAncestor c = new LowestCommonAncestor();
        c.root = new Node(1);
        c.root.left = new Node(2);
        c.root.right = new Node(3);
        c.root.left.left = new Node(4);
        c.root.left.right = new Node(5);
        c.root.right.left = new Node(6);
        c.root.right.right = new Node(7);
        System.out.println("Enter the two nodes: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Node l = c.lowest(c.root, a, b);
        System.out.print("Lowest common ancestor is : " + l.data + " ");
    }
}

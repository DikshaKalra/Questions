package dailyquestions;

import java.util.Scanner;
    class Node
    {
        int data;
        Node left,right;
        public Node(int d)
        {
            data=d;
            left=null;
            right=null;
        }
    }
   public class CheckBinary {
     static Node root;

    public CheckBinary() {
        root=null;
    }
    CheckBinary(int key)
    {
        root=new Node(key);
    }
    static boolean BST(Node root)
    {
        if(root.left!=null || root.right!=null)
        {
            if(root.data<root.left.data)
            {
                return false;
            }
            else if(root.data>root.right.data)
            {
                return false;
            }
            else
            {
                BST(root.left);
                BST(root.right);
            }
        } return true;
    }
        public static void main(String[] args) {
            CheckBinary b=new CheckBinary();
            root=new Node(70);
            root.left=new Node(50);
            root.left.left=new Node(30);
             root.left.right=new Node(60);
             root.right=new Node(100);
              root.right.left=new Node(90);
             root.right.right=new Node(150);
             if(BST(root))
             {
                 System.out.println("It is a Binary Search Tree");
             }
             else
             {
                 System.out.println("It is not a Binary Search Tree");
             }
    }

}

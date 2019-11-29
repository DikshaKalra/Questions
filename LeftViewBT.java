package dailyquestions;
 class Node1
{
    int data;
    Node1 left,right;
    public Node1(int item)
    {
        data=item;
        left=right=null;
    }
}
public class LeftViewBT
{
    Node1 root;
    void printview()
    {
        print(root,1);
    }
    static int lv=0;
    void print(Node1 root,int n)
    {
        if(root==null)
            return;
        if(lv<n)
        {
            System.out.println(root.data + " ");
            lv=n;
        }

        print(root.left,n+1);
        print(root.right,n+1);
    }
    public static void main(String args[])
    {
        LeftViewBT l =new LeftViewBT();
        l.root=new Node1(1);
        l.root.left=new Node1(2);
        l.root.right=new Node1(3);
        l.root.left.left=new Node1(4);
        l.root.left.right = new Node1(5);
        l.root.right.right=new Node1(6);
        l.root.right.right.left = new Node1(7);
        l.root.right.right.left.right = new Node1(8);
        l.printview();


    }
}

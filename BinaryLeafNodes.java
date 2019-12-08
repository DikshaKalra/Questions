package dailyquestions;
public class BinaryLeafNodes{
	static Node root;
	public static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	public BinaryLeafNodes() {
		root = null;
	}
	public BinaryLeafNodes(int data) {
		root = new Node(data);
	}
	public static void printLeafNodes(Node root) {
		if(root!=null) {
			printLeafNodes(root.left);
			if(root.left==null&&root.right==null)
				System.out.println(root.data);
			printLeafNodes(root.right);
		}
	}
	public static void main(String args[]) {
		BinaryLeafNodes ln = new BinaryLeafNodes();
		root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		printLeafNodes(root);

	}
}

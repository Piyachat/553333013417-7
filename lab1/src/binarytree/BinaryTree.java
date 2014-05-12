package binarytree;

public class BinaryTree {
	static class Node {
		Object element;
		Node left, right;

		Node(Object e, Node l, Node r) {
			element = e;
			left = l;
			right = r;
		}
		public boolean isLeaf() {
			return left == null && right == null;
		}
	}
	Node root;
	public int numberNodes() {
		return numNodes(root);
	}
	public int numNodes(Node node) {
		if (node == null)
			return 0;
		return 1 + numNodes(node.left) + numNodes(node.right);
	}

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		Node right3 = new Node("f",null,null);
		Node right2 = new Node("e",null,null);
		Node left2 = new Node("d", null, null);
		Node left1 = new Node("b", left2, right2);
		Node right1 = new Node("c",null, right3);
		Node root = new Node("a", left1, right1);
		binaryTree.root = root;
		System.out.println(binaryTree.numberNodes());
	}
//***************************************************************************
	public abstract class Visitor {
		public abstract void visit(Object e);
	}
	void preOrder(Node r, Visitor v) {
		if (r == null)
			return;
		v.visit(r.element);
		preOrder(r.left, v);
		preOrder(r.right, v);
	}
	void inOrder(Node r,Visitor v){
		if(r == null)
			return;
		inOrder(r.left,v);
		v.visit(r.element);
		inOrder(r.right, v);	
	}
	void postOrder(Node r,Visitor v){
		if(r == null)
			return;
		postOrder(r.left, v);
		postOrder(r.right, v);
		v.visit(r.element);
		
	}
	public Object[] toArray() {
		final Object[] a = new Object[numNodes(root)];
		Visitor v = new Visitor() {
			int k = 0;

			public void visit(Object e) {
				a[k++] = e;

			}
		};
		preOrder(root, v);
		return a;
	}
}
//*****************************************************************************


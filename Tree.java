
class Node {
	public int value;
	public Node lchild;
	public Node rchild;
	
	public Node() {
		
	}
	
	public Node(int value) {
		this.value = value;
		lchild = null;
		rchild = null;
	}
}

class BSTree {

	public Node root = null;
	
	public BSTree() {
		
	}
	
	public void insert(Node node) {
		root = insert(this.root, node);
	}
	
	private Node insert(Node root, Node node) {
		if (root == null) {
			return node;
		} else if (node.value > root.value) {
			root.rchild = insert(root.rchild, node);
		} else {
			root.lchild = insert(root.lchild, node);
		}
		return root;
	}
	
	public void print() {
		print(root);
	}
	
	private void print(Node root) {
		if (root == null)
			return;
		print(root.lchild);
		System.out.println(root.value + ", ");		
		print(root.rchild);
	}
}


public class Tree {

	public static void main(String[] args) {
		BSTree t = new BSTree();
		t.insert(new Node(100));
		t.insert(new Node(32));
		t.insert(new Node(200));
		t.print();
		
	}
}

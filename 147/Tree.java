
class Node {
	public int data;
	public Node rchild;
	public Node lchild;

	public Node(int data) {
		this.data = data;
		this.rchild = null;
		this.lchild = null;
	}
}


class BinaryTree {

	public Node root;
	
	public BinaryTree() {
		root = null;
	}

	//--------------------------------------------------
	public void insert(Node node) {
		this.root = insert_helper(this.root, node);
	}

	private Node insert_helper(Node root, Node node) {
		if (root == null) {
			return node;
		}
		
		if (node.data > root.data) { // goes right
			root.rchild = insert_helper(root.rchild, node);
		} else {
			root.lchild = insert_helper(root.lchild, node);
		}
	
		return root;
	} 
	
	//----------------------------------------------------
	// here is the main issue
	public void levelOrder() {
		int n = this.getLevel();
		levelOrder_aux(0, n);
	}

	private void levelOrder_aux(int level, int n) {
		if (level < n) {
			levelOrder_helper(root, level);
			levelOrder_aux(level + 1, n);
		}
	}

	private void levelOrder_helper(Node root, int level) {
		if (root == null) {
			return;
		}

		if (level == 0) {
			System.out.println(root.data);
			return;
		}

		levelOrder_helper(root.lchild, level-1);
		levelOrder_helper(root.rchild, level-1);
	}
		

	//-------------------------------------------------------
	public void inOrder() {
		inOrder_helper(this.root);
	}

	private void inOrder_helper(Node root) {
		if (root != null) {
			inOrder_helper(root.lchild);
			System.out.println(root.data);
			inOrder_helper(root.rchild);
		}
	}

	//----------------------------------------------------------
	public int getLevel() {
		return this.getLevel_helper(this.root);
	}

	private int getLevel_helper(Node root) {
		if (root == null) {
			return 0;
		}

		return max(1 + getLevel_helper(root.lchild), 1 + getLevel_helper(root.rchild));
	}

	private int max(int a, int b) {
		return a > b ? a : b;
	}

	//-------------------------------------------------------------
	
	public int nleaf() {
		return this.nleaf_helper(this.root);
	}

	public int nleaf_helper(Node root) {
		if (root == null) {
			return 0;
		}

		return (nleaf_helper(root.lchild) + 1) + (nleaf_helper(root.rchild));
	}
}


public class Tree {
	
	public static void main(String[] args) {
		Node n1 = new Node(5);
		Node n2 = new Node(2);
		Node n3 = new Node(7);
		Node n4 = new Node(1);
		Node n5 = new Node(9);

		BinaryTree bt = new BinaryTree();

		bt.insert(n1);
		bt.insert(n2);
		bt.insert(n3);
		bt.insert(n4);
		bt.insert(n5);

		// output  : 1, 2, 5, 7, 9
		bt.inOrder();
	
		int level = bt.getLevel();
		System.out.println("level : " + level);

		bt.levelOrder();

		System.out.println("nleaf : " + bt.nleaf());
	}
}

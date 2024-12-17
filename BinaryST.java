import java.util.*;

class node {
	int data;
	node lchild, rchild;
}

class bst extends node {
	void createTree(node temp, node q, int y) {
		if(y < temp.data) {
			if(temp.lchild == null) {
				temp.lchild = q;
			} else {
				createTree(temp.lchild, q, y);
			}
		}
		else if(y > temp.data) {
			if(temp.rchild == null) {
				temp.rchild = q;
			} else {
				createTree(temp.rchild, q, y);
			}
		}
	}
	
	void preorder(node root) {
	    if (root != null) {
	        System.out.print(root.data);
	        preorder(root.lchild);
	        preorder(root.rchild);
	    }
	}

	void postorder(node root) {
	    if (root != null) {
	        postorder(root.lchild);
	        postorder(root.rchild);
	        System.out.print(root.data);
	    }
	}
	
	void inorder(node root) {
	    if (root != null) {
	        inorder(root.lchild);
	        System.out.print(root.data);
	        inorder(root.rchild);
	    }
	}
}

class BinaryST {
	public static void main(String args[]) {
		node p, q, root, temp;
		int x, y, n, ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number nodes to be inserted");
		n = sc.nextInt();
		root = null;
		
		if(root == null) {
			p = new node();
			System.out.println("Enter the root element");
			x = sc.nextInt();
			p.data = x;
			p.lchild = null;
			p.rchild = null;
			root = p;
		}
		bst obj = new bst();
		
		for(int i = 1; i < n; i++) {
			temp = root;
			q = new node();
			System.out.println("Enter " + i + " element");
			y = sc.nextInt();
			q.data = y;
			q.lchild = null;
			q.rchild = null;
			obj.createTree(temp, q, y);
		}
		
		while (true) {
		    System.out.println("\nTraverse Options\n1.Inorder Tree\n2.Preorder Tree\n3.Postorder Tree\n4.Exit\nEnter option:");
		    ch = sc.nextInt();
		    switch (ch) {
		    case 1:
		        System.out.println("Inorder Tree");
				System.out.print("[");
		        obj.inorder(root);
				System.out.print("]");
		        break;
		    case 2:
				System.out.println("Preorder Tree");
				System.out.print("[");
		        obj.preorder(root);
				System.out.print("]");
		        break;
		    case 3:
		        System.out.println("Postorder Tree");
				System.out.print("[");
		        obj.postorder(root);
				System.out.print("]");
		        break;
			case 4:
				System.exit(0);
		    default:
		        System.out.println("Invalid Option");
		    }
		}
	}
}
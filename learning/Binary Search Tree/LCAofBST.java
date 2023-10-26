class BinarySearchTree {

	// Class containing left
	// and right child of current node
	// and key value
	class Node {
		int key;
		Node left, right;

		public Node(int item)
		{
			key = item;
			left = right = null;
		}
	}

	// Root of BST
	Node root;

	// Constructor
	BinarySearchTree() { root = null; }

	BinarySearchTree(int value) { root = new Node(value); }

	// This method mainly calls insertRec()
	void insert(int key) { root = insertRec(root, key); }

	// A recursive function to
	// insert a new key in BST
	Node insertRec(Node root, int key)
	{
		// If the tree is empty,
		// return a new node
		if (root == null) {
			root = new Node(key);
			return root;
		}

		// Otherwise, recur down the tree
		else if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		// Return the (unchanged) node pointer
		return root;
	}

	// This method mainly calls InorderRec()
	void inorder() { inorderRec(root); }

	// A utility function to
	// do inorder traversal of BST
	void inorderRec(Node root)
	{
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}
	}

    Node LCA(Node root,Node p,Node q)
    {
        if(p.key>root.key && q.key>root.key)
        {
         return LCA(root.right,p,q);
        }
        else if(p.key<root.key && q.key<root.key)
        {
             return LCA(root.left,p,q);
        }
        else
         return root;
    }

}


public class LCAofBST {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(6);
        tree.insert(2);
        tree.insert(8);
        tree.insert(0);
        tree.insert(4);
        tree.insert(7);
        tree.insert(9);
        tree.insert(3);
        tree.insert(5);
        tree.inorderRec(tree.LCA(tree.root, tree.root.left.left, tree.root.left.right));
        System.out.println();

        tree.inorder();
    }
    
}

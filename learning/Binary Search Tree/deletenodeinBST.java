// time complexity is O(h)
// space complexity is O(h)
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

   
        
        public int successor(Node root)
        {
            root = root.right;
            while(root.left != null)
            {
                root = root.left;
            }
            return root.key;
        }
        public int precedessor(Node root)
        {
            root = root.left;
            while(root.right != null)
            {
                root = root.right;
            }
            return root.key;
        }

        public Node deleteNode (Node root,int val)
        {
            // base case
            if(root == null)
            {
                return null;
            }
            // to search the node to be deleted
            // left side 
            if(val<root.key)
            {
                root.left = deleteNode(root.left, val);
            }
            // right side 
            else if(val > root.key)
            {
                root.right = deleteNode(root.right, val);
            } 
            else 
			{
                // depending on the cases
                // leaf node
                if(root.left==null && root.right==null)
                {
                    root = null;
                } 
                // non leaf node 
                else if(root.right!=null)
                {
                    root.key = successor(root);
                    root.right = deleteNode(root.right,root.key);
                }
                else{
                root.key = precedessor(root);
                root.left = deleteNode(root.left,root.key);
            }  
            }
        return root;
	    }      

	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(100);
		tree.insert(70);
		tree.insert(120);
		tree.insert(140);
		tree.insert(110);
		tree.insert(90);
		tree.insert(60);

		// Print inorder traversal of the BST
		tree.inorder();
        tree.deleteNode(tree.root,120);
        tree.inorder();
	}
}



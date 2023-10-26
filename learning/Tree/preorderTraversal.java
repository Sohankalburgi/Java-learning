import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int data)
    {
        val=data;
        left=null;
        right=null;
    }
}
class preorder{
public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversalHelper(root, result);
        return result;
    }

    private static void preorderTraversalHelper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        // Visit the current node and add it to the result list
        result.add(root.val);

        // Recursively traverse the left subtree
        preorderTraversalHelper(root.left, result);

        // Recursively traverse the right subtree
        preorderTraversalHelper(root.right, result);
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Perform preorder traversal and get the result as an ArrayList
        List<Integer> preorderResult = preorderTraversal(root);

        // Print the result
        System.out.println("Preorder traversal result: " + preorderResult);
    }
}

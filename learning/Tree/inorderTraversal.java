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


public class inorderTraversal
{
    static ArrayList<Integer> result = new ArrayList<>();
    static public ArrayList<Integer> inorderTraversal(TreeNode root)
    {
        if(root==null)
        {
            return result;
        }
        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);
        return result;
    }
    
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Perform preorder traversal and get the result as an ArrayList
        List<Integer> inorderResult = inorderTraversal(root);

        // Print the result
        System.out.println("inorder traversal result: " + inorderResult);
    }
}
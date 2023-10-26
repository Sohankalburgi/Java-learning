import java.util.*;

class Node 
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left = null;
        right=null;
    }
}

class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    ArrayList<Integer> result = new ArrayList<>();
    ArrayList<Integer> inOrderTraversal(Node root)
    {
        if(root==null)
            return result;
        inOrderTraversal(root.left);
        result.add(root.data);
        inOrderTraversal(root.right);
        return result;
    }
    
    boolean isBST(Node root)
    {
        // code here.
        if(root==null)
            return true;
        inOrderTraversal(root);
        
        //to check the is it sorted or not to check BSt or not 
        for(int i=0;i<result.size()-1;i++)
        {
            if(result.get(i)>=result.get(i+1))
                return false;
        }
        return true;
    }
}

public class CheckValidBST
{   
    public static void main(String[] args) {
        
        
    }
}
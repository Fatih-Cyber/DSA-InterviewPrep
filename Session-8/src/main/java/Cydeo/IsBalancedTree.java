package Cydeo;

public class IsBalancedTree {
    public static void main(String[] args) {

    }
    /// O(n)
    public boolean isBalanced(Node root) {
        if (root == null)  return true;
        if (height(root) == -1)  return false;   //any imbalance will return -1...
        return true;
    }
    // this is not a regular height method
    public int height(Node root) {
        // Termination case...
        if (root == null)  return 0;
        int leftHeight = height(root.leftChild);
        int rightHeight = height(root.rightChild);
        // In case of left subtree or right subtree unbalanced, return -1...
        if (Math.abs(leftHeight - rightHeight) > 1 || leftHeight == -1 || rightHeight == -1)  return -1;
        return 1+ Math.max(leftHeight, rightHeight) ;  // Otherwise, return the height of this subtree ...
    }
}

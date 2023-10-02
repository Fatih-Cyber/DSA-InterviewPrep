package Cydeo;

public class IsBalancedTree2 {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(3);
        tree.insert(4);
        tree.insert(4);
    }
    // O(n^2 top down approach)
    public boolean isBalanced(Node root){
        if (root==null) return true;
        if (Math.abs(height(root.leftChild)-height(root.rightChild))>1) return false;
        return isBalanced(root.leftChild) && isBalanced(root.rightChild);

    }
    public int height(Node node){
        if (node ==null) return 0;
        return 1+ Math.max(height(node.leftChild), height(node.rightChild));
    }
}

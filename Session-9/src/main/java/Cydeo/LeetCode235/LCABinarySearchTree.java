package Cydeo.LeetCode235;
// LeetCode 235
public class LCABinarySearchTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(6);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(8);
        TreeNode node4=new TreeNode(0);
        TreeNode node5=new TreeNode(4);
        TreeNode node6=new TreeNode(7);
        TreeNode node7=new TreeNode(9);
        TreeNode node8=new TreeNode(3);
        TreeNode node9=new TreeNode(5);
        root.left=node2;
        root.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node3.right=node7;
        node5.left=node8;
        node5.right=node9;
        System.out.println(lowestCommonAncestor(root, node9, node4).val);
    }

        public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root.val > Math.max(p.val, q.val))
                return lowestCommonAncestor(root.left, p, q);
            if (root.val < Math.min(p.val, q.val))
                return lowestCommonAncestor(root.right, p, q);
            return root;
        }

}
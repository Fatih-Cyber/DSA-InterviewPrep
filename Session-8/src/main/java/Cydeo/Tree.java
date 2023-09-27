package Cydeo;

import java.util.ArrayList;

public class Tree {
    private Node root;

    public Tree() {
    }

    public Node getRoot() {
        return root;
    }

    // isEmpty
    boolean isEmpty(){
        return root==null;
    }
    // insert method
    void insert(int data){
        // create node object with data
        Node newNode=new Node(data);
        // if isempty insert as a root
        if (isEmpty()) {
            root=newNode;
            return;
        }
        Node current=root; // starting point for iteration/search
        while(true){// find a place for the node
            if(data< current.value){
                if (current.leftChild==null) {
                    current.leftChild=newNode;
                    break;
                } else current=current.leftChild;
            }
            else if (data> current.value) {
                if (current.rightChild==null) {
                    current.rightChild=newNode;
                    break;
                } else current=current.rightChild;
            } else break;
        }

    }
    // find_path method
    ArrayList<Integer> find_path(int value){
        ArrayList<Integer> result=new ArrayList<>();
        if (isEmpty()) return result;
        Node current=root;
        while(current!=null){
            if(value<current.value){
                result.add(current.value);
                current=current.leftChild;
            }
            else if (value> current.value) {
                result.add(current.value);
                current=current.rightChild;
            }else {
                result.add(current.value);
                return result;
            }
        }
        return result;
    }
    public boolean isBalanced(Node root) {
        // If the tree is empty, it’s balanced...
        if (root == null)  return true;
        // if there is any imbalance Height Function will return -1...
        if (Height(root) == -1)  return false;
        return true;
    }
     // this is not a regular height method
    public int Height(Node root) {
        // Termination case...
        if (root == null)  return 0;
        // Height of left subtree...
        int leftHeight = Height(root.leftChild);
        // Height of height subtree...
        int rightHeight = Height(root.rightChild);
        // In case of left subtree or right subtree unbalanced, return -1...
        if (leftHeight == -1 || rightHeight == -1)  return -1;
        // If their heights differ by more than ‘1’, return -1...
        if (Math.abs(leftHeight - rightHeight) > 1)  return -1;
        // Otherwise, return the height of this subtree as max(leftHeight, rightHight) + 1...
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

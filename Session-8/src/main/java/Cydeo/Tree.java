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
}

package Cydeo;

public class RemoveDuplicates {
    public static Node removeDuplicates(Node head){
        Node current=head;
        while (current != null) {
            Node nextDistinctNode = current.next;
            while (nextDistinctNode != null && nextDistinctNode.value == current.value){
                nextDistinctNode = nextDistinctNode.next;
            }
            current.next = nextDistinctNode;
            current = nextDistinctNode;
        }
        return head;
    }
}

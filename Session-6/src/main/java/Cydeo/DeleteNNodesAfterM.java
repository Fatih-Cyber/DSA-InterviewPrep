package Cydeo;

public class DeleteNNodesAfterM {
    public static void main(String[] args) {

    }
    public static Node deleteNNodesAfterM(Node head, int m, int n){
        Node curr=head;
        int count=0;
        while (curr!=null)
        {
            // Skip M nodes
            for (count = 1; count < m && curr != null; count++) curr = curr.next;
            if (curr == null) return head;

            // Start from next node and delete N nodes
            Node temp = curr.next;
            for (count = 1; count <= n && temp != null; count++) {
                temp = temp.next;
            }

            // Link the previous list with remaining nodes
            curr.next = temp;

            // Set current pointer for next iteration
            curr = temp;

        }
        return head;
    }
}

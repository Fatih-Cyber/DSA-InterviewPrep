package Cydeo;

public class NodeDetectApp {
    public static void main(String[] args) {
        Node node1=new Node(3);
        Node node2=new Node(2);
        Node node3=new Node(0);
        Node node4=new Node(-4);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node2;
        Node current=node1;
        while(current!=null) {
            System.out.println(current.val);
            current=current.next;
        }
    }
}

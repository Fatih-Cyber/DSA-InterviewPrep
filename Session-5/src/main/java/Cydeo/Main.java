package Cydeo;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(2);
        Node n5 = new Node(3);
        Node n6 = new Node(3);
        Node n7 = new Node(3);
        Node n8 = new Node(8);
        Node n9 = new Node(8);
        Node n10 = new Node(9);
        Node n11 = new Node(9);
        Node n12 = new Node(9);
        n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;
        n5.next=n6;n6.next=n7;n7.next=n8;n8.next=n9;
        n9.next=n10;n10.next=n11;n11.next=n12;
    }

}
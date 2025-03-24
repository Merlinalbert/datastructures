package DAY2;
public class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    } 
    public LinkedList() {
        head = null;
    }
    public void insertAtBegin(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.display();  
    }
}

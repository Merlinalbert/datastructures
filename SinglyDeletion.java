package DAY3;
public class SinglyDeletion {
    static class Node {
        int data;
        Node next;
        Node(int val) { data = val; next = null; }
    }
    Node head;
    public void insertAtBegin(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
    public void deleteAtBegin() {
        if (head != null) head = head.next;
    }
    public void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) { head = null; return; }
        Node temp = head;
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    public void deleteByValue(int val) {
        if (head == null) return;
        if (head.data == val) { head = head.next; return; }
        Node temp = head;
        while (temp.next != null && temp.next.data != val) {
            temp = temp.next;
        }
        if (temp.next != null) temp.next = temp.next.next;
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
        SinglyDeletion list = new SinglyDeletion();
        list.insertAtBegin(89);
        list.insertAtBegin(90);
        list.insertAtBegin(100);
        list.display();  
        list.deleteAtBegin();
        list.display();  
        list.deleteAtEnd();
        list.display(); 
        list.deleteByValue(60);
        list.display();  
    }
}


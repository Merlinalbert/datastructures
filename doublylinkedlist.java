package DAY4;
class Node {
    int data;
    Node next, prev;
    Node(int data) { this.data = data; }
}
public class doublylinkedlist {
    Node head;
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) head = newNode;
        else {
            Node last = head;
            while (last.next != null) last = last.next;
            last.next = newNode;
            newNode.prev = last;
        }
    }
    public void printForward() {
        for (Node curr = head; curr != null; curr = curr.next) 
            System.out.print(curr.data + " ");
        System.out.println();
    }
    public void printBackward() {
        if (head == null) return;
        Node last = head;
        while (last.next != null) last = last.next;
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        doublylinkedlist dll = new doublylinkedlist();
        dll.append(10);
        dll.append(20);
        dll.append(30);
        System.out.print("Forward: ");
        dll.printForward();  
        System.out.print("Backward: ");
        dll.printBackward(); 
    }
}


package DAY2;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class reverselinkedlist {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head;
        while (current != null) {
            ListNode next = current.next;  
            current.next = prev;          
            prev = current;                
            current = next;                
        }
        return prev;  
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        printList(reverseList(head));  
    }
}


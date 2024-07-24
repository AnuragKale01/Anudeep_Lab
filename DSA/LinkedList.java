package DSA;
//Write Java code to reverse a singly linked list in-place. Implement a method void reverse() that reverses the order of nodes in the linked list. To keep the problem simple use data type of list data as int instead of generic type.
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedList {
    private ListNode head;

    // Method to reverse the linked list in-place
    public void reverse() {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    // Method to add a node at the end of the linked list
    public void add(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding nodes to the linked list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original Linked List:");
        list.printList();

        // Reversing the linked list
        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList();
    }
}

package DSA;
//Write a java class to append two lists. For example, if list1 is {22, 33, 44, 55} and list2 is {66, 77, 88, 99}, then list1.appendList( list2) will change list1 to {22, 33, 44, 55, 44, 55, 66, 77, 88}. Use data type of list data as int. Hints: Note that no new nodes are created by this method. In the append method just add the elements of the second list one at a time
class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int val) {
        this.val = val;
    }
}

public class AppendLinkedList {
    private ListNode1 head;

    // Method to add a node at the end of the linked list
    public void add(int val) {
        ListNode1 newNode = new ListNode1(val);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method to append the elements of the second list to the end of the first list
    public void appendList(AppendLinkedList list2) {
        if (list2 == null || list2.head == null) {
            return; // No elements to append
        }

        ListNode1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = list2.head;
    }

    // Method to print the linked list
    public void printList() {
        ListNode1 temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        AppendLinkedList list1 = new AppendLinkedList();
        AppendLinkedList list2 = new AppendLinkedList();

        // Adding nodes to list1
        list1.add(22);
        list1.add(33);
        list1.add(44);
        list1.add(55);

        // Adding nodes to list2
        list2.add(66);
        list2.add(77);
        list2.add(88);
        list2.add(99);

        System.out.println("Original List 1:");
        list1.printList();

        System.out.println("List 2 to append:");
        list2.printList();

        // Appending list2 to list1
        list1.appendList(list2);

        System.out.println("After appending List 2 to List 1:");
        list1.printList();
    }
}

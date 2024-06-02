package LinkedList;

public class RemoveNthNodeFromEnd extends PrintLL {

    public static Node deleteNthFromEnd(Node head, int n) {
        // calculate size
        int size = 0;
        Node temp = head;
        // Count the number of nodes in the linked list
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        // If the node to remove is the head node
        if (n == size) {
            head = head.next;
            return head;
        }
        // Find the index of the node to remove
        int idxToFind = size - n;

        // If the node to remove is the first node
        if (idxToFind == 0) {
            head.next = head.next.next;
            return head;
        }

        // Find the previous node to the node to remove
        Node prev = head;
        int idx = 0;
        while (idx < idxToFind - 1) {
            prev = prev.next;
            idx++;
        }

        // Remove the node
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        // RemoveNthNodeFromEnd ll = new RemoveNthNodeFromEnd();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        print(head);
        head = deleteNthFromEnd(head, 5);
        print(head);
    }

}

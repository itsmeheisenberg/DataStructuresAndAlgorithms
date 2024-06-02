package LinkedList;

public class PrintLL {
        public static void print(Node head) {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

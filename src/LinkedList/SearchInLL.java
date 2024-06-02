package LinkedList;

/*Search for a key in a Linked List. Return the position where it is found. If not found, return -1 */
public class SearchInLL {
    public static Node head;
    public static Node tail;
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public void addFirst(int data) {
        // Step I : create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step II : newNode next = head
        newNode.next = head;
        // Step III : head = newNode
        head = newNode;

    }
    
    public int itrSearch(int key) {  //O(n)
        Node temp = head;
        int i = 0;
        while (temp != null) {
            // Key Found
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // Key not found
        return -1;
    }
    
    public static void main(String[] args) {
        SearchInLL ll = new SearchInLL();
        ll.addFirst(19);
        ll.addFirst(53);
        ll.addFirst(41);
        ll.addFirst(17);
        ll.addFirst(3);
        ll.addFirst(62);
        System.out.println(ll.itrSearch(17));
        System.out.println(ll.itrSearch(99));
    }
}

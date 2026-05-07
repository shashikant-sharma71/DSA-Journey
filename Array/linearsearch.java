
class Node {
    int data;
    Node next;

    // Constructor with next
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor without next
    Node(int data1) {
        data = data1;
        next = null;
    }
}

public class linearsearch {

    // Traversal
    public static void traversal(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Length
    public static int length(Node head) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    
        int[] arr = {2, 3, 4, 5, 9, 8, 7, 10};

        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        traversal(head);
        System.out.println();

        System.out.println(head.next.data);

        System.out.println(length(head));
    
}
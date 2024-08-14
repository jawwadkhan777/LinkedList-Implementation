public class LinkedList<T> {
    Node<T> head;

    public LinkedList() {
        System.out.println("Linked List Implementation:");
        System.out.println("---------------------------");
    }

    // this method inserts value at the end of the linked list
    public void insert(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;

        if (head == null) {
            head =  node;  //respective node assigned to head as a starting node
        } else {
            Node<T> n = head;
            while(n.next!=null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    //this method inserts value at the start of the linked list
    public void insertAtBegin(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = head;
        head = node;

    }

    //this method inserts value at the given index of the linked list
    public void insertAt(int index, T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;

        if (index==0) {
            insertAtBegin(data);
        } else {
            Node<T> n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    //this method deletes data at the given index of the linked list
    public void deleteAt(int index) {
        if (index==0) {
            System.out.println(head.data + " deleted from index " + index);
            head = head.next;
        } else {
            Node<T> n = head;
            for (int i=0; i<index-1; i++) {
                n = n.next;
            }
            Node<T> n1 = n.next;
            n.next = n1.next;
            System.out.println(n1.data + " deleted from index " + index);
            n1 = null; //nullify the object
        }
    }

    //this method prints the values of linked list
    public void display() {
        Node<T> node = head;
        while (node.next!=null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(node.data);

    }
}

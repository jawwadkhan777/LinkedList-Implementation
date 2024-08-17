package concept.cll;

public class CircularLinkedList<C> {
    Node<C> head;

    public CircularLinkedList() {
        System.out.println("Circular Linked List Implementation:");
        System.out.println("------------------------------------");
    }

    // this method inserts value at the end of the linked list
    public void insert(C data) {
        Node<C> node = new Node<>();
        node.data = data;
//        node.next = null;

        if (head==null) {
            head = node;
            head.next = head;
        } else {
            Node<C> tempNode = head;
            do {
                tempNode = tempNode.next;
            } while (tempNode.next!=head);
            tempNode.next = node;
            node.next = head;

        }
//        System.out.println(node.next.data);
    }

    //this method inserts value at the start of the linked list
    public void insertAtBegin(C data) {
        Node<C> node = new Node<>();
        node.data = data;
        node.next = head;

        Node<C> tempNode = head;
        do {
            tempNode = tempNode.next;
        } while (tempNode.next!=head);
        head = node;
        tempNode.next = head;
    }

    //this method inserts value at the given index of the linked list
    public void insertAt(int index, C data) {
        if (index==0) {
//            insertAtBegin(data);
        } else {
            Node<C> node = new Node<>();
            node.data = data;
//            node.next = null;
            Node<C> tempNode = head;
            try {
                for (int i = 1; i < index; i++) {
                    tempNode = tempNode.next;
                }
                node.next = tempNode.next;
                tempNode.next = node;
            } catch (NullPointerException exception) {
//                System.out.println(exception.getMessage());
                System.out.println("Given index is out of reach, not added!");
            }

        }

    }

    //this method deletes data from the linked list
    public void delete(C data) {
        Node<C> tempNode = head;
        int positionCounter = 1;

        if (tempNode==null) {
            System.out.println("nothing in the list");
        } else if (tempNode.data==data) {
            do {
                tempNode = tempNode.next;
            } while (tempNode.next!=head);
            System.out.println(head.data + " deleted from location " + positionCounter);
            head = head.next;
            tempNode.next = head;
        } else {
            do {
                Node<C> deletedNode = tempNode.next;
                positionCounter++;
                if (deletedNode.data == data) {
                    System.out.println(deletedNode.data + " deleted from location " + positionCounter);
                    tempNode.next = deletedNode.next;
                    return;
                }
                tempNode = tempNode.next;
            } while (tempNode!=head);

            System.out.print("List has no such data!");
        }

    }

    //this method prints the values of linked list
    public void display() {
        try {
            Node<C> tempNode = head;
            do {
                System.out.print(tempNode.data + " -> ");
                tempNode = tempNode.next;
            } while (tempNode != head);

            System.out.println("head");
        } catch (NullPointerException exception) {
            System.out.println("null");
        }
    }

    //this method search the given element present in the linked list or not
    public void search(C data) {
        Node<C> tempNode = head;
        int locationCounter = 1;
        do {
            if (tempNode.data==data) {
                System.out.println("Element "+data+" found at location "+locationCounter);
                return;
            }
            tempNode = tempNode.next;
            locationCounter++;
        } while (tempNode!=head);
        System.out.println("Element "+data+" is not found!");
    }
}

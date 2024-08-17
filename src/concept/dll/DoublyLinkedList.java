package concept.dll;

public class DoublyLinkedList<T> {
    Node<T> head;

    public DoublyLinkedList() {
        System.out.println("Doubly Linked List Implementation:");
        System.out.println("----------------------------------");
    }

    // this method inserts value at the end of the linked list
    public void insert(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;
//        node.previous = null;

        if(head==null) {
            node.previous = null;
            head = node;
        } else {
            Node tempNode = head;
            while (tempNode.next!=null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
            node.previous = tempNode;
        }
    }

    //this method inserts value at the start of the linked list
    public void insertAtStart(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.previous = null;
        node.next = head;
        if (head!=null) {
            head.previous = node;
        }
        head = node;
    }

    //this method inserts value at the given index of the linked list
    public void insertAt(int index, T data) {
        if (index==0) {
            insertAtStart(data);
        } else {
            Node<T> node = new Node<>();
            node.data = data;
            Node<T> tempNode = head;
            try {
                for (int i = 1; i < index; i++) {
                    tempNode = tempNode.next;
                }
                node.next = tempNode.next;
                node.previous = tempNode;
                tempNode.next = node;
                if (node.next!=null) {
                    node.next.previous = node;
                }
            }catch (NullPointerException exception) {
                System.out.println("Given index is out of reach, not added!");
            }
        }
    }

    //this method deletes data at the given index of the linked list
    public void deleteAt(int index) {
        if (index==0) {
            System.out.println(head.data + " deleted from location " + (index+1));
            head = head.next;
            head.next.previous = null;
        } else {
            Node<T> tempNode = head;
            try {
                for (int i = 1; i < index; i++) {
                    tempNode = tempNode.next;
                }
                Node<T> deletedNode = tempNode.next;
                tempNode.next = deletedNode.next;
                if (deletedNode.next != null) {
                    deletedNode.next.previous = tempNode;
                }
                System.out.println(deletedNode.data + " deleted from location " + (index + 1));
            } catch (NullPointerException exception) {
                System.out.println("Given index is out of reach, not deleted!");
            }
        }
    }

    //this method prints the values of linked list
    public void display() {
        Node<T> tempNode = head;
        Node<T> reverseNode = null;
        System.out.print("null");
        while (tempNode!=null) {
            System.out.print(" <- " + tempNode.data + " -> ");
            reverseNode = tempNode;
            tempNode = tempNode.next;
        }
        System.out.println("null");
        System.out.print("List in reverse order: null");
        while (reverseNode!=null) {
            System.out.print(" <- " + reverseNode.data + " -> ");
            reverseNode = reverseNode.previous;
        }
        System.out.println("null");
    }

    //this method search the given element present in the linked list or not
    public void search(T data) {
        Node<T> node = head;
        int locationCounter = 1;
        while(node!=null) {
            if (node.data==data) {
                System.out.println("Element "+data+" found at location "+locationCounter);
                return;
            } else {
                node = node.next;
                locationCounter++;
            }
        }
        System.out.println("Element "+data+" is not found!");
    }
}

package concept.sll;

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
        node.next = null; //there is no need, its already null

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

        if (index==0) {
            insertAtBegin(data);
        } else {
            Node<T> node = new Node<>();
            node.data = data;
//            node.next = null;
            Node<T> n = head;
            try {
                for (int i = 1; i < index; i++) {
                    n = n.next;
                }
                node.next = n.next;
                n.next = node;
            } catch (NullPointerException exception) {
//                System.out.println(exception.getMessage());
                System.out.println("Given index is out of reach, not added!");
            }

        }
    }

    //this method deletes data at the given index of the linked list
    public void deleteAt(int index) {
        if (head==null) {
            System.out.println("nothing in the list");
        } else if (index==0) {
            System.out.println(head.data + " deleted from location " + (index+1));
            head = head.next;
        } else {
            Node<T> n = head;
            try {
                for (int i = 1; i < index; i++) {
                    n = n.next;
                }
                Node<T> n1 = n.next;
                n.next = n1.next;
                System.out.println(n1.data + " deleted from location " + (index + 1));
//                n1 = null; //nullify the object
            } catch (NullPointerException exception) {
                System.out.println("Given index is out of reach, not deleted!");
            }
        }
    }

    //this method deletes data from the linked list
    public void delete(T data) {
        Node<T> tempNode = head;
        int positionCounter = 1;

        if (tempNode==null) {
            System.out.println("nothing in the list");
        } else if (tempNode.data==data) {
            System.out.println(head.data + " deleted from location " + positionCounter);
            head = head.next;
        } else {
            while (tempNode.next!=null) {
                Node<T> deletedNode = tempNode.next;
                positionCounter++;
                if (deletedNode.data == data) {
                    System.out.println(deletedNode.data + " deleted from location " + positionCounter);
                    tempNode.next = deletedNode.next;
                    return;
                }
                tempNode = tempNode.next;
            }
            System.out.print("List has no such data!");
        }
    }

    //this method prints the values of linked list
    public void display() {
        Node<T> node = head;
        while (node!=null) {
            System.out.print(node.data + " -> ");
            node = node.next;
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

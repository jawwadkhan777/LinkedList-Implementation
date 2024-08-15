package com.project;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insert(5);
        linkedList.insert(7);
        linkedList.insert(11);

        linkedList.display();

        linkedList.insertAtBegin(2);

        linkedList.display();

        linkedList.insertAt(2, 6);
        linkedList.insertAt(0, 77);
        linkedList.insertAt(8, 15);

        linkedList.display();

        linkedList.deleteAt(0);
        linkedList.display();

        linkedList.deleteAt(7);
        linkedList.display();

        linkedList.search(11);
    }
}
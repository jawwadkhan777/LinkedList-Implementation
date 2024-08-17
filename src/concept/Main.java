package concept;//package com;

import concept.cll.CircularLinkedList;
import concept.dll.DoublyLinkedList;
import concept.sll.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();
        lList.insert(5);
        lList.insert(7);
        lList.insert(11);
        lList.display();

        lList.insertAtBegin(2);
        lList.display();

        lList.insertAt(2, 6);
        lList.display();

        lList.insertAt(0, 77);
        lList.display();

        lList.insertAt(8, 15);
        lList.display();

        lList.deleteAt(0);
        lList.display();

        lList.deleteAt(7);
        lList.display();

        lList.delete(11);
        lList.display();

        lList.search(7);


        System.out.println(".................................................");


        DoublyLinkedList<Integer> dList = new DoublyLinkedList<>();
        dList.insert(5);
        dList.insert(2);
        dList.insert(10);
        dList.display();

        dList.reverse();

        dList.insertAtStart(77);
        dList.display();

        dList.insertAt(2, 101);
        dList.display();

        dList.insertAt(10, 777);
        dList.display();

        dList.deleteAt(2);
        dList.display();

        dList.search(10);


        System.out.println(".................................................");


        CircularLinkedList<Integer> cList = new CircularLinkedList<>();

        cList.display();

        cList.delete(10);

        cList.insert(7);
        cList.insert(1);
        cList.insert(11);
        cList.display();

        cList.insertAtBegin(33);
        cList.display();

        cList.insertAt(3, 55);
        cList.display();

        cList.delete(1);
        cList.display();

        cList.search(33);

    }
}

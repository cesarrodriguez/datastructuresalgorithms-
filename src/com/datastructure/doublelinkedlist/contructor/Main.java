package com.datastructure.doublelinkedlist.contructor;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.print();


        myDLL.append(6);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.print();

    }
}

package com.datastructure.doublelinkedlist.contructor;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int length;

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        tail = newNode;
        head = newNode;
        length = 1;
    }

    public void append(int value){
        if(head == null){
            return;
        }

        Node newNode = new Node(value);
        newNode.next = tail.next;
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        length++;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }

    public void getHead() {
        System.out.println("Head: " + (head == null? " ": head.getValue()));
    }

    public void getTail() {
        System.out.println("Tail: " + (tail == null? "" : tail.getValue()));
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}

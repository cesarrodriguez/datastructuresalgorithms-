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

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

package com.datastructure.linkedlist.contructor;

// LinkedList Node, that class should become nested class in Linkedlist class
public class Node {
    // Node Value
    private int value;
    //Pointer to next value
    private Node next;

    public Node(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Value: " + value;
    }
}

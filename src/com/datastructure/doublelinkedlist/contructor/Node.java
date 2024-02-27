package com.datastructure.doublelinkedlist.contructor;

// LinkedList Node, that class should become nested class in Linkedlist class
public class Node {
    // Node Value
     int value;
    //Pointer to next value
     Node next;

     Node prev;

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

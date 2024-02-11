package com.datastructure.linkedlist.contructor;

//LinkedList Class, responsable to Store and management Nodes
public class LinkedList {
    //Head pointer
    private Node head;
    //Tail pointer
    private Node tail;
    //And lenght LinkedList
    private int length;
    public LinkedList(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }

    // append - add in the last Node.
    public void append(int value){
        Node node = new Node(value);
        if(length == 0){
            head = node;
        } else {
            Node nodeTail = tail;
            nodeTail.setNext(node);
        }
        tail = node;
        length++;
    }

    public void getHead() {
        System.out.println("Head: " + head.getValue());
    }

    public void getTail() {
        System.out.println("Tail: " + tail.getValue());
    }

    public void getLenght() {
        System.out.println("Length: " + length);
    }
}

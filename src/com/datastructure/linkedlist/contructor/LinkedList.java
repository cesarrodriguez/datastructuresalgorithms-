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

    public void getHead() {
        System.out.println("Head: " + head.getValue());
    }

    public void getTail() {
        System.out.println("Tail: " + head.getValue());
    }

    public void getLenght() {
        System.out.println("Length: " + length);
    }
}

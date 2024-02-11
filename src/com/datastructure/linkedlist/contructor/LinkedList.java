package com.datastructure.linkedlist.contructor;

//LinkedList Class, responsable to Store and management Nodes
public class LinkedList {
    //Head pointer
    private Node head;
    //Tail pointer
    private Node tail;
    //And lenght LinkedList
    private int lenght;
    public LinkedList(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        lenght = 1;
    }
}

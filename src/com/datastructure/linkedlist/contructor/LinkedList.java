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

    // append - add in the last Node. O(1)
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

    // RemoveLast  - Remove The Last Node - O(N)
    public void removeLast(){

        if(length == 0){
            return;
        }

        Node preNode = head;
        Node temp = head;
        while(temp.getNext() != null){
            preNode =  temp;
            temp = temp.getNext();
        }
        tail = preNode;
        tail.setNext(null);
        length --;

        if(length == 0){
           head = null;
           tail = null;
        }
    }

    //Prepend - add a new node in first in LinkedList O(1)
    public void prepend(int value){
        Node node = new Node(value);
        if(length == 0){
          tail = node;
        } else {
            node.setNext(head);
        }
        head = node;
        length++;
    }

    public Node removeFirst(){
        if(length == 0){
            return null;
        }
        Node temp = head;
        if(head.getNext() == null){
            head = null;
            tail = null;
        }else{
            head = head.getNext();
        }
        length --;
        return temp;
    }

    public void getHead() {
        System.out.println("Head: " + (head == null? " ": head.getValue()));
    }

    public void getTail() {
        System.out.println("Tail: " + (tail == null? "" : tail.getValue()));
    }

    public void getLenght() {
        System.out.println("Length: " + length);
    }
}

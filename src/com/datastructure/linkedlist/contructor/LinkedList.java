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

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }
    public boolean insert(int index, int value){

        if(index < 0  || index >= length){
            return false;
        }
        if(index == 0){
            prepend(value);
            return true;
        }

        if(index == length){
            append(value);
            return true;
        }

        Node node = new Node(value);
        Node preNode = get(index-1);
        Node temp = preNode.getNext();
        node.setNext(temp);
        preNode.setNext(node);
        length++;
        return true;
    }

    public boolean set(int index, int value){
        Node indexedNode = get(index);
        if(indexedNode != null){
            indexedNode.setValue(value);
            return true;
        }
        return false;
    }
    public Node get(int index){
        if(index < 0  || index >= length){
            return null;
        }
        if(index == 0){
            return head;
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.getNext();
        }
        return temp;
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

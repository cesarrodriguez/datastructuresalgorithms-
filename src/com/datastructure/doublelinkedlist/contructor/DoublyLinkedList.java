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
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = tail.next;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;

    }

    public Node removeLast(){
        if(length == 0){
            return null;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = temp.next;
        temp.prev = null;
        length--;

        if(length == 0){
            head = null;
            tail = null;
        }

        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.prev = head.prev;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        Node temp = head;
        if(length == 0){
            return null;
        }
        if(length-1 == 0){
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        if(index > length/2 ){
            temp = tail;
            for(int i = (length-1); i > index; i--){
                temp = temp.prev;
            }
            return temp;
        }
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;

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

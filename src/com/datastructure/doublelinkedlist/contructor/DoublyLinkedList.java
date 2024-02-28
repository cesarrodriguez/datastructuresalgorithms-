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
        if(length == 1){
            tail = null;
            head = null;
        } else {
            tail.prev.next = null;
            tail = tail.prev;
            temp.prev = null;
        }
        length--;
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
        if(index < 0 || index > (length -1)){
            return null;
        }

        if(index == 0){
            return head;
        }

        if(index == (length -1)){
            return tail;
        }

        Node temp = head;

        if(index < length/2){
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
        }else{
            temp = tail;
            for(int i = (length-1); i >  index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
    public boolean insert(int index, int value) {
        if(index < 0 || index > length){
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

        Node newNode = new Node(value);
        Node before = get(index-1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }


    public Node remove(int index) {
        if(index < 0 || index > length){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }
        if(index == length-1){
            return removeLast();
        }

        Node current = get(index);
        current.next.prev = current.prev;
        current.prev.next = current.next;
        current.next = null;
        current.prev = null;
        length--;

        return current;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }

    public void reverse(){
        if(length < 2){
            return;
        }
        Node temp = tail;
        Node after = null;
        for(int i = 0; i < length; i++){
            Node before = temp.prev;
            Node current = temp;
            current.next = before;
            current.prev = after;
            after = current;
            temp = before;
        }
        head = tail;
        tail = after;
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

package com.datastructure.linkedlist.contructor;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLenght();
        linkedList.print();

        linkedList.removeLast();

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLenght();
        linkedList.print();

        linkedList.prepend(10);

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLenght();
        linkedList.print();

        linkedList.removeFirst();

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLenght();
        linkedList.print();


        System.out.println(linkedList.get(2));

    }
}

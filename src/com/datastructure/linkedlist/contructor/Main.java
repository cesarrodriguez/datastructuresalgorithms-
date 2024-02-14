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


        System.out.println(linkedList.get(-1));

        System.out.println(linkedList.set(1, 100));

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLenght();
        linkedList.print();


        System.out.println(linkedList.insert(1, 1000));

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLenght();
        linkedList.print();


        System.out.println(linkedList.remove(1));

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLenght();
        linkedList.print();

        linkedList.reverse();

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLenght();
        linkedList.print();

    }
}

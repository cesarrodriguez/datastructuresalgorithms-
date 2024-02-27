package com.datastructure.doublelinkedlist.contructor;

public class Main {
    public static void main(String[] args) {

        System.out.println("Start a new Contructor =========== \n");
        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.print();
        System.out.println("");
        System.out.println("Append a value ==================== \n");
        myDLL.append(6);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.print();

        System.out.println("");
        System.out.println("Remove Last value ================== \n");

        Node nodeRemoved = myDLL.removeLast();
        System.out.println("Node Removed: " + nodeRemoved);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.print();


        System.out.println("");
        System.out.println("Prepend value ================== \n");

        myDLL.prepend(8);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.print();

        System.out.println("");
        System.out.println("Remove First value ================== \n");
        myDLL.removeFirst();
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.print();

        System.out.println("");
        System.out.println("Remove First value ================== \n");
        myDLL.removeFirst();
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.print();

        System.out.println("");
        System.out.println("Append value ================== \n");
        myDLL.append(0);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.print();
        System.out.println("");
        System.out.println("Append value ================== \n");
        myDLL.append(1);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.print();
        System.out.println("");
        System.out.println("Append value ================== \n");
        myDLL.append(2);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.print();
        System.out.println("");
        System.out.println("Append value ================== \n");
        myDLL.append(3);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.print();

        System.out.println("");
        System.out.println("RAppend value ================== \n");
        myDLL.append(4);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.print();

        System.out.println("");
        System.out.println("GET Greater then half length value ================== \n");
        System.out.println(myDLL.get(4).getValue());
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.print();

        System.out.println("");
        System.out.println("GET Less then half length value ================== \n");
        System.out.println(myDLL.get(0).getValue());
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.print();

    }
}

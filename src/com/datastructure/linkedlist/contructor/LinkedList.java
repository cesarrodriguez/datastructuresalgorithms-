package com.datastructure.linkedlist.contructor;

//LinkedList Class, responsable to Store and management Nodes
public class LinkedList {
    //Head pointer
     Node head;
    //Tail pointer
     Node tail;
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

    public void reverse(){
        Node current = head;
        Node next = head.getNext();
        Node prev = null;
        for(int i = 0; i < length; i++){
            current.setNext(prev);
            prev = current;
            current = next;
            next = current == null? null: current.getNext();
        }
        Node temp = tail;
        tail = head;
        head = temp;

    }
    public boolean insert(int index, int value){

        if(index < 0  || index > length){
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

    public Node remove(int index){
        if(index < 0  || index >= length){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }

        if(index == (length-1)){
            return removeLast();
        }
        Node prevNode = get(index-1);
        Node currentNode = prevNode.getNext();
        prevNode.setNext(currentNode.getNext());
        currentNode.setNext(null);
        length --;
        return currentNode;
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
    public Node removeLast(){

        if(length == 0){
            return null;
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
        return tail;
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

    public void partitionList(int x){

        //Check if head is null.
        if (head == null) {
            return;
        }
        //Create two dummy nodes, dummy1 and dummy2, and initialize two pointers,
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);

        //prev1 and prev2, pointing to these dummy nodes respectively.
        Node prev1 = dummy1;
        Node prev2 = dummy2;

        //Initialize a pointer current pointing to the head of the list.
        Node current = head;

        //while loop that continues until current is null
        while (current != null) {
         //4
         // 1 -> 2 -> 4 -> 3 -> 7 -> 10 -> 5 -> null
        //Check if the value of the current node is less than the given value x
            if (current.value < x) {
        //If it is, update the next pointer of prev1 to point to current, and update prev1 to point to current.
                prev1.next = current;
                prev1 = current;
        //If it is not, update the next pointer of prev2 to point to current, and update prev2 to point to current.
            } else {
                prev2.next = current;
                prev2 = current;
            }
        //Move current one step ahead (i.e., current = current.next)
            current = current.next;
        }
        //Set the next pointer of prev2 to null, which terminates the second partition.
        prev2.next = null;
        //Set the next pointer of prev1 to the first node of the second partition (i.e., prev1.next = dummy2.next).
        prev1.next = dummy2.next;
        //Update the head of the list to the first node of the first partition (i.e., head = dummy1.next).
        head = dummy1.next;
    }

    public void removeDuplicates(){

        if(head == null){
            return;
        }

        Node fast = head;
        Node slow = head;
        while (slow != null) {
            while (fast.next != null) {
                if (slow.value == fast.next.value) {
                    Node temp = fast.next;
                    fast.next = fast.next.next;
                    temp.next = null;
                    continue;
                }
                fast = fast.next;
            }
            slow = slow.next;
            fast = slow;
        }
    }

    public int binaryToDecimal(){

        if(head == null){
            return 0;
        }
        int num = 0;
        Node temp = head;

        while (temp != null){
            num = num * 2 + temp.value;
            temp = temp.next;
        }

        return num;
    }

    public void reverseBetween(int startIndex, int endIndex) {
        if (head == null) return;

        // Dummy node to begin point
        Node dummyNode = new Node(0);
        // store begin point
        dummyNode.next = head;
        // Now dummy node is a first/previous value
        Node previousNode = dummyNode;

        //perform a loop even a value before Start Index
        for (int i = 0; i < startIndex; i++) {
            previousNode = previousNode.next;
        }

        // Current Node is a first Node to reverse
        Node currentNode = previousNode.next;
        //Interate just nodes to reverse
        for (int i = 0; i < endIndex - startIndex; i++) {
            // Node to move have after value;
            Node nodeToMove = currentNode.next;
            // current node has after value Node to move (after -> after (next.next))
            currentNode.next = nodeToMove.next;
            // now Node to move next has a "current node"
            nodeToMove.next = previousNode.next;
            // "Current Node" has a Node to move
            previousNode.next = nodeToMove;
        }
        // finally head point to new/or same node.
        head = dummyNode.next;
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

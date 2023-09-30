package com._9LinkedList;

class Node5{
    int data;
    Node5 next;
    Node5(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList5{
    Node5 head;
    void add(int e){
        Node5 temp = new Node5(e);
        if(head == null){
            head = temp;
        }
        else{
            Node5 current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = temp;
        }
    }
    void removeLast(){
        if(head == null){  //zero elt

        }
        else if (head.next == null) {   //one elt
            head = null;
        }
        else{   //more than one elt
            Node5 current = this.head;
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }
    }
    void printLinkedList(){
        Node5 current = this.head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}

public class _5RemoveLastElt {
    public static void main(String[] args) {
        LinkedList5 ll = new LinkedList5();
        ll.add(23);
//        ll.add(76);
//        ll.add(35);
//        ll.add(46);
        ll.printLinkedList();
        System.out.println("---------------------");

        ll.removeLast();
        ll.printLinkedList();
    }
}

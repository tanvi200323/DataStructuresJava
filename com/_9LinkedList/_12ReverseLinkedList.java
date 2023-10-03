package com._9LinkedList;

class Node12{
    int data;
    Node12 next;
    Node12(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList12{
    Node12 head;
    void add(int e){
        Node12 temp = new Node12(e);
        if(head == null){
            head = temp;
        }
        else{
            Node12 current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = temp;
        }
    }
    void reverse(){
        Node12 current = this.head;
        Node12 previous = null;
        while(current != null){
            Node12 temp = current.next;
            current.next = previous;
            //updation
            previous = current;
            current = temp;
        }
        head = previous;
    }

    void printLinkedList(){
        Node12 current = this.head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
public class _12ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList12 ll = new LinkedList12();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.printLinkedList();
        System.out.println("After reversing: ");
        ll.reverse();
        ll.printLinkedList();
    }
}

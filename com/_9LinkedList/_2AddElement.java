package com._9LinkedList;

class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList2{
    Node2 head;
    void add(int e){
        Node2 temp = new Node2(e);
        if(head == null){ //if head is empty, it will point to temp
            head = temp;
        }
        else{
            Node2 current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = temp;   //current is pointing to the last node
        }
    }

    void printLinkedList(){
        Node2 current = this.head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
public class _2AddElement {
    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.add(140);
        ll.add(230);
        ll.add(130);
        ll.add(42);
        ll.add(454);

        ll.printLinkedList();
    }
}

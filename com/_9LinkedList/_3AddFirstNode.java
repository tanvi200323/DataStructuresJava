package com._9LinkedList;

class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList3{
    Node3 head;
    void add(int e){
        Node3 temp = new Node3(e);
        if(head == null){
            head = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
    }
    void printLinkedList(){
        Node3 current = this.head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
public class _3AddFirstNode {
    public static void main(String[] args) {
        LinkedList3 ll = new LinkedList3();
        ll.add(23);
        ll.add(34);

        ll.printLinkedList();
    }
}

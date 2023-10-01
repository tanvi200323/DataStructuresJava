package com._9LinkedList;

class Node8{
    int data;
    Node8 next;
    Node8(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList8{
    Node8 head;
    void add(int e){
        Node8 temp = new Node8(e);
        if(head == null){
            head = temp;
        }
        else{
            Node8 current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = temp;
        }
    }
    void removeFirst(){
        if(head == null){  //0 elt

        }
        else if (head.next == null) { //1 elt
            head = null;
        }
        else{
            Node8 current = this.head;
            head = head.next;
            current.next = null;   //taki voh bhi abhi tk next ko point na krta rhe head k sath sath
        }
    }
    void printLinkedList(){
        Node8 current = this.head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
public class _8RemoveFirstElt {
    public static void main(String[] args) {
        LinkedList8 ll = new LinkedList8();
        ll.add(34);
        ll.add(45);
        ll.add(87);
        ll.printLinkedList();
        System.out.println("-----------");

        ll.removeFirst();
        ll.printLinkedList();
    }
}

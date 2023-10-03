package com._9LinkedList;

class Node11{
    int data;
    Node11 next;
    Node11 previous;
    Node11(int data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

class DoublyLinkedList1{
    Node11 head;
    Node11 tail;
    void add(int e){
        Node11 temp = new Node11(e);
        if(head == null){   //obvio tail bhi null ko hi krega fir
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            temp.previous = tail;
            tail = temp;
        }
    }
    void printDoublyLL(){
        Node11 current = this.head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
public class _11DoublyLL_AddElt {
    public static void main(String[] args) {
        DoublyLinkedList1 dl = new DoublyLinkedList1();
        dl.add(51);
        dl.add(58);
        dl.add(44);

        dl.printDoublyLL();
    }
}

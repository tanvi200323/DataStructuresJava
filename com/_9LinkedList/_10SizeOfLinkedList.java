package com._9LinkedList;
class Node10{
    int data;
    Node10 next;
    Node10(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList10{
    Node10 head;
    void add(int e){
        Node10 temp = new Node10(e);
        if(head == null){
            head = temp;
        }
        else{
            Node10 current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = temp;
        }
    }
    int size(){
        Node10 current = this.head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;

    }
}
public class _10SizeOfLinkedList {
    public static void main(String[] args) {
        LinkedList10 ll = new LinkedList10();
        ll.add(23);
        ll.add(56);
        ll.add(87);
        ll.add(344);
        ll.add(67);

        System.out.println(ll.size());
    }
}

package com._9LinkedList;

class Node9{
    int data;
    Node9 next;
    Node9(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList9{
    Node9 head;
    void add(int e){
        Node9 temp = new Node9(e);
        if(head == null){
            head = temp;
        }
        else{
            Node9 current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = temp;
        }
    }
    void printLinkedList(){
        Node9 current = this.head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    int lastIndexOf(int e){
        int count = 0;
        int index = -1;
        Node9 current = this.head;
        while(current != null){
            if(current.data == e){
                index = count;
            }
            count++;
            current = current.next;
        }
        return index;
    }
}
public class _9LastIndexElt {
    public static void main(String[] args) {
        LinkedList9 ll = new LinkedList9();
        ll.add(23);
        ll.add(45);
        ll.add(45);
        ll.add(47);
        ll.printLinkedList();
        System.out.println("--------------");
        System.out.println(ll.lastIndexOf(45));
    }
}

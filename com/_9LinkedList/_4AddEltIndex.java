package com._9LinkedList;

class Node4{
    int data;
    Node4 next;
    Node4(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList4{
    Node4 head;
    void addFirst(int e){
        Node4 temp = new Node4(e);
        if(head == null){
            head = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
    }
    void add(int e){
        Node4 temp = new Node4(e);
        if(head == null){
            head = temp;
        }
        else{
            Node4 current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = temp;
        }
    }
    void add(int index, int e) throws ArrayIndexOutOfBoundsException{ //method overloading
        try{
            Node4 temp = new Node4(e);
            if(index == 0){
                addFirst(e);
            }
            else {
                Node4 current = this.head;
                int count = 0;
                while(count < index-1){
                    current = current.next;  //throws Null pointer excpetion if index is greater than elts present
                    //it should throw ArrayIndexOutOfBoundsException instead
                    count++;
                }
                temp.next = current.next;
                current.next = temp;
            }
        }
        catch (NullPointerException exception){
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    void printLinkedList(){
        Node4 current = this.head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
public class _4AddEltIndex {
    public static void main(String[] args) {
        LinkedList4 ll = new LinkedList4();
        ll.add(32);
        ll.add(45);
        ll.add(67);
        ll.add(560);

        ll.printLinkedList();
        System.out.println("------------------");

//        ll.add(10, 25);
        ll.add(3, 25);

        ll.printLinkedList();
    }
}

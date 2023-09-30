package com._9LinkedList;

import java.util.Scanner;

class Node6{
    int data;
    Node6 next;
    Node6(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList6{
    Node6 head;
    void add(int e){
        Node6 temp = new Node6(e);
        if(head == null){
            head = temp;
        }
        else{
            Node6 current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = temp;
        }
    }
    void addAll(int[] arr){
        for(int num : arr){
            add(num);
        }
    }
    void printLinkedList(){
        Node6 current = this.head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
public class _6AddAllElts {
    public static void main(String[] args) {
        LinkedList6 ll = new LinkedList6();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            ll.add(sc.nextInt());
        }
        ll.printLinkedList();
        System.out.println("---------------------");

        int[] arr = {54,26,77,45};
        ll.addAll(arr);
        ll.printLinkedList();
    }
}

package com._9LinkedList;

import java.util.Scanner;

class Node7{
    int data;
    Node7 next;
    Node7(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList7{
    Node7 head;
    void add(int e){
        Node7 temp = new Node7(e);
        if(head == null){
            head = temp;
        }
        else{
            Node7 current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = temp;
        }
    }
    void printLinkedList(){
        Node7 current = this.head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    int indexOf(int e){
        int count = 0;
        Node7 current = this.head;
        while(current != null){
            if(current.data == e){
                return count;
            }
            count++;
            current = current.next;
        }
        return -1;
    }
}
public class _7FindIndex {
    public static void main(String[] args) {
        LinkedList7 ll = new LinkedList7();
        Scanner sc = new Scanner(System.in);
        //ll.add(50);
        for(int i = 0; i<5; i++){
            ll.add(sc.nextInt());
        }
        ll.printLinkedList();
        System.out.println("---------------");
        System.out.println(ll.indexOf(50));;
    }
}

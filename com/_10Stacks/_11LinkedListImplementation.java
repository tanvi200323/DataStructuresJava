package com._10Stacks;

import java.util.List;

public class _11LinkedListImplementation {
    public static class Node{ //user-defined DATA TYPE
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static class LLStacks{
        private Node head = null;
        private int size = 0;
        void push(int num){
            Node temp = new Node(num);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayRev(){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.val + " ");
                curr = curr.next;
            }
            System.out.println();
        }

        void displayStack(){
            displayRecursively(head);
            System.out.println();
        }

        void displayRecursively(Node h){
            if(h == null){
                return;
            }
            displayRecursively(h.next);
            System.out.print(h.val + " ");  //piche se print krayega yeh function. Kamaal hai na?
        }
        int size(){  //getter
            return size;
        }
        int pop(){
            if(head == null){
                System.out.println(0);
                return -1;
            }
            int x = head.val; //value of the num to be popped
            head= head.next; //popping the num
            return x;
        }
        int peek(){
            if(head == null){
                System.out.println(0);
                return -1;
            }
            return head.val;
        }
        boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }

    }
    public static void main(String[] args) {
        LLStacks st = new LLStacks();
        st.push(4);
        st.displayStack(); //4
        st.push(5);
        st.displayStack(); //4 5
        st.push(1);
        st.displayStack(); //4 5 1
        System.out.println(st.size()); //3
        st.pop();
        st.displayStack(); //4 5
        System.out.println(st.size()); //2
        st.push(7); //4 5 7
        st.push(0); //4 5 7 0
    }

}

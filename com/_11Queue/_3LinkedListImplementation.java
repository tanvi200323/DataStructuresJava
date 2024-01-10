package com._11Queue;

public class _3LinkedListImplementation {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static class Linked_Queue{
        static ListNode head = null;
        static ListNode tail = null;
        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        public static void add(int data){
            ListNode temp = new ListNode(data);
            if(tail == null){ //one node
                head = tail = temp;
                return;
            }
            tail.next = temp;
            tail = temp;
        }
        public static int remove(){
            if(isEmpty()){ //Zero node
                System.out.println("Queue is empty");
                return -1;
            }
            int val_of_first = head.val;
            if(head == tail){ //one node
                tail = null;
            }
            head = head.next;
            return val_of_first;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }
        public static void display(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            ListNode curr = head;
            while(curr!= null){
                System.out.print(curr.val+" ");
                curr = curr.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Linked_Queue lq = new Linked_Queue();
        lq.add(1);
        lq.add(2);
        lq.add(3);
        lq.add(4);
        lq.display();
        System.out.println("-----");
        lq.remove();
        lq.display();
        System.out.println("-----");
        System.out.println(lq.peek());
        System.out.println("-----");
        System.out.println(lq.isEmpty());
    }
}

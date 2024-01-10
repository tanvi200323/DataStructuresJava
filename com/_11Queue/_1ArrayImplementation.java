package com._11Queue;
import java.util.*;

public class _1ArrayImplementation {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1;

        Queue(int size){
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty(){
            if(rear == -1){
                return true;
            }
            return false;
        }

        //enqueue
        public static void add(int data){
            if(rear == size-1){
                System.out.println("queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is full");
                return -1;
            }

            int result = arr[0]; //jo peek pe khda hai
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return result;
        }
        public static int front(){
            if(isEmpty()){
                System.out.println("queue is full");
                return -1;
            }
            int result = arr[0];
            return result;
        }

        public static void display(){
            if(isEmpty()){
                System.out.println("Queue is full");
                return;
            }
            for(int i=0; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println();

        q.remove();
        q.display();
        System.out.println();

        System.out.println(q.front());
    }
}

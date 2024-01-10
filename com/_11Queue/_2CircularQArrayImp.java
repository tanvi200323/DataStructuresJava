package com._11Queue;

public class _2CircularQArrayImp {
    static class CQueue{
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;
        CQueue(int size){
            arr = new int[size];
            this.size = size;
        }
        static boolean isEmpty(){
            if(rear == -1 && front == -1){
                return true;
            }
            return false;
        }
        static boolean isFull(){
            if((rear+1)%size == front){
                return true;
            }
            return false;
        }
        static void add(int data){ //O(n)
            if(isFull()){
                System.out.println("Queue is full !");
                return;
            }
            if(isEmpty()){ //1st elt add
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        static int remove(){  //O(1)
            if(isEmpty()){
                System.out.println("queue is full");
                return -1;
            }
            int result = arr[front];
            if(rear == front){ //single elt condition
                rear = front = -1; //deleted
            }
            else{
                front = (front+1)%size;
            }
            return result;
        }

        static int peek(){ //O(1)
            if(isEmpty()){
                System.out.println("queue is full");
                return -1;
            }
            return arr[front];
        }
        static void display(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            int curr = front; //front direct use ni krre kyuki front aage bhi chaiye isliye usko update ni kr skte hum
            while(curr != rear){
                System.out.print(arr[curr] + " ");
                curr = (curr+1)%size;
            }
            System.out.print(arr[rear]);
//            for(int i=0; i<=rear; i++){    NOT GONNA WORK KYUKI AB CIRCULAR BN CHUKA HAI
//                System.out.print(arr[i]+" ");
//            }
        }
    }
    public static void main(String[] args) {
        CQueue cq = new CQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.display();
        System.out.println();
        System.out.println("-----");
        System.out.println(cq.peek());
        System.out.println("-----");
        cq.remove();
        cq.remove();
        cq.display();
        System.out.println();
        cq.add(5);
        cq.add(6);
        System.out.println("----");
        cq.display();
    }
}

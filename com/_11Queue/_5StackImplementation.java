package com._11Queue;

import java.util.Stack;

public class _5StackImplementation { //using 2 Stacks
    public static class Queue_Stack{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty(); //inbuilt for stacks
        }
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }
            return s1.pop();
        }
        public static int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return s1.peek();
        }
        public static void display(){
            if(s1.isEmpty()){
                System.out.println("Queu is empty !");
                return;
            }
            Stack<Integer> temp = new Stack<>();
            while(!s1.isEmpty()){
                int top = s1.pop();
                System.out.print(top+" ");
                temp.push(top);
            }
            while(!temp.isEmpty()){
                s1.push(temp.pop());
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue_Stack s = new Queue_Stack();
        s.add(2);
        s.add(34);
        s.add(5);
        s.add(3);
        s.display();
        System.out.println("-----");
        s.remove();
        s.remove();
        s.display();
        System.out.println("-----");
        System.out.println(s.peek());
    }
}

package com._10Stacks;

import java.util.Stack;

public class _2StackClone {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Stack 1 : " + st);

        Stack<Integer> stack = new Stack<>();
        while(st.size()>0){
            stack.push(st.pop());
        }
        System.out.println("Reverse stack : " + stack);

        Stack<Integer> stack1 = new Stack<>();
        while(stack.size()>0){
            stack1.push(stack.pop());
        }
        System.out.println("Clone stack : " + stack1);
    }
}

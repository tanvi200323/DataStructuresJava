package com._10Stacks;

import java.util.Stack;

public class _9ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    static void reverse(Stack<Integer> st){
        if(st.size() == 1){
            return;
        }
        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }
    static void pushAtBottom(Stack<Integer> st, int x){
        if(st.size() == 0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,x);
        st.push(top); // pushing back all items after pushing the num at the bottom
    }
}

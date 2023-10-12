package com._10Stacks;

import java.util.Stack;

public class _4InsertAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        int index = 2;
        int num = 11;
        Stack<Integer> st2 = new Stack<>();
        while(st.size()>index){
            st2.push(st.pop());
        }
        //add elt at index
        st.push(num);

        //add all elts back to first one
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);

    }
}

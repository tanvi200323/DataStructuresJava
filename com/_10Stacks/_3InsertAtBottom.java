package com._10Stacks;

import java.util.Stack;

public class _3InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        //add elt at the bottom:
        Stack<Integer> st2 = new Stack<>();
        while(st.size()>0){
            st2.push(st.pop());
        }
        System.out.println(st2);
        //now add elt u want to add:
        st2.add(0);

        //now add elts back to first stack
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);
    }
}

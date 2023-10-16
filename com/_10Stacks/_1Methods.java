package com._10Stacks;

import java.util.Stack;

public class _1Methods {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        //add elt
        st.push(23);
        st.push(12);
        st.push(34);
        st.push(2);
        st.push(45);
        st.push(56);

        //print top elt
        System.out.println(st.peek());
        System.out.println("----------");

        //remove elt
        System.out.println(st.pop());
        System.out.println("----------");

        //size of stack
        System.out.println(st.size());
        System.out.println("----------");

        //search elt
        System.out.println(st.search(12));
        System.out.println("----------");

        //empty or not
        System.out.println(st.empty());
        System.out.println("___________________________");

        //print first elt (added first)
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println("----------");



    }
}

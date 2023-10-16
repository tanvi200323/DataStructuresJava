package com._10Stacks;

import java.util.Stack;

public class _8RemoveFromBottom_AnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        int index = 2;

        while(st.size() > index + 1){
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println(st);

    }
}

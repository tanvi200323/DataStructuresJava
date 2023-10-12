package com._10Stacks;

import java.util.Stack;

public class _5DisplayReverseStackRecursively {
    public static void display(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top = st.pop();
        System.out.print(top+" ");
        display(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        display(st);
        System.out.println();
        System.out.println(st);

    }
}

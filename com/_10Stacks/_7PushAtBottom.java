package com._10Stacks;
import java.util.Stack;

public class _7PushAtBottom {
    public static void push(Stack<Integer> st, int num){
        if(st.size() == 0){
            st.push(num);
            return;
        }
        int top = st.pop();
        push(st,num);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        int num = 10;
        push(st,num);
        System.out.println(st);
    }
}

package com._10Stacks;
import java.util.*;

public class _13StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;
        int[] span = fun(price, n);
        System.out.println(Arrays.toString(span));
    }

    public static int[] fun(int[] price, int n) {
        int[] span = new int[n];
        span[0] = 1;

        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }
}

package com._10Stacks;
import java.util.*;

public class _14HistoGramArea {
    public static void main(String[] args) {
        int[] h = {2, 1, 5, 6, 2, 3};
        int maxArea = Area(h);
        System.out.println("Largest Rectangle Area: " + maxArea);
    }
    public static int Area(int[] h){
        if(h==null || h.length==0){
            return 0;
        }
        int n = h.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && h[st.peek()] >= h[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i] = 0;
            }
            else{
                left[i] = st.peek()+1;
            }
            st.push(i);
        }

        st.clear();

        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && h[st.peek()] >= h[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i] = n-1;
            }
            else{
                right[i] = st.peek()-1;
            }
            st.push(i);
        }

        int maxArea=0;
        for(int i=0; i<n; i++){
            int area = (right[i]-left[i]+1)*h[i];
            maxArea = Math.max(maxArea,area);
        }

        return maxArea;
    }
}

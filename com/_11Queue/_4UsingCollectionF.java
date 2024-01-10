package com._11Queue;
import java.util.*;

public class _4UsingCollectionF {
    public static void main(String[] args) {
//        Queue<Integer> q = new Queue<>();  --> BCOZ QUEUE IS AN INTERFACE, SO WE CAN'T INSTANTIATE IT
//        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
    }
}

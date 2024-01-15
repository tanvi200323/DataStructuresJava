package com._14Trees._1BinaryTree;

import java.util.*;

class Node15 {
    int val;
    Node15 left;
    Node15 right;
    Node15(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _15BurningTImeOfTree {
    static Node15 buildTree(){
        Node15 root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:" );
        int val= sc.nextInt();
        if(val==-1){
            return null;
        }
        root = new Node15(val);

        System.out.println("Enter left of "+val);
        root.left = buildTree();
        System.out.println("Enter right of "+val);
        root.right = buildTree();

        return root;
    }
    static HashMap<Node15, Node15> map= new HashMap<>();
    static Node15 parentMapping(Node15 root, int start){
        Queue<Node15> q = new LinkedList<>();
        q.add(root);
        Node15 target = null;

        while(!q.isEmpty()){
            int n = q.size();

            for(int i=0; i<n; i++){
                Node15 curr = q.poll();
                if(curr.val == start){
                    target = curr;
                }
                if(curr.left != null){
                    map.put(curr.left, curr);
                    q.add(curr.left);
                }
                if(curr.right != null){
                    map.put(curr.right, curr);
                    q.add(curr.right);
                }
            }
        }
        return target;
    }
    static int burningTime(Node15 target){
        Queue<Node15> q = new LinkedList<>();
        Map<Node15, Integer> visited = new HashMap<>();

        q.add(target);
        visited.put(target, 1);
        int time = 0;

        while(!q.isEmpty()){
            int n = q.size();
            boolean flag = false;
            for(int i=0; i<n; i++){
                Node15 curr = q.poll();
                if(curr.left != null && visited.get(curr.left) == null){
                    visited.put(curr.left, 1);
                    q.add(curr.left);
                    flag = true;
                }
                if(curr.right != null && visited.get(curr.right) == null){
                    visited.put(curr.right, 1);
                    q.add(curr.right);
                    flag = true;
                }
                if(map.get(curr) != null && visited.get(map.get(curr)) == null){
                    visited.put(map.get(curr), 1);
                    q.add(map.get(curr));
                    flag = true;
                }
            }
            if(flag == true){
                time++;
            }
        }
        return time;
    }
    public static void main(String[] args) {
        Node15 root = buildTree();
        Node15 targetNode = parentMapping(root,2);
        int burningTime = burningTime(targetNode);
        System.out.println(burningTime);
    }
}

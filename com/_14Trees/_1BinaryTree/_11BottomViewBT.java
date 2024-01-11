package com._14Trees._1BinaryTree;

import java.util.*;

class Node11 {
    int val;
    Node11 left;
    Node11 right;
    Node11(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _11BottomViewBT {
    public static class Pair{
        int hd;
        Node11 node;
        public Pair(int hd, Node11 node){
            this.hd = hd;
            this.node = node;
        }
    }
    static Node11 buildTree(){
        Node11 root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:" );
        int val= sc.nextInt();
        if(val==-1){
            return null;
        }
        root = new Node11(val);

        System.out.println("Enter left of "+val);
        root.left = buildTree();
        System.out.println("Enter right of "+val);
        root.right = buildTree();

        return root;
    }
    static ArrayList<Integer> bottomView(Node11 root){
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();

        q.add(new Pair(0, root));

        while (!q.isEmpty()){
            Pair curr = q.poll();

            map.put(curr.hd, curr.node.val); //will update automatically

            if(curr.node.left != null){
                q.add(new Pair(curr.hd-1, curr.node.left));
            }
            if(curr.node.right != null){
                q.add(new Pair(curr.hd+1, curr.node.right));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;
    }
    public static void main(String[] args) {
        Node11 root = buildTree();
        System.out.println(bottomView(root));
    }
}

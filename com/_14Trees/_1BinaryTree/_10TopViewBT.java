package com._14Trees._1BinaryTree;

import java.lang.reflect.Parameter;
import java.util.*;

class Node10{
    int val;
    Node10 left;
    Node10 right;
    Node10(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _10TopViewBT {
    static Node10 buildTree(){
        Node10 root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int val = sc.nextInt();
        if(val == -1){
            return null;
        }
        root = new Node10(val);
        System.out.println("Enter left of "+val);
        root.left = buildTree();
        System.out.println("Enter right of "+val);
        root.right = buildTree();

        return root;
    }
    public static class Pair{
        int hd;
        Node10 node;
        public Pair(int hd, Node10 node){
            this.node = node;
            this.hd = hd;
        }
    }
    static ArrayList<Integer> topView(Node10 root){
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();

        q.add(new Pair(0, root));

        while (!q.isEmpty()){
            Pair curr = q.poll();
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node.val);
            }
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
        Node10 root = buildTree();
        System.out.println(topView(root));
    }
}

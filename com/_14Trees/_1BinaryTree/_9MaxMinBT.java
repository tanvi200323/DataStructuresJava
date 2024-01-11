package com._14Trees._1BinaryTree;

import java.util.Scanner;

class Node9 {
    int val;
    Node9 left;
    Node9 right;
    Node9(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _9MaxMinBT {
    static Node9 buildTree(){
        Node9 root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int val = sc.nextInt();
        if(val == -1){
            return null;
        }
        root = new Node9(val);
        System.out.println("Enter left of "+val);
        root.left = buildTree();
        System.out.println("Enter right of "+val);
        root.right = buildTree();

        return root;
    }
    static int max(Node9 root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }
    static int min(Node9 root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }
    public static void main(String[] args) {
        Node9 root = buildTree();
        System.out.println(max(root));
        System.out.println(min(root));
    }
}
